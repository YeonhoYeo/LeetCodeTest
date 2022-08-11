package Company.amazon.LinkedLists;

import java.util.List;

public class ReverseNodesinkGroup {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        //ListNode listNode = reverseLinkedList(head, k);
        ListNode listNode = reverseKGroup(head, k);

        ptintListNode(listNode);
    }

    public static void ptintListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("");
    }

    public static ListNode reverseLinkedList(ListNode head, int k) {
        ListNode prev = null;
        ListNode cur = head;
        while (k > 0) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            k--;
        }
        return prev;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        ListNode newHead = null;
        ListNode tail = null;
        while (cur != null) {
            int count = 0;
            cur = head;
            while (count < k && cur != null) {
                cur = cur.next;
                count++;
            }
            if (count == k) {
                ListNode temp = reverseLinkedList(head, k);
                if ( newHead == null ) newHead = temp;
                if ( tail != null ) tail.next = temp;
                tail = head;
                head = cur;
            }
        }
        if (tail != null) tail.next = head;
        return newHead != null ? newHead : head;
    }
}
