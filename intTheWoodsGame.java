import java.util.Random;
import java.util.Scanner;

/**
 * In The Woods is a basic choose your own adventure game. The user is able to determine how to proceed 
 * on an adventure, using randomization the program takes user input and determines the next 
 * portion of the adventure. 
 * @author Annalise Grekalski
 * @version 1.0 - May 2022
 *
 */
public class intTheWoodsGame {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int userInput;
		
		System.out.println("Hello...Wood dweller. Press the enter key to begin.");
		
		try {System.in.read(); }
        catch (Exception ex) {}
 
		System.out.println("  ^      ^      ^                                                ^      ^      ^");
		System.out.println(" ^ ^    ^ ^    ^ ^          you have entered the woods          ^ ^    ^ ^    ^ ^");
		System.out.println("^ ^ ^  ^ ^ ^  ^ ^ ^            cool trees, right?              ^ ^ ^  ^ ^ ^  ^ ^ ^");
		System.out.println(" |||    |||    |||          (press enter to continue)           |||    |||    |||");
		System.out.println("----------------------------------------------------------------------------------");
		
		try {System.in.read(); }
        catch (Exception ex) {}
		
		System.out.println();
		System.out.println("As you enter the woods, you decide that this is a great opportunity for adventure.");
		System.out.println("Along the way, you will be able to choose your own adventure.");
		System.out.println();
		System.out.println("Here are the rules:");
		System.out.println("-------------------");
		System.out.println("* As your adventure progresses select your choice by entering a number selection.");
		System.out.println("* Enjoy your adventure. Press enter once again to begin. If you wish for your adventure to end, press 0.");
		
		try {System.in.read(); }
        catch (Exception ex) {}
		
		System.out.println("  ^      ^      ^                 ^      ^      ^                ^      ^      ^");
		System.out.println(" ^ ^    ^ ^    ^ ^               ^ ^    ^ ^    ^ ^              ^ ^    ^ ^    ^ ^");
		System.out.println("^ ^ ^  ^ ^ ^  ^ ^ ^             ^ ^ ^  ^ ^ ^  ^ ^ ^            ^ ^ ^  ^ ^ ^  ^ ^ ^");
		System.out.println(" |||    |||    |||               |||    |||    |||              |||    |||    |||");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("After you realize you are indeed in the woods, you see a path in the dirt, how do you wish to proceed?");
		System.out.println();
		
		displayMenu();
		userInput = scnr.nextInt();
		
		try {
			while (userInput <= 9) {
				switch(userInput) {
				case 1:
					System.out.println("Great, onwards and upwards we go, forest dweller!");
					System.out.println();
					System.out.println(chooseEnding());
					System.out.println(chooseFate());
					break;
				case 2:
					System.out.println("Nothing bad can happen when you go down a mysterious path, right? Lets go!");
					System.out.println();
					System.out.println(chooseEnding());
					System.out.println(chooseFate());
					break;
				case 3:
					System.out.println("This is a nice spot, you're right. I can already see the best sleeping rock.");
					System.out.println();
					System.out.println(chooseEnding());
					System.out.println(chooseFate());
					break;
				case 4:
					System.out.println("*** Contacting Computer Brain ***");
					System.out.println(computerChoice());
					System.out.println();
					System.out.println(chooseEnding());
					System.out.println(chooseFate());
					break;
				case 0:
					System.out.println("Leaving the Woods, see you soon!");
					System.exit(userInput);
				default:
					System.out.println("Think again wood dweller"); 
					}
			
				System.out.println();
				System.out.println();
				System.out.println("  ^      ^      ^                 ^      ^      ^                ^      ^      ^");
				System.out.println(" ^ ^    ^ ^    ^ ^               ^ ^    ^ ^    ^ ^              ^ ^    ^ ^    ^ ^");
				System.out.println("^ ^ ^  ^ ^ ^  ^ ^ ^             ^ ^ ^  ^ ^ ^  ^ ^ ^            ^ ^ ^  ^ ^ ^  ^ ^ ^");
				System.out.println(" |||    |||    |||               |||    |||    |||              |||    |||    |||");
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println();
				displayMenu();
				userInput = scnr.nextInt();
				}
		}
		catch(Exception E) {
			System.out.println("Leaving the Woods, see you soon!");
		}
	}
	
	/**
	 * displayMenu displays a menu of possible user choices for the player to choose from during the adventure
	 */
	public static void displayMenu() {
		System.out.println();
		System.out.println("Here Are Your Options: ");
		System.out.println("1: Go Forward");
		System.out.println("2: Turn Down the Nearest Path");
		System.out.println("3: Hunker Down Here, This is a Good Nap Spot");
		System.out.println("4: Ask the All-Knowing Computer Machine How to Proceed");
		System.out.println();
		System.out.println("How Do You Want To Proceed? (Press 0 to Quit game.)");
	}
	
	/**
	 * chooseFate utilizes a seed number to choose an outcome from the user's previous input
	 * @return - returns the determined fate to the user
	 */
	public static String chooseFate() {
		String fate = "";
		
		String[] possibleFates = {"You see something in the far distance", "A mysterious creature approaches you", 
				"You hear cars on a road ahead","You decide to take a long nap and have a drink in the pond nearby", 
				"Qucik! Run! Ravenous Racoons are lurking nearby", "You run into another forest dweller, who has some interesting insights.", 
				"Oh no! A rainstorm! Qucik, take shelter!"};
		Random rand = new Random();
		int upperBound = possibleFates.length;
		fate = possibleFates[rand.nextInt(upperBound)];
		return fate;
	}
	
	/**
	 * chooseEnding utilizes a seed number to choose an ending for the user's current task
	 * @return - returns the user's ending
	 */
	public static String chooseEnding() {
		String ending = "";
		
		String[] possibleEnding = {"Oh no! Mudslide, you fall about 20 feet, but are not hurt.", "You realize you are hungry, and need to find food.", 
				"*Yawn* Its getting dark out, lets find somewhere to sleep!","Its the next day, you decide to make a home out of these woods, we have work to do!", 
				"Hmm, can I eat this? You eat something on the ground and get a tummy ache :( "};
		Random rand = new Random();
		int upperBound = possibleEnding.length;
		ending = possibleEnding[rand.nextInt(upperBound)];
		return ending;
	}
	
	/**
	 * If user selects help from the computer, a seed number generates a new scenario for the user
	 * @return - returns the new scenario to the user
	 */
	public static String computerChoice() {
		String choice = "";
		
		String[] possibleChoice = {"Computer brains have decided that you, dweller, should keep moving forward.", "Computer brains tell you to find shelter.",
				"Computer brains alert you of a storm approaching."};
		Random rand = new Random();
		int upperBound = possibleChoice.length;
		choice = possibleChoice[rand.nextInt(upperBound)];
		return choice;
	}
	
	

}
