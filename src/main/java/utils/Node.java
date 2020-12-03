package utils;

public class Node {

    Node next;
    Integer data;

    public Node(int data) {
        next = null;
        this.data = data;
    }

    public Integer peek() {
        return this.data;
    }

    public Node next() {
        if(this.next != null) {
            return this.next;
        }
        return null;
    }

    public void add(Integer data) {
        Node newNode = new Node(data);

        Node current = this;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void remove() {
        if(this.next != null) {
            Node temp = this.next;
            this.data = temp.data;
            this.next = temp.next;
        } else {
            this.data = null;
            this.next = null;
        }
    }

    public void remove(int element) {
        Node n = this;
        while(n != null) {
            if(n.data == element) {
                Node tmp = n.next;
                n.data = tmp.data;
                n.next = tmp.next;
                break;
            }
            n = n.next;
        }
    }

    @Override
    public String toString() {
        Node n = this;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (n != null) {
            builder.append(n.data);
            builder.append(",");
            n = n.next;
        }
        builder.deleteCharAt(builder.length()-1);
        builder.append("]");

        return builder.toString();
    }
}
