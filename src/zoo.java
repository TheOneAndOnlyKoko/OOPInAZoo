/**
 * Created by h205p2 on 9/21/17.
 */
public class zoo {
    String favoriteFood = "bacon";
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

    }

    public void sleep(String name) {
        System.out.print(name + " sleeps for 8 hours");
    }

    public void eat(String animal, String food) {
        if (food == favoriteFood) {
            System.out.println(animal + " eats " + food);
            System.out.println("YUM!!! " + animal + " wants more " + food);
        }
        else {
            System.out.println(animal + " eats " + food);
        }
    }
}



