import java.util.Arrays;
import java.util.PriorityQueue;

public class Number_23 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(5);
        ListNode[] lists = {l1, l2};
        ListNode.print(mergeKLists(lists));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(-1);
        ListNode p = result;
        if (lists.length == 0) {
            return result.next;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (null != node) {
                pq.add(node);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            p = p.next;
        }
        return result.next;
    }
}
