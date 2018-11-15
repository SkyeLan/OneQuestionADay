package Easy;

public class _0014_FirstPositionOfTarget {
    /**
     * @param nums:   The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public static int binarySearch(int[] nums, int target) {
        // write your code here
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        if (nums[start] == target)
            return start;
        if (nums[end] == target)
            return end;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10};
        int target = 9;
        int index = binarySearch(nums, target);
        System.out.println(index);
    }
}
