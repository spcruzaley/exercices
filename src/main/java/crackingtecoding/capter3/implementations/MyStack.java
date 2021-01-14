package crackingtecoding.capter3.implementations;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.EmptyStackException;

public class MyStack<T> {

    private static final int MAX_DEFAULT=16;

    Object[] elements = new Object[MAX_DEFAULT];
    private int currentIndex = 0;

    public MyStack(T data) {
        elements[currentIndex++] = data;
    }

    //peek
    public Object peek() {
        if(elements.length == 0)
            throw new EmptyStackException();

        return elements[currentIndex-1];
    }

    //push
    public void push(T data) {
        if(currentIndex == MAX_DEFAULT)
            throw new StackOverflowError("Stack is full");
        elements[currentIndex++] = data;
    }

    //isEmpty
    public boolean isEmpty() {
        return currentIndex == 0;
    }

    //pop
    public Object pop() {
        if(currentIndex == 0)
            throw new EmptyStackException();
        Object element = elements[currentIndex-1];
        elements[currentIndex-1] = null;
        currentIndex--;

        return element;
    }

}

class MyStackImpl {

    public static void main(String[] args) {
        /*MyStack<String> myStack = new MyStack<>("Algo");
        System.out.println(myStack.peek());
        myStack.push("8");
        System.out.println(myStack.peek());
        myStack.push("1");
        System.out.println(myStack.peek());
        myStack.push("6");
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());*/
    }

}
