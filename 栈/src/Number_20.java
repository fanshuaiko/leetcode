import java.util.Stack;

/**
 * @ClassName Number_20
 * @Description 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author fan
 * @CreateTime 2021/11/20 11:04 上午
 * @Version 1.0
 */
public class Number_20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
        String s2 = "(]";
        System.out.println(isValid(s2));
    }
    public static boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char ch:array){
            if(ch =='('){
                stack.push(')');
            }
            else if(ch =='{'){
                stack.push('}');
            }
            else if(ch =='['){
                stack.push(']');
            }else
            if(stack.isEmpty()||stack.pop()!=ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
