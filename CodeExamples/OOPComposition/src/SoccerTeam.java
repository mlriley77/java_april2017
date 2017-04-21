/**
 * Created by Antonella on 4/20/17.
 */
public class SoccerTeam {

    private Person headCoach;
    private Person assistantCoach;

    public Person getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(Person headCoach) {
        this.headCoach = headCoach;
    }

    public Person getAssistantCoach() {
        return assistantCoach;
    }

    public void setAssistantCoach(Person assistantCoach) {
        this.assistantCoach = assistantCoach;
    }

    public void printTeam() {
        System.out.println("Head Coach: ");
        headCoach.printPerson();

        System.out.println("Assistant Coach: ");
        assistantCoach.printPerson();
    }
}
