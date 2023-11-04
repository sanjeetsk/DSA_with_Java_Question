package Arrays;
// Question
// Max Sum Subarray of size K
// Given an array of integers Arr of size N and a number, K. Return the maximum sum of a subarray of size K

// Input
// The first line contains 2 integers N and K The second line contains N integers denoting elements of the array

// Output
// Print an integer denoting the maximum sum subarray of size K

// Example 1
// Input:

// 4 2
// 100 200 300 400
// Output:

//  700
// Explanation: The sum of the last 2 elements is maximum i.e. (0-based indexing) Arr[2]+Arr[3]=700 is maximum

// Example 2
// Input:

// 4 2
// 100 -200 300 -400
// Output:

// 100
// Explanation: Sum of Arr[1]+Arr[2]=((-200)+300=)100 which is the maximum sum possible for subarray of size 2

// Constraints

// 1 <= N <= 1000000

// 1 <= K <= N

// -10000 <= Arr[i] <= 10000

// Solution

import java.util.*;
public class MaxiSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();  
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxSumSubArray(arr, k));
    }

    public static int maxSumSubArray(int[] arr, int k){
        for(int i=1; i<arr.length; i++){ //prefix sum technique to calculate the cumulative sum of the array elements
            arr[i] = arr[i] + arr[i-1];
        }
        int maxi = arr[k-1], currsum = maxi;
        for(int i=k; i < arr.length; i++){
            currsum  = arr[i] - arr[i-k];
            maxi  = Math.max(maxi, currsum); 
        }
        return maxi;
    }
}
