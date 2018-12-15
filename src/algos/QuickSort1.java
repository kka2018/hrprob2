package algos;

import java.util.*;

public class QuickSort1 {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int pivot = arr[0];
        int j=0;
        int n = arr.length;
        int[] part = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i] < pivot){
                part[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == pivot) {
                part[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > pivot) {
                part[j] = arr[i];
                j++;
            }
        }
        return part;
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

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }



        scanner.close();
    }
}

