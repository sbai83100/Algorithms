package Support;

public class SortingSupport {
    
    public static void printArray(int[] A) {
        if (A.length == 0) return;

        System.out.print(0);
        for (int i = 1; i < A.length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();

        System.out.print(A[0]);
        for (int i = 1; i < A.length; i++) {
            System.out.print("\t" + A[i]);
        }
        System.out.println();
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
