public class Number_160 {
    public static void main(String[] args) {
        ListNode same = ListNode.generate(3);
        ListNode generate1 = ListNode.generate(2);
        ListNode generate2 = ListNode.generate(3);
        generate1.next.next = same;
        generate2.next.next.next = same;
        ListNode.print(same);
        System.out.println();
        ListNode.print(getIntersectionNode(generate1, generate2));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
