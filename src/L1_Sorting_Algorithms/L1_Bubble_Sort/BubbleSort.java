package L1_Sorting_Algorithms.L1_Bubble_Sort;

public class BubbleSort {
    /*
       Bubble sort algorithm work by swapping adjacent elements if they're not in the desired order.
       This process repeats from the beginning of the array until all elements are in order.
       All elements are in order when we manage to do the whole iteration without swapping at all
       - then all elements we compared were in the desired order with their adjacent elements,
       and by extension, the whole array.
       */
    public static void sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                int firstElement = arr[j];
                int secondElement = arr[j + 1];

                if (firstElement > secondElement) {
                    int controlElement = secondElement;
                    arr[j] = controlElement;
                    arr[j + 1] = firstElement;
                }
            }
        }
    }
}
