package CollectionsDemo.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating...");
    }
}

class Cat extends Animal {

    public void eat() {
        System.out.println("Cat is eating...");
    }
}


public class ArrayListSimpleDemo {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("str1");
        myList.add("str2");
        myList.add("str3");

        for (String str : myList) {
            System.out.println(str);
        }

        System.out.println();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Animal());
        testAnimal(animalList);
    }

    public static void testAnimal(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
