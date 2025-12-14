// Importing necessary libraries for input/output and ArrayList handling
/*
 You are given N lines. In each line, there are zero or more integers. You need to answer a few queries where you need to tell the number located in Y th position of X th line. In each line, output the number located in Y th position of X th line. If there is no such position, just print "ERROR!"

no of arrays= no of rows
no of elements in each array = no of cols in each row

[[4 7 9]
[4 8 1 9]
[5 0 2 3 1]]

r=1
c=2
 */

import java.util.*;

public class ArrayListTrial {

    // Main method where the execution starts
    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting user to input the number of arrays (n)
        System.out.print("Enter the number of arrays you want to input: ");
        int n = sc.nextInt();
        
        // Creating a 2D ArrayList to store multiple ArrayLists of integers
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Loop through to input each sub-array
        for (int i = 0; i < n; i++) {
            // Prompting user to input the size of the current sub-array (n1)
            System.out.print("Enter the size of array " + (i + 1) + ": ");
            int n1 = sc.nextInt();
            
            // Creating a new ArrayList to store the elements of the sub-array
            ArrayList<Integer> l2 = new ArrayList<>();
            
            // Prompting user to input the elements of the current sub-array and adding to l2
            System.out.println("Enter the " + n1 + " elements of array " + (i + 1) + ": ");
            for (int j = 0; j < n1; j++) {
                l2.add(sc.nextInt());
            }
            
            // Adding the sub-array to the main ArrayList at index i
            list.add(i, l2);
        }

        // Prompting user to input the number of queries to process (num)
        System.out.print("Enter the number of queries to process: ");
        int num = sc.nextInt();
        
        // Loop through for each query
        for (int k = 0; k < num; k++) {
            // Prompting user to input the row (m) and column (o) for the current query
            System.out.print("Enter row and column for query " + (k + 1) + ": ");
            int m = sc.nextInt();
            int o = sc.nextInt();
            
            try {
                // Trying to print the element at the specified row and column
                System.out.println("Element at (" + m + ", " + o + "): " + list.get(m - 1).get(o - 1));
            }
            catch (Exception e) {
                // If an exception occurs (index out of bounds), print ERROR
                System.out.println("ERROR!");
            }
        }
    }
}
