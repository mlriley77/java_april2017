/**
 * Created by Antonella on 4/20/17.
 */
public class MainApp {
    public static void main(String[] args) {
        Person p1 = new Person();

        Person p2 = new Person("Susan", 35);

        Person p3 = new Person("1234 Main St. ");

        p1.setFullName("Antonella Solomon");
        p1.setAge(34);
        p1.setAddress("1570 Woodward");

        // System.out.println(p1.toString());
        // System.out.println(p2.toString());
        // System.out.println(p3.getAddress());

        SoccerTeam s1 = new SoccerTeam();
        s1.setHeadCoach(p1);
        s1.setAssistantCoach(p2);
        s1.printTeam();


    }
}
