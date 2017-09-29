/**
 * Created by h205p2 on 9/27/17.
 */

import java.util.ArrayList;

public class zookeeper {
    String name;

    public void feedAnimals (ArrayList<Animal> animals, String food) {
        int count = 0;
        System.out.println( name + " is feeding " + food + "to " + animals.size() + " animals");
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).eat(food);
            count++;
        }
        System.out.println(name +  " is feeding " + food + " to " + count + " of " + Animal.counter + "total animals");
    }

}
