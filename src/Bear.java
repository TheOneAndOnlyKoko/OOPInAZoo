/**
 * Created by h205p2 on 9/25/17.
 */
public class Bear extends Animal {
    // put your instance variables here!
    String name;
    String favoriteFood;

    public Bear(String name, String favoriteFood) {
        // put your constructor content here
        super (name, favoriteFood);
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(name + " hibernates for four months.");
    }

    public void eat(String food) {
        // complete your eat function here!
        if (food == favoriteFood) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
    }

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        Tiger pooh = new Tiger("Pooh", "fish");
        pooh.eat("meat");
        pooh.eat("fish");
        pooh.sleep();

    }
}
