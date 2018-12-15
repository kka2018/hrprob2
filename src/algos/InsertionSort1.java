package algos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort1 {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int element = arr[n - 1];
        for(int i=n-2; i>=0; i--){
            if(arr[i] > element){
                arr[i+1] = arr[i];
                printArray(arr);
                if(i==0 && element < arr[i]){
                    arr[i] = element;
                    printArray(arr);
                }
            }
            else{
                arr[i+1] = element;
                printArray(arr);
                break;
            }
        }
    }

    static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
