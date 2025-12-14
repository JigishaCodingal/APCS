import java.util.Scanner;

public class acp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println();
            return;
        }
        // Rotate left by one: move first character to the end
        String rotated = s.substring(1) + s.charAt(0);
        System.out.println(rotated);
    }
}
