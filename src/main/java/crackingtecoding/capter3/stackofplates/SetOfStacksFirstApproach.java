package crackingtecoding.capter3.stackofplates;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacksFirstApproach {

    private List<Stack<Integer>> stackList = new ArrayList<>();
    private int maxStackCapacity;

    public static void main(String[] args) {
        SetOfStacksFirstApproach setOfStacks = new SetOfStacksFirstApproach(2);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        System.out.println(setOfStacks.toString());
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(7);
        System.out.println(setOfStacks.toString());
        setOfStacks.pop();
        System.out.println(setOfStacks.toString());
        setOfStacks.pop();
        System.out.println(setOfStacks.toString());
        setOfStacks.pop();
        System.out.println(setOfStacks.toString());
    }

    public SetOfStacksFirstApproach(int maxStackCapacity) {
        this.maxStackCapacity = maxStackCapacity;
    }

    public void push(int value) {
        int listSize = stackList.size();
        pushAtIndex(value, listSize);
    }

    private void pushAtIndex(int value, int index) {
        if(stackList.size() == 0) {
            createSatck(value);
        } else {
            int listSize = stackList.size();
            if(stackList.get(listSize-1).size() >= maxStackCapacity) {
                createSatck(value);
            } else {
                stackList.get(listSize-1).push(value);
            }
        }
    }

    private void createSatck(int value) {
        Stack<Integer> stack = new Stack<>();
        stack.push(value);
        stackList.add(stack);
    }

    public int pop() {
        int listSize = stackList.size();
        Stack<Integer> stack = stackList.get(listSize-1);
        int value = stack.pop();

        if(stack.size() == 0) {
            stackList.remove(listSize-1);
        }

        return value;
    }

    @Override
    public String toString() {
        return "SetOfStacksFirstApproach{" +
                "stackList=" + stackList.toString() +
                '}';
    }
}