/**
 * Created by Antonella on 4/21/17.
 */
public class Dog extends HairType implements Animal, PetFriendly {

    @Override
    public void sleep() {
        System.out.println("I never sleep, and I like your bed");
    }

    @Override
    public void eat() {
        System.out.println("I like all of your scraps");
    }

    @Override
    public void reproduce() {
        System.out.println("I have puppies");
    }

    @Override
    public int age(int ageInHuman) {
        return ageInHuman * 7;
    }

    @Override
    public void dontEatHumans() {
        System.out.println("I am a dog, and I eat shoes not people");
    }

    @Override
    public void obedient() {
        System.out.println("I can be obedient, if trained");
    }

    @Override
    public void canPetMe() {
        System.out.println("If you pet me -- I will love you");
    }

    @Override
    public void myHairType(String hair) {
        //hair = "shaggy";
        System.out.println(hair);
    }
}
