package QuadraticSorting;
import Support.*;

public class SelectionSort {
    
    public static void selectionSort(int[] A) {
        for (int i = A.length-1; i >= 1; i--) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (A[j] > A[k]) {
                    k = j;
                }
            }
            SortingSupport.swap(A, k, i);
        }
    }
}
