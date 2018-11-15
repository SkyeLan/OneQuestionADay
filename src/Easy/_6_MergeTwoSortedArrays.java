package Easy;

public class _6_MergeTwoSortedArrays {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public static int[] mergeSortedArray(int[] A, int[] B) {
        int[] merge = new int[A.length + B.length];
        int i = 0, j = 0, index = 0;
        for (; i < A.length; i++) {
            for (; j < B.length; j++) {
                if (A[i] > B[j])
                    merge[index++] = B[j];
                else
                    break;
            }
            merge[index++] = A[i];
        }
        while (j < B.length)
            merge[index++] = B[j++];
        return merge;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{2, 4, 5, 6};
        int[] newInt = mergeSortedArray(A, B);
        System.out.println(newInt.length);
    }
}
