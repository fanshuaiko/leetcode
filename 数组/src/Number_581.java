import java.util.Arrays;

/**
 * @ClassName Number_581
 * @Description 581. 最短无序连续子数组
 * https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
 * @Author fan
 * @CreateTime 2021/11/20 5:21 下午
 * @Version 1.0
 */
public class Number_581 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(findUnsortedSubarray(nums));
        System.out.println(findUnsortedSubarray2(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int[] sortNum = new int[nums.length];
        System.arraycopy(nums, 0, sortNum, 0, nums.length);
        Arrays.sort(sortNum);
        int left = 0, right = nums.length - 1;
        while (left < nums.length && nums[left] == sortNum[left]) {
            left++;
        }
        while (right >= 0 && nums[right] == sortNum[right]) {
            right--;
        }
        return right > left ? right - left + 1 : nums.length;
    }

    public static int findUnsortedSubarray2(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int left = -1, right = -1, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                right = i;
            } else {
                min = nums[i];
            }
            if (nums[n - i - 1] > max) {
                left = n - i - 1;
            } else {
                max = nums[n - i - 1];
            }
        }
        return right < 0 ? 0 : right - left + 1;
    }
}
