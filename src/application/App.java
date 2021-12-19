package application;

public class App {

	public static void main(String[] args) {
		int option = 10;
		// Typically use an int for the variable
		switch (option) {
		// Does the option have the value 0
		case 0:
			System.out.println("Option 0 selected.");
			break;
		case 1:
			System.out.println("Option 1 selected.");
			break;
		case 10:
			System.out.println("Option 10 selected. Exiting");
			System.exit(0);
			break;
		// The below isn't required, but is a good idea
		default:
			System.out.println("Invalid option.");
			break;
		}
	}
}
