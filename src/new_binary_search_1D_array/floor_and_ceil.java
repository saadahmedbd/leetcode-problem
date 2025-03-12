package new_binary_search_1D_array;

import java.util.ArrayList;
import java.util.List;

public class floor_and_ceil {
    public static void main(String[] args) {
        int nums[] = {3, 4, 4, 7, 8, 10};
        int target = 5;
        System.out.println(floor(nums, target));
        System.out.println(ceil(nums, target));
        System.out.println(floor2(nums,target));
        System.out.println(ceil2(nums, target));
    }

    public static int floor(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = start - 1;
            } else {
                return mid;
            }
        }
        return nums[end];

    }

    public static int ceil(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = start - 1;
            } else {
                return mid;
            }
        }
        return nums[start];
    }

    public static int floor2(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MIN_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                ans = Math.max(ans, nums[mid]);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int ceil2(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {

                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
