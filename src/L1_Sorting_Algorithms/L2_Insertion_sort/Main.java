package L1_Sorting_Algorithms.L2_Insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //90, 80, 70, 60, 50, 40, 30, 20, 10
        //20, 30, 10, 70, 60, 40, 50, 80, 90
        int[] array = new int[] {90, 80, 70, 60, 50, 40, 30, 20, 10};

        insertionSort(array);

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
    }
}
