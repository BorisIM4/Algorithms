package L1_Sorting_Algorithms.L2_Insertion_sort;

public class InsertionSort {

    //20, 30, 10, 70, 60, 40, 50, 80, 90

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];

            int controlNUmber = i - 1;
            while (controlNUmber >= 0 && currentElement < array[controlNUmber]) {
                array[controlNUmber + 1] = array[controlNUmber];
                controlNUmber--;
            }

            array[controlNUmber + 1] = currentElement;
        }

    }
}
