import java.awt.*;
import java.util.Arrays;

public class ReverseLinkedList_206 {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode reversedHead = reverseList(head);
        while(reversedHead != null){
            System.out.println(reversedHead.val);
            reversedHead = reversedHead.next;
        }

    }
}
