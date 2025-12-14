import java.util.Scanner;

public class ApplicationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y; // Potential division by zero
            System.out.println(x + " / " + y + " = " + z);
        } catch (ArithmeticException ex) {
            System.out.println("--- Catch Block ---"+ex.toString()); // Print exception details
        } finally {
            System.out.println("---- Finally Block ----");
            sc.close(); // Close the scanner
        }

        System.out.println("--- DONE ---");
    }
}
