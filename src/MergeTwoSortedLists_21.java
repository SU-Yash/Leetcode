import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class MergeTwoSortedLists_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
    public static void main(String[] args){
        ListNode nodeOne = new ListNode(1);
        nodeOne.next = new ListNode(2);
        nodeOne.next.next = new ListNode(4);

        ListNode nodeTwo = new ListNode(1);
        nodeTwo.next = new ListNode(3);
        nodeTwo.next.next = new ListNode(4);

        ListNode sortedNode = mergeTwoLists(nodeOne, nodeTwo);

        while(sortedNode != null){
            System.out.println(sortedNode.val);
            sortedNode = sortedNode.next;
        }
    }
}
