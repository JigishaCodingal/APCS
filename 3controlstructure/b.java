import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        System.out.print("enter your marks : ");
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if (marks > 90) {
            System.out.println("O");
        } else if (marks > 80) {
            System.out.println("A+");
        } else if (marks > 70) {
            System.out.println("A");
        } else if (marks > 60) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        scn.close();
    }
}
