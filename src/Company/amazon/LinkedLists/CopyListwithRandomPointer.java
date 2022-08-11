package Company.amazon.LinkedLists;

public class CopyListwithRandomPointer {

    public static void main(String[] args) {
        ListNodeRandom head = new ListNodeRandom(7);
        head.next = new ListNodeRandom(13);
        head.next.next = new ListNodeRandom(11);
        head.next.next.next = new ListNodeRandom(10);
        head.next.next.next.next = new ListNodeRandom(1);

        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        ListNodeRandom listNodeRandom = copyRandomList(head);
        //ListNode listNode = reverseKGroup(head, k);

        while (listNodeRandom != null) {
            System.out.print(listNodeRandom.val + " : ");
            System.out.println(listNodeRandom.random != null ? listNodeRandom.random.val : "");
            listNodeRandom = listNodeRandom.next;
        }

    }

    public static ListNodeRandom copyRandomList(ListNodeRandom head) {
        if ( head == null ) return null;

        ListNodeRandom curNode = head;
        while ( curNode != null ) {
            ListNodeRandom cloneNode = new ListNodeRandom(curNode.val);
            cloneNode.next = curNode.next;
            curNode.next = cloneNode;
            curNode = cloneNode.next;
        }

        curNode = head;
        while ( curNode != null) {
            curNode.next.random = curNode.random != null ? curNode.random.next : null;
            curNode = curNode.next.next;
        }

        ListNodeRandom oldNode = head;
        ListNodeRandom newNode = head.next;
        ListNodeRandom rtnNode = head.next;
        while ( oldNode != null ) {
            oldNode.next = newNode.next;
            oldNode = oldNode.next;
            newNode.next = (oldNode != null ? oldNode.next : null);
            newNode = newNode.next;
        }

        return rtnNode;
    }
}
