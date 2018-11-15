package Naive;

public class _0484_SwapTwoIntegersInArray {
    /**
     * @param A:      An integer array
     * @param index1: the first index
     * @param index2: the second index
     * @return: nothing
     */
    public static void swapIntegers(int[] A, int index1, int index2) {
        // write your code here
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }


    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};
        int index1 = 2;
        int index2 = 3;
        swapIntegers(A, index1, index2);
    }
}
