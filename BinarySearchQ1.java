package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchQ1 {
    public static void main(String[] args) {

        int[] nums = {1};
        int target = 1;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = {-1, -1};
        int i = 0;

        if (start >= nums.length && nums[start] != target) {
            return result;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        result[0] = start;

        // now end
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        result[1] = end;

        return result;
    }
}