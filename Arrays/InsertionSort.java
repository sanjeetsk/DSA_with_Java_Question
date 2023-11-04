package Arrays;
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
        for (int i=0; i<n; i++){
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
