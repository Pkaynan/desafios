package versaoJava.RemoveDuplicatesfromSortedListII;

public class RemoveDuplicates2 {

    public ListNode2 deleteDuplicates(ListNode2 head) {
        if (head == null) {
            return head;
        }

        ListNode2 dummy = new ListNode2(-999);
        dummy.setNext(head);

        ListNode2 previous = dummy;
        ListNode2 current = head;

        while (current != null && current.getNext() != null) {

            if (current.getVal() == current.getNext().getVal()) {

                while (current.getNext() != null && current.getVal() == current.getNext().getVal()) {
                    current = current.getNext();
                }

                previous.setNext(current.getNext());

            } else {
                previous = previous.getNext();
            }

            current = current.getNext();
        }

        head = dummy.getNext();
        return head;
    }
}

class Main {
    public static void main(String[] args) {

        ListNode2 listNode1 = new ListNode2(1);
        ListNode2 listNode2 = new ListNode2(1);
        ListNode2 listNode3 = new ListNode2(1);
        ListNode2 listNode4 = new ListNode2(2);
        ListNode2 listNode5 = new ListNode2(3);
        ListNode2 listNode6 = new ListNode2(5);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);

        ListNode2 current = listNode1;
        while (current != null) {
            System.out.print(current.getVal() + " ");
            current = current.getNext();
        }

        System.out.println();

        RemoveDuplicates2 remove = new RemoveDuplicates2();
        current = remove.deleteDuplicates(listNode1);

        while (current != null) {
            System.out.print(current.getVal() + " ");
            current = current.getNext();
        }
    }
}