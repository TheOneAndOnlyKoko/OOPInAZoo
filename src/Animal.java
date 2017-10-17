public class Animal {
    // Put your instance variables here
    String favoriteFood;
    String name;
    static int counter = 0;

    public Animal(String favoriteFood, String name) {
        // put your initializer content here
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.counter = 0;
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
