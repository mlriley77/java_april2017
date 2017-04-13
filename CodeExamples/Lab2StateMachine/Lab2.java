import java.util.Scanner;

/**
 * @author Maurice Tedder
 * Lab #2 Create Your Own Adventure Game
 * This code does not validate user input.
 * 
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = "";// collects user input as a string
		String name = "";
		boolean running = true;// while loop flag
		String whatToDo = "";// user response to what to do
		String numberOfHeads = "";// number of dragon heads
		String weapon = "";

		String state = "start";// initialize state variable. I could also use integer constants or enum
		
		while (running) {
			
			switch (state) {
			case "start":
				System.out.println("Welcome! What is your name? (enter your name): ");
				name = scanner.next();
				scanner.nextLine();//consume new line
				state = "state1";
				break;

			case "state1":						
				if (playGame(scanner)) {//example of using a method instead of place all the code in case code block
					state = "state2";
				} else {
					state = "end";
				}
				break;

			case "state2":// continue playing game
				System.out.println(
						"Excellemt! You are walking across a field and you encounter a fire-breathing dragon!\n"
								+ "What would you do? (enter \"face the beast\" or \"run away\")");				
				whatToDo = scanner.nextLine();				
				if(whatToDo.equalsIgnoreCase("face the beast")){
					state = "state3";//approach dragon
				}else{
					state = "end";//end now
				}
							
				break;

			case "state3":// dragon heads question
				numberOfHeads = dragonHeads(scanner);//example of using a method instead of place all the code in case code block
				state = "state4";
				break;

			case "state4":// weapon question
				System.out.println(
						"No one has ever faced a " + numberOfHeads + "-headed dragon before! Choose you weapon. "
								+ "\n(enter \"slingshot\" or \"sword\" or \"bow and arrow\"):");
				scanner.nextLine();//consume newline from previous entry
				weapon = scanner.nextLine();				
				state = "state5";
				break;

			case "state5":// dragon eye color question				
				System.out.println("Armed with a " + weapon + ", you approach the dragon. You can feel its fiery breath "
						+ "as you get closer. It stares at you with its__eyes. (enter \"red\" or \"blue\"): ");				
				state = "state6";
				break;

			case "state6":// dragon eye color question
				String eyeColor = scanner.next();				
				if(eyeColor.equalsIgnoreCase("red")){
					System.out.println(
							"Oh thank goodness! " + eyeColor + "-eyed dragons are friendly. You pet it and become friends."
									+ "\nYou name the dragon___.(enter a name): ");		
					state = "state7";
				}else{
					System.out.println(
							"You're in trouble! " + eyeColor + "-eyed dragons are dangerous. It eats you and you die.");	
					state = "end";
				}						
				break;

			case "state7":// final story statement
				String dragonName = scanner.next();
				System.out.println(name + " and " + dragonName + " live happily ever after.");
				running = false;
				state = "null";
				break;

			case "end":
				System.out.println("Sorry to hear that. Bye!");
				running = false;
				state = "null";
				break;

			default:
				break;
			}// end switch block
		}//end while loop
		scanner.close();
	}

	/*
	 * Does user want to continue?
	 */
	private static boolean playGame(Scanner scan) {
		System.out.println("Would you like to play a game? (enter \"yes\" or \"no\"):");		
		String input = scan.nextLine();
//		System.out.println("input!!!:" + input);
		return input.equalsIgnoreCase("yes");
	}

	/*
	 * Get the number of dragon heads and return user input
	 */
	private static String dragonHeads(Scanner scan) {
		System.out.println("You approach the dragon. You see that he has___heads. (enter \"1\" or \"2\" or \"3\"): ");			
		return scan.next();
	}

}
