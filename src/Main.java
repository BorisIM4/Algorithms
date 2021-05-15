import L1_Sorting_Algorithms.L1_Bubble_Sort.BubbleSort;
import L1_Sorting_Algorithms.L2_Insertion_sort.InsertionSort;
import L1_Sorting_Algorithms.L6_Quick_Sort.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //90, 80, 70, 60, 50, 40, 30, 20, 10
        //20, 30, 10, 70, 60, 40, 50, 80, 90
        int[] array = new int[] {20, 30, 10, 70, 60, 40, 50, 80, 90};

        //Print array before sorting
        System.out.println("This is unsorted array:");
        printArray(array);
        System.out.println();

        //Call one of the sorting algorithms
        //Bubble, insertion.....
//        BubbleSort.sortArray(array);
        InsertionSort.sort(array);
//        QuickSort.sortingInteger(array);

        //Print sorted array
        System.out.println("This is sorted array:");
        printArray(array);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}

