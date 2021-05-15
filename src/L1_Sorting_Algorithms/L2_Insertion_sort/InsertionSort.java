package L1_Sorting_Algorithms.L2_Insertion_sort;

public class InsertionSort {

    //20, 30, 10, 70, 60, 40, 50, 80, 90

    public static void sort(int[] array) {
        //Move trough every elements
        //Element at index zero is sorted array, that's why we start from element at index 1.
        for (int i = 1; i < array.length; i++) {
            //take element at current index
            int currentElement = array[i];

            //Create control number to check is there any more element on the left towards current element
            int controlNUmber = i - 1;
            //Check is there more element on the left of current element. If TRUE, check is current element is smaller than previous.
            while (controlNUmber >= 0 && currentElement < array[controlNUmber]) {
                //If both conditions are true swap previous element to the right
                array[controlNUmber + 1] = array[controlNUmber];
                //Decreasing value with 1 to check in condition again is there any more element on the left
                controlNUmber--;
            }

            //Overwrite currentElement or on his original position, or on the last position of controlNUmber + 1
            array[controlNUmber + 1] = currentElement;
        }

    }
}
