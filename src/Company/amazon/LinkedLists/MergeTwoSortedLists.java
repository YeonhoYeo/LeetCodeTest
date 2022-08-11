package Company.amazon.LinkedLists;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoLists(list1, list2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode();
        ListNode rtnNode = listNode;

        while (list1 != null || list2 != null) {
            if ( list1 != null && list2 != null) {
                if ( list1.val <= list2.val ) {
                    listNode.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    listNode.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            } else if ( list1 == null && list2 != null ) {
                listNode.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if ( list1 != null && list2 == null ) {
                listNode.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                break;
            }
            listNode = listNode.next;
        }
        return rtnNode.next;
    }

}
