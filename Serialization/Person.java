package Serialization;

import java.io.Serial;
import java.io.Serializable;

// We need to implement Serializable interface to be able to Serialize objects
// (this interface has no methods, just "mark" class as Serializable)
public class Person implements Serializable {

    // We set new serial (after some important class updates):
    @Serial
    private static final long serialVersionUID = 8523683163166330277L;

    // If this class will be changed in the future, Java will be able to check it by comparing UID
    // and throw an exception on object reading (InvalidClass exception)
    //private static final long serialVersionUID = 7641393721175349767L;
    private int age; // added this after saving object

    private int id;
    private String name;


    // We use 'transient' keyword when variable must not be serialized
    private transient double localValue; // It will return '0.0'
    private transient String localName; // It will return 'null'

    public Person(int id, int age, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
        localValue = 1.0/id;
        localName = "MyCorp: " + name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + ":" + name + ":" + localValue + ":" + localName;
    }
}
