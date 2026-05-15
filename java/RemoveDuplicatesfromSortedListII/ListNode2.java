package java.RemoveDuplicatesfromSortedListII;

public class ListNode2 {
    private int val;
    private ListNode2 next;

    public ListNode2() {
    }

    public ListNode2(int val) {
        this.val = val;
    }

    public ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode2 getNext() {
        return next;
    }

    public void setNext(ListNode2 next) {
        this.next = next;
    }
}
