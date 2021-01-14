package crackingtecoding.capter4;

public class CheckBalanced {

    public boolean isBalanced(Node node) {
        int all = isBalanced(node, 0, 0, 0);
        System.out.println("Final: " + all);

        return false;
    }

    private int isBalanced(Node n, int l, int r, int res) {
        if(n == null)
            return 0;

        isBalanced(n.left, l+1, r, res);
        isBalanced(n.right, l, r+1, res);

        res = Math.abs(l-r);
        System.out.println("L-"+l+" | R-"+r+" = " + res);
        return res;
    }

    public void preorder(Node node) {
        if(node == null)
            return;

        preorder(node.left);
        System.out.print(node.value + " - ");
        preorder(node.right);
    }
}
