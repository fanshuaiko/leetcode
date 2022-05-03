public class Number_19 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode.print(removeNthFromEnd(l1, 2));
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode node = findNthFromEnd(result, n + 1);
        node.next = node.next.next;
        return result.next;
    }

    public static ListNode findNthFromEnd(ListNode head, int n) {
        ListNode p1 = head, p2 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
