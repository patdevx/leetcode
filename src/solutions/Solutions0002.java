package solutions;

import java.util.*;

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
    public ArrayDeque f(ArrayDeque l1, ArrayDeque l2) {
        return null;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<Integer>();
        l1.add(2);l1.add(4);l1.add(3);

        System.out.println(l1.getLast());
        ArrayDeque<Integer> l2 = new ArrayDeque<Integer>();
        l1.add(7);l1.add(0);l1.add(8);

    }
}
