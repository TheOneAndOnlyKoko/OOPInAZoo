import java.util.ArrayList;

/**
 * Created by h205p2 on 9/21/17.
 */
public class zoo {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger", "meat");
        tigger.eat("meat");
        tigger.sleep();
        Bear pooh = new Bear("Pooh", "fish");
        pooh.eat("fish");
        pooh.eat("meat");
        pooh.sleep();
        Unicorn rarity = new Unicorn("Rarity", "marshmallows");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("gemma", "leaves");
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        Bee stinger = new Bee("Stinger", "Pollen");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        stinger.sleep();
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(stinger);
        animals.add(gemma);
        animals.add(rarity);
        animals.add(pooh);
        animals.add(tigger);
        zookeeper zoebot = new zookeeper();
        zoebot.feedAnimals(animals, "meat");

    }
    /*
    Tigger eats meat
    YUM!!! Tigger wants more meat
    Pooh eats fish
    YUM!!! Pooh wants more fish
    Pooh eats meat
    Pooh hibernates for 4 months
    Rarity eats marshmallows
    YUM!!! Rarity wants more marshmallows
    Rarity sleeps in a cloud
    YUCK!!! Gemma will not eat meat
    Gemma eats leaves
    YUM!!! Gemma wants more leaves
    Gemma sleeps for 8 hours
    YUCK!!! Stinger will not eat ice cream
    Stinger eats pollen
    YUM!!! Stinger wants more pollen
    Stinger never sleeps
    */
}






