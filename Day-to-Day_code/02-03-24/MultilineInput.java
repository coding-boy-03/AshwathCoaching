import java.util.Scanner;

public class MultilineInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number of lines as input
        System.out.println("Enter the number of lines:\n");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the
        // integer

        // Taking n lines of strings as input
        System.out.println("Enter " + n + " lines of strings:");
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }

        // Displaying the input lines
        System.out.println("Input lines:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Close the scanner
        scanner.close();
    }
}
