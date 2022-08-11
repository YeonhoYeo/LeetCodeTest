package Company.amazon.LinkedLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MergekSortedLists {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);

        ListNode[] lists = {head1, head2, head3};

        ListNode listNode = mergeKLists(lists);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) return null;

        ListNode cur = null;
        ListNode rtnVal = null;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                al.add(temp.val);
                temp = temp.next;
            }

        }

        Collections.sort(al);
        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            if (i == 0) {
                cur = new ListNode(al.get(i));
                rtnVal = cur;
            } else {
                System.out.println(i + " : " + al.get(i));
                cur.next = new ListNode(al.get(i));
                cur = cur.next;
            }
        }

        return rtnVal;
    }
}
