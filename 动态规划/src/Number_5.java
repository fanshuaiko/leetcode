/**
 * @ClassName Number_5
 * @Description 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 *
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ac"
 * 输出："a"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author fan
 * @CreateTime 2021/11/7 4:41 下午
 * @Version 1.0
 */
public class Number_5 {
    public static void main(String[] args) {
        String s = "cccc";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        boolean[][] si = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            si[i][i] = true;
        }
        int max = 0;
        int index = 0;
        char[] ch = s.toCharArray();
        for (int len = 1; len <= s.length(); len++) {
            for (int l = 0; l < s.length(); l++) {
                int r = l + len;
                if (r >= s.length()) {
                    break;
                }
                if (ch[r] == ch[l]) {
                    if (r - l < 3) {
                        si[l][r] = true;
                    } else if (si[l + 1][r - 1]) {
                        si[l][r] = true;
                    }
                    if (si[l][r] && r - l > max) {
                        index = l;
                        max = r - l;
                    }
                }
            }
        }
        return s.substring(index, index + max + 1);
    }
}
