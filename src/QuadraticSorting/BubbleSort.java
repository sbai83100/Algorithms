package QuadraticSorting;

import Interfaces.SortingAlgorithm;
import Support.SortingSupport;

public class BubbleSort implements SortingAlgorithm {
    
    public static void bubbleSort(int[] A) {
        for (int i = A.length-1; i >= 1; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (A[j] > A[j+1]) {
                    SortingSupport.swap(A, j, j+1);
                }
            }
        }
    }

    public void sort(int[] A) {
        for (int i = A.length-1; i >= 1; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (A[j] > A[j+1]) {
                    SortingSupport.swap(A, j, j+1);
                }
            }
        }
    }
}
