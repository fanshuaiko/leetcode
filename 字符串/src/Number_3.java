import java.util.HashSet;

/**
 * @ClassName Number_3
 * @Description
 * @Author fan
 * @CreateTime 2021/11/21 10:45 上午
 * @Version 1.0
 */
public class Number_3 {
    public static void main(String[] args) {
        String s =
                "aab";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int n = s.length();
        if(n<2){ return n;}
        int right = 1, start = 0, res = 0;
        set.add(s.charAt(start));
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                res = Math.max(set.size(), res);
            } else {
                set.remove(s.charAt(start));
                start++;
                set.add(s.charAt(right));
            }
            right++;
        }
        return res;
    }
}
