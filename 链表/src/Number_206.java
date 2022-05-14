/**
 * @Author fan
 * @CreateTime 2022/5/6 19:19
 * @Description
 */
public class Number_206 {
    public static void main(String[] args) {
        ListNode generate = ListNode.generate(5);
        ListNode.print(generate);
        ListNode result = reverseList(generate);
        System.out.println();
        ListNode.print(result);
        System.out.println("--------------");
        ListNode generate2 = ListNode.generate(5);
        ListNode.print(generate2);
        System.out.println();
        ListNode result2 = reverseList2(generate2);
        ListNode.print(result2);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
