package Trees;

public class Node {

    public Node right;
    public Node left;
    public Integer value;

    public Node() {
        this.value = null;
        this.left = null;
        this.right = null;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public boolean isLeave() {
        return value != null && left == null && right == null;
    }

    public void insert(Integer value) {
        if(this.value == null) {
            this.value = value;
        } else {
            if(value < this.value) {
                if(left == null) left = new Node();
                left.insert(value);
            } else {
                if(right == null) right = new Node();
                right.insert(value);
            }
        }
    }

    Node getElement(int value) {
        if(this.value == null) return null;
        if(this.value == value) return this;

        if(value < this.value) {
            if(this.left == null) return null;
            return this.left.getElement(value);
        } else {
            if(this.right == null) return null;
            return this.right.getElement(value);
        }
    }

    boolean exist(int value) {
        if(this.value == null) return false;
        if(this.value == value) return true;

        if(value < this.value) {
            if(this.left == null) return false;
            return this.left.exist(value);
        } else {
            if(this.right == null) return false;
            return this.right.exist(value);
        }
    }

    private void preorderImpl(String prefix) {
        if(this.value != null) {
            System.out.println(prefix + this.value);
            if(this.left != null)
                this.left.preorderImpl(prefix + ".");
            if(this.right != null)
                this.right.preorderImpl(prefix + ".");
        }
    }

    public void preorder() {
        preorderImpl("");
    }

    private void inorderImpl(String prefix) {
        if(this.value != null) {
            if(this.left != null)
                this.left.inorderImpl(prefix + ".");
            System.out.println(prefix + this.value);
            if(this.right != null)
                this.right.inorderImpl(prefix + ".");
        }
    }

    public void inorder() {
        inorderImpl("");
    }

    private void postorderImpl(String prefix) {
        if(this.value != null) {
            if(this.left != null)
                this.left.postorderImpl(prefix + ".");
            if(this.right != null)
                this.right.postorderImpl(prefix + ".");
            System.out.println(prefix + this.value);
        }
    }

    public void postorder() {
        postorderImpl("");
    }

    private Node minumum() {
        if (this.left != null && !this.left.isEmpty()) {
            return this.left.minumum();
        } else {
            return this;
        }
    }

    private void deleteImpl(Node node, int index) {
        if(node.left != null && node.right != null) {
            Node sustituto = this.right.minumum();
            node.value = sustituto.value;
            this.right.delete(sustituto.value);
        } else if(node.left != null || node.right != null) {
            Node sustituto = node.left != null ? node.left : node.right;
            node.value = sustituto.value;
            node.left = sustituto.left;
            node.right = sustituto.right;
        } else {
            node.value = null;
        }
    }

    public void delete(int index) {
        if(this.exist(index)) {
            Node node = getElement(index);

            if(node.value == index) {
                deleteImpl(node, index);
            } else {
                if(node.left != null && node.value < node.left.value) {
                    left.deleteImpl(node, index);
                } else if(node.right != null && node.value < node.right.value) {
                    right.deleteImpl(node, index);
                }
            }
        }
    }

    public void deletes(int index) {
        if(this.exist(index)) {
            Node node = getElement(index);
            Integer aux;

            if(node.isLeave()) {
                this.value = null;
            } else {
                if(node.left != null && node.left.value < index) {
                    aux = node.left.value;
                    node.left.value = index;
                    delete(aux);
                } else if(node.right != null && node.right.value < index) {
                    aux = node.right.value;
                    node.right.value = index;
                    delete(aux);
                }
            }
        }
    }

}
