import java.util.Scanner;

class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = scn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum till " + n + " is " + sum + ".");
    }
}

/*
 
start= 1
end= n
update= +1

1
2
.
.
n
 */