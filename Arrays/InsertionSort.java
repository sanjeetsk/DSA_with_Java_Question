package Arrays;

// it has two part: left side sorted and right side unsorted
// At starting take 0th element as the first sorted element
// take an element from the unsorted part
// find its correct position in sorted array

// how to find the best position:
// By comparing and shifting element
// Making some space for that element
// All the element having a larger value will be shifted to towards right one by one

// In every iteration of for loop one element from the unsorted array sfited to the sorted by finding best position




import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i=1; i<n; i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        System.out.println("After sorting :");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
