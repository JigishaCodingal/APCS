import java.util.Scanner;  
class a1 {  
public static void main(String[] args) {  
Scanner scn = new Scanner(System.in);  

System.out.print("Enter your name : ");  
String str = scn.nextLine();  //string in input
System.out.println("Your name is "+str);  

System.out.print("Enter your age : ");  
int num = scn.nextInt();  // integer in input 
System.out.println("Your age is "+num);  

System.out.print("Enter your percentage : ");  
float fnum = scn.nextFloat();  //float in input
System.out.println("Your percentage is "+fnum);  
} }  