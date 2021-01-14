package crackingtecoding.capter4.minimaltree;

import crackingtecoding.capter4.Node;
import org.junit.Test;

public class ProgramTest {

    /**
     * First test case with a possible solution, however the solution was wrong, I wanted to keep the wrong solution
     * just for historical progress
     */
    @Test
    public void testCreateBinarySearchTree_Wrong() {
        int[] array = new int[]{1,2,3,4,5,6};
        ProgramWrong program = new ProgramWrong();

        Node node = program.createBinaryTree(array);
        System.out.println(node);
    }

    @Test
    public void testCreateBinarySearchTree() {
        int[] array = new int[]{1,2,3,4,5,6};
        Program program = new Program();

        Node node = program.createBinaryTree(array);
        System.out.println(node);
    }

}
