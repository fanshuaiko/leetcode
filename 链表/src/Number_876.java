public class Number_876 {
    public static void main(String[] args) {
        ListNode generate = ListNode.generate(6);
        ListNode.print(generate);
        System.out.println();
        ListNode.print(middleNode(generate));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head, low = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
}
