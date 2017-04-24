package com.gc.lab12;
import java.util.Scanner;

/**
 * Created by maurice on 4/21/17.
 */
public class RoshamboApp {

    public static void main(String[] args) {
        //1. Display prompt for user name and opponent
        System.out.print("Enter your name: ");

        //2. get user input
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        String userOpp = "";
        boolean keepgoing = true;   //keeps us in the while loop until set to false

        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.setName(playerName);
        Player player = null;

        while (keepgoing) {
            //gt user selection
            System.out.println("Select opponent AI player 'A', or The Rock 'R'");
            userOpp = scan.nextLine();

            // I'm using polymorphism here!!!! AIPlayer AKA player and RockPlayer AKA Player (many names)
            if (userOpp.equalsIgnoreCase("A")) {
                player = new AIPlayer();
            } else if (userOpp.equalsIgnoreCase("R")) {
                player = new RockPlayer();
            } else {
                System.out.println("Please try your input again!");
            }

            //3. Display prompt for user selection (rock, paper, scissors)
            System.out.println("Choose R. Rock, P. Paper or S. Scissors");

            //4. get user input
            String userChoice = scan.nextLine();
            Roshambo roshamboChoice = null;
            switch (userChoice.toUpperCase()){
                case "R":
                    roshamboChoice = Roshambo.ROCK;
                break;

                case "P":
                    roshamboChoice = Roshambo.PAPER;
                    break;

                case "S":
                    roshamboChoice = Roshambo.SCISSORS;
                    break;

                default:
                    //chose rock as default
                    roshamboChoice = Roshambo.ROCK;
                    break;
            }
            humanPlayer.setRoshambo(roshamboChoice);

            //5. generate match results
            Player winningPlayer = decideWinner(humanPlayer, player);

            //6. display match results
            System.out.println("Player " + humanPlayer.getName() + " choose " + humanPlayer.getRoshambo());
            System.out.println("Opponent " + player.getName() + " choose " + player.getRoshambo());

            //7. display winner message
            System.out.println("The winner is: " + winningPlayer);

            //8. Ask user to continue another match
            System.out.println("Do want to play another match (y/n)?");
            String flag = scan.nextLine();
            keepgoing = false;
            if(flag.equalsIgnoreCase("y")){
                keepgoing = true;
            }
            //9. Goodbye message
            System.out.println("Thank you for playing!");
        }
    }

    /*
    * Returns the winning player object.
    * I could also return a string result
     */
    private static Player decideWinner(HumanPlayer humanPlayer, Player opponent) {

        opponent.generateRoshambo();//generate opponent roshambo
        int result = humanPlayer.compare((Roshambo) humanPlayer.getRoshambo(), (Roshambo) opponent.getRoshambo());

        switch (result){
            case 0://Draw- I'm not liking this but it works for now.
                HumanPlayer temp = new HumanPlayer();
                temp.setName("Draw");
                temp.setRoshambo(humanPlayer.getRoshambo());
                return temp;

            case 1://humanplayer wins
                return humanPlayer;

            case -1://humanplayer looses
                return opponent;
        }
        return null;//this is bad
    }
}
