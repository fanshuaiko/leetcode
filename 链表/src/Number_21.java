public class Number_21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(5);

        ListNode.print(  mergeTwoLists(l1, l2));
    }


    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 虚拟头结点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while (l1 != null && l2 != null) {
            // 比较 l1 和 l2
            // 将值较小的的节点接到 p 指针
            if (l1.val > l2.val) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            // p 指针不断前进
            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        }

        if (l2 != null) {
            p.next = l2;
        }

        return dummy.next;
    }

}
