package Testing;
import QuadraticSorting.*;
import Support.*;

public class Testing {
    public static void main(String[] args) {

        int[] A = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        /*
        System.out.println("Bubble Sort");
        SortingSupport.printArray(A);
        System.out.println();
        BubbleSort.bubbleSort(A);
        SortingSupport.printArray(A);
        System.out.println();
        */

        System.out.println("Selection Sort");
        SortingSupport.printArray(A);
        System.out.println();
        SelectionSort.selectionSort(A);
        SortingSupport.printArray(A);
        System.out.println();
    }
}
