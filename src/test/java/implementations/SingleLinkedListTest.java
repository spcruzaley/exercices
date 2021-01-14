package implementations;

import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.mockito.ArgumentMatchers.anyInt;

public class SingleLinkedListTest {

    @Test
    public void testCreateSingleLinkedListEmpty() {
        int expectedSize = 0;

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        int actualSize = singleLinkedList.size();

        Assert.assertTrue(singleLinkedList.isEmpty());
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testCreateSingleLinkedListNotEmpty() {
        int expectedSize = 3;

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(anyInt());
        singleLinkedList.add(anyInt());
        singleLinkedList.add(anyInt());
        int actualSize = singleLinkedList.size();

        Assert.assertFalse(singleLinkedList.isEmpty());
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testCreateSingleLinkedListValidateHead() {
        int expectedHeadValue = 4;

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(4);
        singleLinkedList.add(1);
        singleLinkedList.add(8);
        int actualHeadValue = singleLinkedList.first();

        Assert.assertFalse(singleLinkedList.isEmpty());
        Assert.assertEquals(expectedHeadValue, actualHeadValue);
    }

    @Test
    public void testCreateSingleLinkedListValidateCurrent() {
        int expectedCurrentValue = 8;

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(4);
        singleLinkedList.add(1);
        singleLinkedList.add(8);
        int actualHeadValue = singleLinkedList.current();

        Assert.assertFalse(singleLinkedList.isEmpty());
        Assert.assertEquals(expectedCurrentValue, actualHeadValue);
    }

    @Test(expected = EmptyStackException.class)
    public void testCreateSingleLinkedListRemovingElementsWhenEmpty() {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.remove();
    }

    @Test
    public void testCreateSingleLinkedListRemovingElements() {
        int expectedSize = 2;

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(anyInt());
        singleLinkedList.add(anyInt());
        singleLinkedList.add(anyInt());
        singleLinkedList.remove();
        int actualSize = singleLinkedList.size();

        Assert.assertFalse(singleLinkedList.isEmpty());
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testCreateSingleLinkedListRemovingElementAndValidateCurrentValue() {
        int expectedValue = 3;

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(9);
        singleLinkedList.add(3);
        singleLinkedList.add(7);
        singleLinkedList.remove();
        int actualCurrentValue = singleLinkedList.current();

        Assert.assertFalse(singleLinkedList.isEmpty());
        Assert.assertEquals(expectedValue, actualCurrentValue);
    }

}
