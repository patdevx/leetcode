package solutions.g0;

import dataStructure.ListNode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Solutions0002 implements tags.LinkedList,tags.Math,tags.Recursion,dfficulty.Medium{
    /*
    输入：l1 = [2,4,3], l2 = [5,6,4]
    输出：[7,0,8]
    解释：342 + 465 = 807.
     */
    public static ListNode f(ListNode l1, ListNode l2) {
        if(l1 == null){
            return null;
        }
        if(l2 == null){
            return null;
        }
        ListNode l3 = new ListNode(l1.getVal() + l2.getVal());

        l3.setNext(f(l1.getNext(),l2.getNext()));

        //逢十进一
        ListNode n=l3.getNext();
        if(n!=null){
            int i = n.getVal();
            if (i>=10){
                l3.setVal(l3.getVal()+i/10);
                n.setVal(i%10);
            }
        }
        return l3;
    }


    public static ListNode f2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode cur = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            int s = (l1 == null ? 0 : l1.getVal()) + (l2 == null ? 0 : l2.getVal()) + carry;
            carry = s / 10;
            cur.setNext(new ListNode(s % 10));
            cur = cur.getNext();
            l1 = l1 == null ? null : l1.getNext();
            l2 = l2 == null ? null : l2.getNext();
        }
        return dummy.getNext();
    }
    public static void main(String[] args) {

        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        a1.setNext(a2);a2.setNext(a3);

        ListNode a4 = new ListNode(4);
        a3.setNext(a4);

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);
        b1.setNext(b2);b2.setNext(b3);

        ListNode b4 = new ListNode(4);
        b3.setNext(b4);
        ListNode c = f(a1,b1);

//        ListNode c = f2(a1,b1);



    }
    public static String getVal(ListNode l1){
        StringBuffer sb = new StringBuffer(""+l1.getVal());
        if(l1.getNext()!=null){
            sb.append(getVal(l1.getNext()));
        }

        return sb.toString();
    }


}
