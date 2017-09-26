/**
 * Created by h205p2 on 9/26/17.
 */
// Implement the Unicorn class here as a subclass of Animal
// Hint: Implement the initializer method and override the sleep method
public class Unicorn extends Animal {
    String name;
    String favoriteFood;
    public Unicorn(String name, String favoriteFood) {
        // don't forget to correct the call to the superclass initializer!
        super(name, favoriteFood);
    }

    public void sleep() {
        // your overridden sleep code...
        System.out.println(name + " sleeps on a cloud.");
    }
}

