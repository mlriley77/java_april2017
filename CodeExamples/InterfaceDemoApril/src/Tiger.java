/**
 * Created by Antonella on 4/21/17.
 */
public class Tiger implements Animal {
    @Override
    public void sleep() {
        System.out.println("I like to sleep in caves");
    }

    @Override
    public void eat() {
        System.out.println("I like to eat other animals and people");
    }

    @Override
    public void reproduce() {
        System.out.println("I have 1 cub a year");
    }

    @Override
    public int age(int ageInHuman) {
        return ageInHuman * 4;
    }
}
