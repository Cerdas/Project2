import java.util.Scanner;

public class Figures {
	
	// Creating variable and scanner
	static int num = 0;
	static Scanner scan = new Scanner(System.in);

	public Figures() {
		
		// Getting size for print methods
		System.out.print("Enter the size of the figure (odd number): ");
		num = scan.nextInt();
		System.out.println();
		while (num % 2 == 0) {
			System.out.println("Invalid figure size - must be odd number: " + "\n");
			System.out.print("Renter the size of the figure: ");
			num = scan.nextInt();
			System.out.println();
		}
	}

	public static void main() {

		// Creating variables for print methods
		int option = 0;

		// Printing out menu and getting option
		while (option != 4) {
			System.out.println("MENU:");
			System.out.println("1. Print Box");
			System.out.println("2. Print Diamond");
			System.out.println("3. Print X");
			System.out.println("4. Quit Program" + "\n");
			System.out.print("Please select an option: ");
			option = scan.nextInt();
			System.out.println();

			// Printing out method based on choice
			if (option == 1) {
				printBox(num);
			} else if (option == 2) {
				printDiamond(num);
			} else if (option == 3) {
				printX(num);
			}
		}

		// Printing Goodbye when option 4 is selected
		System.out.println("Goodbye !");
	}

	// Printing out Box shape using size input
	public static void printBox(int size) {
		for (int x = 1; x <= size; x++) {
			for (int y = 1; y <= size; y++) {
				System.out.print("X");
			}
			System.out.println();
		}
		System.out.println();
	}

	// Printing out Diamond shape using size input
	public static void printDiamond(int size) {

		// Creating variable for diamond
		int middle = (size + 1) / 2;
		int right = 1;
		int left = 0;

		// For loop to make diamond
		for (int x = 1; x <= size; x++) {
			for (int y = 0; y <= size + 1; y++) {

				// Using If statement to place X
				if (y == middle + right || y == middle + left) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

			// Prints the X to the left and right
			if (x <= (size / 2)) {
				right++;
				left--;
			} else {
				right--;
				left++;
			}
		}
		System.out.println();

	}

	// Print out X shape using size input
	public static void printX(int size) {

		// Using For loop to make X shape
		for (int x = 0; x < size; x++) {
			int z = size - x - 1;
			for (int y = 0; y < size; y++) {
				if (y == x || y == z) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
