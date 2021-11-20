/**
 * @ClassName Number_11
 * @Description 11. 盛最多水的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 * @Author fan
 * @CreateTime 2021/11/20 8:35 下午
 * @Version 1.0
 */
public class Number_11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        if (n < 2) {
            return 0;
        }
        int res = 0, left = 0;
        int right = n - 1;
        while (left < right) {
            res = height[left] > height[right] ? Math.max(res, (right - left) * height[right--]) : Math.max(res, (right - left) * height[left++]);
        }
        return res;
    }
}
