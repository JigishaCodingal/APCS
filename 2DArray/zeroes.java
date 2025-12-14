import java.util.*;

/**
 * 
 * A program to find the number of zeroes and their positions in a user-provided
 * number.
 * 
 */

public class zeroes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        String numberStr = scanner.next();

        int zeroCount = 0;

        List<Integer> zeroPositions = new ArrayList<>();

        for (int i = 0; i < numberStr.length(); i++) {

            // Check if the character at the current position is '0'.

            if (numberStr.charAt(i) == '0') {

                // If it is a zero, increment our counter.

                zeroCount++;

                // Record the human-readable position (index + 1).

                zeroPositions.add(i + 1);

            }

        }

        System.out.println("--------------------");

        if (zeroCount > 0) {

            System.out.println("The number '" + numberStr + "' has " + zeroCount + " zero(es).");

            System.out.println("They are found at position(s): " + zeroPositions);

        } else {

            System.out.println("The number '" + numberStr + "' does not contain any zeroes.");

        }

        System.out.println("--------------------");

        scanner.close();

    }

}