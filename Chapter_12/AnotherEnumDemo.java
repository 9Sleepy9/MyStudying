package Chapter_12;


// Object -> Enum -> Season/Animal

enum Animal {
    DOG(0), CAT(1), FROG(2); // It is like a static objects
    // It is equals to 'new DOG(0)'

    private int id;
    Animal(int id) { // Automatically 'private'
        this.id = id;
    }

    int getId() {
        return id;
    }

    // this.name() or name() allows us to get object name in enum!
    @Override
    public String toString() {
        return "It is a " + name() + "; id: " + id;
    }
}

enum Season {
    SUMMER, SPRING, WINTER, AUTUMN
}
public class AnotherEnumDemo {

    public static void main(String[] args) {
        Animal animal = Animal.valueOf("CAT"); // Returns CAT object from enum

        switch (animal) {
            case CAT:
                System.out.println(animal);
                System.out.println(animal.ordinal()); // Return index of object in enum
                break;
            case DOG:
                System.out.println("It's a dog : " + animal.getId());
                break;
            case FROG:
                System.out.println("It's a frog : " + animal.getId());
                break;
        }

        Season season = Season.SUMMER;

        // Checks does season is an object of Season/Enum
        System.out.println(season instanceof Season);
        System.out.println(season instanceof Enum);

        switch (season) {
            case SUMMER -> System.out.println("It's warm outside!");
            case WINTER -> System.out.println("It's cold outside!");
        }
    }
}
