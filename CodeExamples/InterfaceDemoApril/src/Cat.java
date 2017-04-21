/**
 * Created by Antonella on 4/21/17.
 */
public class Cat extends HairType implements Animal,PetFriendly {
    @Override
    public void sleep() {
        System.out.println("I sleep all day");

    }

    @Override
    public void eat() {
        System.out.println("I eat everything");
    }

    @Override
    public void reproduce() {
        System.out.println("My human had me snipped");

    }

    @Override
    public int age(int ageInHuman) {
        return ageInHuman * 9;
    }

    @Override
    public void dontEatHumans() {
        System.out.println("I am a cat and I don't eat people");
    }

    @Override
    public void obedient() {
        System.out.println("I am never obedient");
    }

    @Override
    public void canPetMe() {
        System.out.println("If I am in a good mood you can pet me");
    }

    @Override
    public void myHairType(String hair) {
        //hair = "long";
        System.out.println(hair);
    }
}
