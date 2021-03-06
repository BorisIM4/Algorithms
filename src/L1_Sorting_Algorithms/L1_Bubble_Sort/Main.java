package L1_Sorting_Algorithms.L1_Bubble_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //90, 80, 70, 60, 50, 40, 30, 20, 10
        //20, 30, 10, 70, 60, 40, 50, 80, 90
        int[] array = new int[] {90, 80, 70, 60, 50, 40, 30, 20, 10};


        /*
        Bubble sort algorithm work by swapping adjacent elements if they're not in the desired order.
        This process repeats from the beginning of the array until all elements are in order.
        All elements are in order when we manage to do the whole iteration without swapping at all
        - then all elements we compared were in the desired order with their adjacent elements,
        and by extension, the whole array.
        */
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                int firstElement = array[j];
                int secondElement = array[j + 1];

                if (firstElement > secondElement) {
                    int controlElement = secondElement;
                    array[j] = controlElement;
                    array[j + 1] = firstElement;
                }
            }
        }

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
