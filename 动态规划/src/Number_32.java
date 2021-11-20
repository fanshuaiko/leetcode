/**
 * @ClassName Number_32
 * @Description 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 * 示例 2：
 *
 * 输入：s = ")()())"
 * 输出：4
 * 解释：最长有效括号子串是 "()()"
 * 示例 3：
 *
 * 输入：s = ""
 * 输出：0
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 3 * 104
 * s[i] 为 '(' 或 ')'
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author fan
 * @CreateTime 2021/11/20 2:20 下午
 * @Version 1.0
 */
public class Number_32 {
    public static void main(String[] args) {
        String s = "()(())";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        int[] dp = new int[s.length()];
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')' && s.charAt(i - 1) == '(') {
                dp[i] = i >= 2 ? dp[i - 2] + 2 : 2;
            } else if (ch == ')' && i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                dp[i] = dp[i - 1] + 2 + ((i - dp[i - 1] - 2) >= 0 ? dp[i - dp[i - 1] - 2] : 0);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
