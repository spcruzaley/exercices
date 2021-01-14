package crackingtecoding.capter3.animalshelter;

import java.util.LinkedList;

public class DequeAny {
    LinkedList<Cat> catLinkedList;
    LinkedList<Dog> dogLinkedList;
    private int old;

    public DequeAny() {
        this.catLinkedList = new LinkedList<>();
        this.dogLinkedList = new LinkedList<>();
    }

    public void addAnimal(Animal animal) {
        if(animal instanceof Cat) {
            catLinkedList.add((Cat) animal);
        } else if(animal instanceof Dog) {
            dogLinkedList.add((Dog) animal);
        }

        animal.setOld(old);
        old++;
    }

    public Animal getOldest() {
        if(catLinkedList.isEmpty() && dogLinkedList.isEmpty()) {
            return null;
        } else if(catLinkedList.isEmpty()) {
            return dogLinkedList.pollFirst();
        } else if(dogLinkedList.isEmpty()) {
            return catLinkedList.pollFirst();
        } else {
            if(catLinkedList.getLast().getOld() > dogLinkedList.getLast().getOld()) {
                return catLinkedList.pollFirst();
            } else {
                return dogLinkedList.pollFirst();
            }
        }
    }

}
