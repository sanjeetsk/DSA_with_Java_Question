package Arrays;
// Question

// You are given an integer array arr of size n. Find if the array contains any duplicates.

// Input Format
// The first line of input contains the integer n i.e. size of the array

// The next line contains n spaced array integers.

// Output Format
// For each test case , print true if duplicates are present or print false if duplicates are not present.

// Example 1
// Input

// 4
// 1 2 3 1
// Output

// true
// Explanation

// 1 is duplicate here.

// Example 2
// Input

// 4
// 1 2 3 4
// Output

// false
// Explanation

// No duplicate present.

// Constraints
// 1 <= n <= 10^4

// 0 <= arr[i] <= 10^5


// Solution

import java.util.*;

class ContainsDuplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findDuplicate(arr));
    }

    public static boolean findDuplicate(int[] num){
        if(num.length == 1){
            return false;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            map.put(num[i], map.getOrDefault(num[i], 0)+1);
            if(map.containsKey(num[i]))
            {
                if(map.get(num[i]) >= 2){
                    return true;
                }
            }
        }

        return false;
    }
}