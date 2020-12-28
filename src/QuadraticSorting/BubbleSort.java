package QuadraticSorting;

import Support.SortingSupport;

public class BubbleSort {
    
    public static void bubbleSort(int[] A) {

        for (int i = A.length-1; i >= 1; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (A[j] > A[j+1]) {
                    SortingSupport.swap(A, j, j+1);
                }
            }
        }
    }
}
