import java.util.Random;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void print(ListNode node) {
        if (null == node) {
            System.out.println("null");
            return;
        }
        while (node != null) {
            System.out.print(node.val + ",");
            node = node.next;
        }
    }

    public static ListNode generate(int length) {
        ListNode head = new ListNode(new Random().nextInt());
        ListNode p = head;
        while (length != 1) {
            p.next = new ListNode(new Random().nextInt());
            p = p.next;
            length--;
        }
        return head;
    }

}
