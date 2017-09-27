/**
 * Created by h205p2 on 9/26/17.
 */
public class Bee extends Animal {
    String name;
    String favoriteFood;
    public Bee(String name, String favoriteFood) {
        // don't forget to correct the call to the superclass initializer!
        super(name, favoriteFood);
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(name + " never sleeps.");
    }

    public void eat(String food) {
        // complete your eat function here!
        if (food == favoriteFood) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else {
            System.out.println(name + " eats " + food);
            System.out.println("YUCK!!! " + name + " will not eat " + food + ".");
        }
    }
}
