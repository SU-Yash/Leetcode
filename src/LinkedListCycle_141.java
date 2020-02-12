import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle_141 {
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        n.next = new ListNode(2);
        n.next.next = new ListNode(3);
        n.next.next = new ListNode(4);
        n.next.next = n;
        System.out.printf("" + hasCycle(n));
    }
}
