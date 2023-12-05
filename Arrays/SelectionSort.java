// How does selection sort work?
// The selection sort algorithm works in a very simple way. It maintains two subarray for the given array.

// The subarray is already sorted.
// And the second subarray is unsorted.
// With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.

// arr[] = 25 35 45 12 65 10  
  
// // Find the minimum element in arr[0...5] and place it at beginning.  
  
// 10 25 35 45 12 65   
  
// // Find the minimum element in arr[1...5] and place it at beginning of arr[1...5]  
  
// 10 12 25 35 45 65   
  
// // Find the minimum element in arr[2...5] and place it at beginning of arr[2...5]  
// No, you can see that the array is already sorted.   
  
// 10 12 25 35 45 65   
// Time Complexity
// Best: ?(n^2)
// Average: ?(n^2)
// Worst: O(n^2)
// Space Complexity
// O(1)


package Arrays;
import java.util.Scanner;
class SelectionSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[] =new int[n];
        for (int i = 0 ; i < n ; i++ ) {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        //selection sort algorithm
        for (int j = 0 ; j < n-1 ; j++ ){
            int index = j;
            for (int k =j + 1 ; k< n ;k++){
                if (arr[index] > arr[k]){
                    index = k;
                }
            }
            int smallerNum = arr[index];
            arr[index]= arr[j];
            arr[j] = smallerNum;
        }
        System.out.println("\nThe sorted array is: \n");
        for (int l = 0 ; l < n ;l ++){
            System.out.print(arr[l]+ " ");
        }

    }
}