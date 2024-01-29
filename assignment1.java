import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        // Define correct username and password
        String correctUsername = "Guest";
        String correctPassword = "254hide";
        // Maximum number of login attempts
        int maxAttempts = 3;
        // initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Login Page!");

        // Loop for login attempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            // Prompt user for username
            System.out.print("Enter username: ");
            String usernameInput = scanner.nextLine();

            // Prompt user for password
            System.out.print("Enter password: ");
            String passwordInput = getPasswordInput(scanner);

            // Check if username and password are correct
            if (usernameInput.equals(correctUsername) && passwordInput.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; // Exit the loop if login is successful
            } else {
                System.out.println("Incorrect username or password. Attempts left: " + (maxAttempts - attempt));
                if (attempt < maxAttempts) {
                    System.out.println("Please try again.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Function to mask the password input
    private static String getPasswordInput(Scanner scanner) {
        // Read the password as a string
        String passwordInput = scanner.nextLine();

        // Print each character as '*'
        System.out.print("Enter password: ");
        for (int i = 0; i < passwordInput.length(); i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line

        return passwordInput;
    }
}
