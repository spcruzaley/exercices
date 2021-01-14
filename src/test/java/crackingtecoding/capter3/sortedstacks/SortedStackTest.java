package crackingtecoding.capter3.sortedstacks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static utils.Misc.log;

public class SortedStackTest {

    @Test
    public void addingInSortOrderTest() {
        Stack<Integer> expectedStack = buildStackSorted(10);

        SortedStack actualStack = new SortedStack();
        actualStack.push(10);
        actualStack.push(9);
        actualStack.push(8);
        actualStack.push(7);
        actualStack.push(6);
        actualStack.push(5);
        actualStack.push(4);
        actualStack.push(3);
        actualStack.push(2);
        actualStack.push(1);

        log(expectedStack.toString());
        log(actualStack.toString());

        Assert.assertEquals(expectedStack.toString(), actualStack.toString());
    }

    @Test
    public void addingInNotSortedOrderTest() {
        Stack<Integer> expectedStack = buildStackSorted(10);

        SortedStack actualStack = new SortedStack();
        actualStack.push(1);
        actualStack.push(2);
        actualStack.push(3);
        actualStack.push(4);
        actualStack.push(5);
        actualStack.push(6);
        actualStack.push(7);
        actualStack.push(8);
        actualStack.push(9);
        actualStack.push(10);

        log(expectedStack.toString());
        log(actualStack.toString());

        Assert.assertEquals(expectedStack.toString(), actualStack.toString());
    }

    @Test
    public void addingInNotSortedOrderWithRandomTest() {
        Stack<Integer> expectedStack = buildStackSorted(10);

        SortedStack actualStack = new SortedStack();
        actualStack.push(6);
        actualStack.push(2);
        actualStack.push(8);
        actualStack.push(7);
        actualStack.push(1);
        actualStack.push(3);
        actualStack.push(9);
        actualStack.push(4);
        actualStack.push(5);
        actualStack.push(10);

        log(expectedStack.toString());
        log(actualStack.toString());

        Assert.assertEquals(expectedStack.toString(), actualStack.toString());
    }

    private Stack<Integer> buildStackSorted(int max) {
        Stack<Integer> stack = new Stack();
        for (int i = max; i > 0; i--) {
            stack.push(i);
        }

        return stack;
    }

}
