package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        // Demo with single objects:
        Person person1 = new Person(1, 28,"Bob");
        Person person2 = new Person(2, 33,"Mike");

        try (FileOutputStream fos = new FileOutputStream("Serialization/persons.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person1);
            oos.writeObject(person2);

        } catch (IOException exc) {
            System.out.println("Ошибка: " + exc);
        }

        // Demo with array of objects:
        Person[] persons = { new Person(1, 35,"Angela"),
                new Person(2, 27,"Sally"), new Person(3, 43, "Alex") };

        try (FileOutputStream fos = new FileOutputStream("Serialization/personsArray.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Short way:
            oos.writeObject(persons); // We can use it, because array is also an object

            /* It is a long way:
            oos.writeInt(persons.length);

            for (Person person : persons) {
                oos.writeObject(person);
            }
            */

        } catch (IOException exc) {
            System.out.println("Ошибка: " + exc);
        }
    }
}
