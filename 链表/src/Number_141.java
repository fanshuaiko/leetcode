public class Number_141 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next =l1;
        System.out.println(hasCycle(l1));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head, low = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
            if (fast == low) {
                return true;
            }
        }
        return false;
    }
}
