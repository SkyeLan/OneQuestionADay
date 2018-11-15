public class _463_SortIntegers {
    public static void maopaoSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 2, 1, 4, 5};
        maopaoSort(A);
        System.out.println(A);
    }
}
