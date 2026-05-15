package versaoJava.remove_duplicates;

public class RemoveDuplicates {

    public ListNode remove(ListNode head) {

        ListNode current = head;

        while (current != null && current.getNext() != null) {

            if (current.getVal() == current.getNext().getVal()) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }

        return head;
    }
}

class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(3);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);

        ListNode current = listNode1;

        while (current != null) {
            System.out.print(" " + current.getVal());
            current = current.getNext();
        }
        System.out.println();

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        current = removeDuplicates.remove(listNode1);

        while (current != null) {
            System.out.print(" " + current.getVal());
            current = current.getNext();
        }
    }
}