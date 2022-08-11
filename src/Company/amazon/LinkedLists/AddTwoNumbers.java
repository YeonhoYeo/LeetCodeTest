package Company.amazon.LinkedLists;

import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4, l3);
        ListNode l2 = new ListNode(2, l4);

        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(6, n5);
        ListNode n4 = new ListNode(5, n6);

        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(0);

        ListNode aa = new ListNode(9);
        ListNode bb = new ListNode(1);
        bb.next = new ListNode(9);
        bb.next.next = new ListNode(9);
        bb.next.next.next = new ListNode(9);
        bb.next.next.next.next = new ListNode(9);
        bb.next.next.next.next.next= new ListNode(9);
        bb.next.next.next.next.next.next = new ListNode(9);
        bb.next.next.next.next.next.next.next = new ListNode(9);
        bb.next.next.next.next.next.next.next.next = new ListNode(9);
        bb.next.next.next.next.next.next.next.next.next = new ListNode(9);


        ListNode listNode = addTwoNumbers(l2, n4);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode rtnNode = listNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int intl1 = l1 != null ? l1.val : 0;
            int intl2 = l2 != null ? l2.val : 0;
            int sum = carry + intl1 + intl2;
            carry = (sum) / 10;
            listNode.next = new ListNode((sum) % 10);
            listNode = listNode.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return rtnNode.next;
    }
}
