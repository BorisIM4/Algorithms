package L1_Sorting_Algorithms.L6_Quick_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //90, 80, 70, 60, 50, 40, 30, 20, 10
        //20, 30, 10, 70, 60, 40, 50, 80, 90
        int[] array = new int[] {20, 30, 10, 70, 60, 40, 50, 80, 90};

        QuickSort.sortingInteger(array);

        printSortedArray(array);
    }

    private static void printSortedArray(int[] array) {
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
