import java.util.Scanner;  
  
class prime {    
    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);  
        System.out.print("Enter first number : ");
        int a = scn.nextInt();  
        System.out.println("Enter second number : ");
        int b = scn.nextInt();
        for (int n = a; n <= b; n++) {  
            int count=0;
            for(int i= 1;i<=n;i++)
            {
                if(n%i==0)
                count++;
            }  
            if (count == 2) {  
                System.out.println(n+" is prime");  
            } else {  
                System.out.println(n+" is composite");  
            }  
        }  
    }  
}  