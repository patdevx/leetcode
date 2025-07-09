package solutions;


import dataStructure.ListNode;
import dfficulty.Easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Solutions0021 implements tags.LinkedList,tags.Recursion, Easy{

    //输入：l1 = [1,2,4], l2 = [1,3,4]
    //输出：[1,1,2,3,4,4]

    public static ListNode f(ListNode list1, ListNode list2 ) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.getVal()>list2.getVal()){
            ListNode next = list2.getNext();
            list2.setNext(f(list1 ,next));
            return list2;
        }else {
            ListNode next = list1.getNext();
            list1.setNext(f(list2,next));
            return list1;
        }
    }

    public static void main(String[] args) {
//        f("()[]{}");
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.setNext(a2);a2.setNext(a3);

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.setNext(b2);b2.setNext(b3);

        ListNode c = f(a1,b1);
        System.out.println(c);
    }


}
