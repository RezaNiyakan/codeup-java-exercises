import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] objects = new Person[3];

        objects[0] = new Person("Jack");
        objects[1] = new Person("Jim");
        objects[2] = new Person("Jose");

        for (int i = 0; i < 3; i++) {
            System.out.println(objects[i].getName());
        }

        Person newOne = new Person("Johnny");

        Person newTwo = new Person("Jameson");

        Person newThree = new Person("Jaeger");

        Person[] copy = ArraysExercises.addPerson(objects, newOne);

        Person[] copy2 = ArraysExercises.addPerson(objects, newThree);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i].getName());
        }
    }

    public static Person[] addPerson (Person[] objects, Person addNewOne) {

        Person[] copy = Arrays.copyOf(objects, objects.length + 1);

        copy[objects.length] = addNewOne;

        return copy;

        }

    }

