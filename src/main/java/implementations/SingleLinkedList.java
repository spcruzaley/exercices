package implementations;

import java.util.EmptyStackException;

public class SingleLinkedList<T> {

    private Node<T> head;
    private Node<T> currentNode;
    private int size = 0;

    public SingleLinkedList() {
        head = new Node<T>();
        head.next = null;
        head.value = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T value) {
        if(head.value == null) {
            head = new Node<T>();
            head.next = null;
            head.value = value;
        } else {
            Node newNode = new Node();
            newNode.next = null;
            newNode.value = value;

            if(this.currentNode == null) {
                this.currentNode = newNode;
                this.head.next = newNode;
            } else {
                this.currentNode.next = newNode;
                this.currentNode = newNode;
            }
        }

        this.size += 1;
    }

    public T first() {
        return head.value;
    }

    public T current() {
        return currentNode.value;
    }

    public void remove() {
        if(isEmpty())
            throw new EmptyStackException();

        if(size() == 1) {
            head = null;
            currentNode = null;
            size = 0;
        }

        currentNode = getPreviousNode();
        size -= 1;
    }

    private Node getPreviousNode() {
        Node headNode = head;
        Node previousNode = head;
        int currentNode = 1;

        while (headNode.next != null) {
            if(currentNode++ == size() - 1) {
                previousNode = headNode.next;
                break;
            }
        }

        return previousNode;
    }

}

class Node<T> {
    Node next;
    T value;

    public Node() {
    }
}