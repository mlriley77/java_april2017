import java.util.Scanner;

/**
 * Created by Antonella on 4/21/17.
 */
public class MainApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter a season (Spring/Fall/Winter/Summer): ");
        String choice = scan.nextLine();

        // to call the enum, you will need to reference the name of the enum and the value
        // in this example the toString method is used to return the value as a string and the default is all caps
        if (choice.equalsIgnoreCase(SEASON.FALL.toString())) {
            System.out.println(SEASON.FALL.toString().toLowerCase()); // I could also add the toLowercase method if needed
            System.out.println(SEASON.FALL.ordinal()); // the ordinal method is used to identify the position in the enum (starts at 0 like arrays)
        } else if (choice.equalsIgnoreCase(SEASON.SPRING.toString())) {
            System.out.println(SEASON.SPRING.toString());
            System.out.println(SEASON.SPRING.ordinal());
        } else if (choice.equalsIgnoreCase(SEASON.SUMMER.toString())) {
            System.out.println(SEASON.SUMMER.toString());
            System.out.println(SEASON.SUMMER.ordinal());
        } else if (choice.equalsIgnoreCase(SEASON.WINTER.toString())) {
            System.out.println(SEASON.WINTER.toString());
            System.out.println(SEASON.WINTER.ordinal());
        } else {
            System.out.println("You entered an invalid selection");
        }

        System.out.println(); // used to format/ separate  what's happening
        // this for each loop loops through the enum
        for (SEASON s : SEASON.values()) {
            System.out.println(s);

        }

        System.out.println();
        System.out.println("Please make a selection for the season: ");
        System.out.println("1. Spring");
        System.out.println("2. Fall");
        System.out.println("3. Summer");
        System.out.println("4. Winter");
        int input = Integer.parseInt(scan.nextLine()); // this is an example of how to cast a string to an integer

        switch (input) {
            case 1:
                System.out.println(SEASON.SPRING.toString());
                break;
            case 2:
                System.out.println(SEASON.FALL.toString());
                break;
            case 3:
                System.out.println(SEASON.SUMMER.toString());
                break;
            case 4:
                System.out.println(SEASON.WINTER.toString());
                break;
            default:
                System.out.println("invalid selection");
                break;
        }


    }
}

