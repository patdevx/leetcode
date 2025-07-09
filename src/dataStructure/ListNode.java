package dataStructure;

public class ListNode {
    private int val;
    private ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getNext() {
        return next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer("val=" + this.val);
        if (this.next != null){
            s.append("\t next" + next.toString());
        }
        return s.toString();
    }
}
