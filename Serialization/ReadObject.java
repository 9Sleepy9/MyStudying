package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {

    public static void main(String[] args) {

        // We use try-with-resources here, so no need in close(), stream closes automatically
        // We read single objects
        try ( ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("Serialization/persons.bin")) ) {

            Person person1 = (Person) ois.readObject(); // Downcasting
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException exc) {
            System.out.println("Ошибка: " + exc);
        } catch (ClassNotFoundException exc) {
            System.out.println("Ошибка: " + exc);
        }

        // Here we read an array of objects
        try (FileInputStream fis = new FileInputStream("Serialization/personsArray.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Short way:
            Person[] persons = (Person[]) ois.readObject();

            /* This is a long way:
            int personCount = ois.readInt();
            Person[] persons = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                persons[i] = (Person) ois.readObject();
            }
            */

            // Array output with Arrays.toString() method
            System.out.println(Arrays.toString(persons));

        } catch (IOException exc) {
            System.out.println("Ошибка: " + exc);
        } catch (ClassNotFoundException exc) {
            System.out.println("Ошибка: " + exc);
        }
    }
}
