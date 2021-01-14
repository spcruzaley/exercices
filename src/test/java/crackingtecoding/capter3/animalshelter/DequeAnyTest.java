package crackingtecoding.capter3.animalshelter;

import org.junit.Assert;
import org.junit.Test;

public class DequeAnyTest {

    @Test
    public void addingOnlyCatsTest() {
        Animal expectedAnimal = new Cat("Cat 1");

        DequeAny dequeAny = buildWithAnimal("Cat", 3);
        Animal actualAnimal = dequeAny.getOldest();

        Assert.assertEquals(expectedAnimal.getName(), actualAnimal.getName());
    }

    @Test
    public void addingOnlyDogsTest() {
        Animal expectedAnimal = new Cat("Dog 1");

        DequeAny dequeAny = buildWithAnimal("Dog", 3);
        Animal actualAnimal = dequeAny.getOldest();

        Assert.assertEquals(expectedAnimal.getName(), actualAnimal.getName());
    }

    @Test
    public void addingCatsAndDogsTest() {
        Animal expectedAnimalOne = new Cat("Dog 1");
        Animal expectedAnimalTwo = new Cat("Cat 2");
        Animal expectedAnimalThree = new Cat("Cat 3");

        DequeAny dequeAny = buildWithCatsAndDogs();
        Animal actualAnimalOne = dequeAny.getOldest();
        Animal actualAnimalTwo = dequeAny.getOldest();
        Animal actualAnimalThree = dequeAny.getOldest();

        Assert.assertEquals(expectedAnimalOne.getName(), actualAnimalOne.getName());
        Assert.assertEquals(expectedAnimalTwo.getName(), actualAnimalTwo.getName());
        Assert.assertEquals(expectedAnimalThree.getName(), actualAnimalThree.getName());
    }

    private DequeAny buildWithCatsAndDogs() {
        DequeAny dequeAny = new DequeAny();

        dequeAny.addAnimal(new Dog("Dog 1"));
        dequeAny.addAnimal(new Dog("Cat 2"));
        dequeAny.addAnimal(new Dog("Cat 3"));
        dequeAny.addAnimal(new Dog("Dog 4"));
        dequeAny.addAnimal(new Dog("Cat 5"));

        return dequeAny;
    }

    private DequeAny buildWithAnimal(String name, int times) {
        DequeAny dequeAny = new DequeAny();

        for (int i = 1; i <= times; i++) {
            dequeAny.addAnimal(new Cat(name + " " + i));
        }

        return dequeAny;
    }

}
