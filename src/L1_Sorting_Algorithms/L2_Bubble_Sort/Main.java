package L1_Sorting_Algorithms.L2_Bubble_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[] {20, 30, 10, 60, 40, 50};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                int firstElement = array[j];
                int secondElement = array[j + 1];

                if (firstElement > secondElement) {
                    int controlElement = firstElement;
                    array[j] = secondElement;
                    array[j + 1] = controlElement;
                }

            }

        }

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
