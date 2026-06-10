import java.util.Scanner;

public class PasswordStrengthAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int score = 0;

        // Length Check
        if (password.length() >= 8) {
            score++;
        }

        // Uppercase Check
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Lowercase Check
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Number Check
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Special Character Check
        if (password.matches(".*[@#$%^&+=!].*")) {
            score++;
        }

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Strength: WEAK");
            System.out.println("Suggestion: Use at least 8 characters, uppercase, lowercase, numbers, and special characters.");
        } else if (score <= 4) {
            System.out.println("Strength: MEDIUM");
            System.out.println("Suggestion: Add more special characters and increase length.");
        } else {
            System.out.println("Strength: STRONG");
            System.out.println("Excellent password!");
        }

        sc.close();
    }
}