public import java.util.Scanner;

public class BinarySearchCeilFloor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size
        int n = sc.nextInt();
        
        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       // [4 7 9 20 50] 15
        // Input number to search
        int d = sc.nextInt();
        
        // Find floor and ceil
        int floor = -1;
        int ceil = -1;
        
        int left = 0;
        int right = n - 1;
        
        // Binary search for floor
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] <= d) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // Reset for ceil search
        left = 0;
        right = n - 1;
        
        // Binary search for ceil
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] >= d) {
                ceil = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        // Output
        System.out.println(floor);
        System.out.println(ceil);
        
        sc.close();
    }
} 
