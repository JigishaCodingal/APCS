
import java.util.Scanner;

class acpstringfre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input email ID
        System.out.print("Enter email ID: ");
        String email = sc.nextLine();

        // Loop through each character
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            // Check if the character is a digit or special character
            if (Character.isDigit(ch) || !Character.isLetter(ch)) {
                int count = 0;

                // Count how many times this character appears
                for (int j = 0; j < email.length(); j++) {
                    if (email.charAt(j) == ch)
                        count++;
                }

                // Print and remove duplicates by checking if first occurrence
                if (email.indexOf(ch) == i)
                    System.out.println(ch + " --> " + count);
            }
        }
        sc.close();
    }
} 