/**
 * Created by h205p2 on 9/26/17.
 */
public class Giraffe {
    String name;
    String favoriteFood;

    public Giraffe(String name, String favoriteFood) {
        // put your constructor content here
        super(name, favoriteFood);
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        // complete your eat function here!
        if (food == favoriteFood) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
    }
}
