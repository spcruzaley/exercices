package crackingtecoding.capter3.sortedstacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class SortedStack {

    Stack<Integer> lowest, greatest;

    public SortedStack() {
        lowest = new Stack<>();
        greatest = new Stack<>();
    }

    public boolean isEmpty() {
        return lowest.isEmpty();
    }

    public int peek() {
        return lowest.peek();
    }

    public int pop() {
        if(lowest.isEmpty())
            throw new EmptyStackException();

        return lowest.pop();
    }

    public void push(int value) {
        if(lowest.isEmpty()) {
            lowest.push(value);
        } else {
            if(value < lowest.peek()) {
                lowest.push(value);
            } else {
                do {
                    if(lowest.peek() < value) {
                        greatest.push(lowest.pop());
                    } else {
                        greatest.push(value);
                        value = lowest.pop();
                    }
                } while(!lowest.isEmpty());

                greatest.push(value);
                moveToLowest();
            }
        }
    }

    public void moveToLowest() {
        while(!greatest.isEmpty()) {
            lowest.push(greatest.pop());
        }
    }

    @Override
    public String toString() {
        return lowest.toString();
    }
}
