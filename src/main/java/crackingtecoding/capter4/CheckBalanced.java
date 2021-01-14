package crackingtecoding.capter4;

public class CheckBalanced {

    public boolean isBalanced(Node n) {
        int left = getMaxHeight(n.left);
        int right = getMaxHeight(n.right);

        return Math.abs(left-right) <= 1;
    }

    private int getMaxHeight(Node node) {
        if(node == null)
            return 0;

        return 1 + Math.max(getMaxHeight(node.left), getMaxHeight(node.right));
    }

}
