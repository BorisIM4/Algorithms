package L1_Sorting_Algorithms.L3_Selection_Sort;

public class SelectionSort {

    //20, 30, 10, 70, 60, 40, 50, 80, 90

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElementPosition = i;
            int minElement = array[i];

            for (int j = i + 1; j < array.length; j++) {
                int testedElement = array[j];

                if (testedElement < minElement) {
                    minElement = testedElement;
                    minElementPosition = j;
                }
            }
            array[minElementPosition] = array[i];
            array[i] = minElement;
        }
    }

}
