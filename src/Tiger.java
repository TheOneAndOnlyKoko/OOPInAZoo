/**
 * Created by h205p2 on 9/21/17.
 */
public class Tiger extends Animal{
    // put your instance variables here!
    String name;
    String favoriteFood = "meat";

    public Tiger(String name) {
        // put your constructor content here
        super(name);
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

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        tigger.sleep();

    }

}