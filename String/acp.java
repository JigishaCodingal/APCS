import java.util.ArrayList;
import java.util.Scanner;

public class acp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input characters using ArrayList
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Char " + (i + 1) + ": ");
            chars.add(sc.nextLine().charAt(0));
        }

        // Construct string
        String str = "";
        for (char c : chars)
            str += c;

        // Display results
        System.out.println("\nString: " + str);
        System.out.println("Length: " + str.length());

        // Reverse
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        System.out.println("Reverse: " + rev);

        // Split into two equal words
        if (str.length() % 2 != 0)
            str += "_";
        int mid = str.length() / 2;
        System.out.println("Word 1: " + str.substring(0, mid));
        System.out.println("Word 2: " + str.substring(mid));

        sc.close();
    }
}