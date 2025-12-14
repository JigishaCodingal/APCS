import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        do {
            System.out.print("Enter the number ");//5
            number = scn.nextInt();//11,1

            if (number > max) {
                max = number;//11
            }
            if (number < min) {
                min = number;//1
            }
            System.out.print("Do you want to continue y/n? ");
            choice = scn.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}