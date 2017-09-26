/**
 * Created by h205p2 on 9/25/17.
 */
public class Animal {
    // Put your instance variables here
    String favoriteFood;
    String name;

    public Animal(String name, String favoriteFood) {
        // put your initializer content here
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public void sleep() {
        // complete your sleep function here
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