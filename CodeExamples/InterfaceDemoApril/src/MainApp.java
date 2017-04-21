/**
 * Created by Antonella on 4/21/17.
 */
public class MainApp {

    public static void main(String[] args) {

        // Just like abstract classes I can not create an object of the interface
        //Animal a1 = new Animal();

        Tiger tiger = new Tiger();
        System.out.println(tiger.age(20));
        tiger.eat();
        tiger.reproduce();
        tiger.sleep();

        System.out.println();
        Dog dog = new Dog();
        System.out.println(dog.age(13));
        dog.eat();
        dog.reproduce();
        dog.sleep();
        dog.dontEatHumans();
        dog.obedient();
        dog.canPetMe();
        dog.myHairType("shaggy hair");

        System.out.println();
        Cat cat = new Cat();
        System.out.println(cat.age(7));
        cat.eat();
        cat.reproduce();
        cat.sleep();
        cat.dontEatHumans();
        cat.canPetMe();
        cat.obedient();
        cat.myHairType("long hair");

    }
}
