import java.util.Scanner; // Import the Scanner class to handle user input

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read string input

        // Prompt the user for their birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt(); // Read integer input

        // Simple process: calculate approximate age based on current year (2026)
        int currentYear = 2026;
        int age = currentYear - birthYear;

        // Output the results
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are approximately " + age + " years old.");

        // Always close the scanner when done
        scanner.close(); 
    }
}
