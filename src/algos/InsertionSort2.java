package algos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort2 {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        for(int i=1; i<n; i++){
            int element = arr[i];
            int j = i;
            while((j>0) && (element < arr[j-1])){ // (j>0) needs to be checked first
                arr[j] = arr[j-1];                  // otherwise index will go out of bound
                j = j-1;
            }
            arr[j] = element;
            printArray(arr);
        }

    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
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

        insertionSort2(n, arr);

        scanner.close();
    }
}

