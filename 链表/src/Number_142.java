public class Number_142 {
    public static void main(String[] args) {
        ListNode head = ListNode.generate(5);
        head.next.next.next.next.next=head.next;
        ListNode.print(detectCycle(head));
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head, low = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
            if (fast == low) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        low = head;
        while (fast != low) {
            fast = fast.next;
            low = low.next;
        }
        return low;
    }
}
