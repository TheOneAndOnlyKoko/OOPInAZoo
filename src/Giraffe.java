/**
 * Created by h205p2 on 9/26/17.
 */
public class Giraffe extends Animal {
    String name = "";
    String favoriteFood = "leaves";

    public Giraffe(String name, String favoriteFood) {
        // put your constructor content here
        super(name, favoriteFood);
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
