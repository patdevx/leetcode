package solutions;


import com.sun.jmx.remote.internal.ArrayQueue;
import dfficulty.Easy;
import tags.Array;
import tags.Trie;

import java.util.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class Solutions0020 implements tags.String,tags.Stack, Easy{

    //示例 1：
    //
    //输入：s = "()"
    //
    //输出：true
    //
    //示例 2：
    //
    //输入：s = "()[]{}"
    //
    //输出：true
    //
    //示例 3：
    //
    //输入：s = "(]"
    //
    //输出：false
    //
    //示例 4：
    //
    //输入：s = "([])"
    //
    //输出：true

    public static boolean f(String s) {
        Deque<String> aque = new ArrayDeque<String>();

        char[] chars  = s.toCharArray();
        for (int i =0;i<chars.length;i++){
            String s1 = String.valueOf(chars[i]);

//            System.out.print(s1);
            if("(".equals(s1) || "[".equals(s1) || "{".equals(s1)){
                aque.add(s1);
            }else{
                String s2 = aque.getLast()+s1;
//                System.out.println(s2+"\t");
                if("()".equals(s2) || "[]".equals(s2) || "{}".equals(s2)){
//                    System.out.print(aque);
                    aque.removeLast();
//                    System.out.println(aque);
                }else{
                    return false;
                }
            }
        }

        return aque.size()==0;
    }

    public static void main(String[] args) {
//        f("()[]{}");

        System.out.println(f("([{}{}])"));
        System.out.println(f("([{}}])"));
        System.out.println(f("()[]{}"));
        System.out.println(f("[)[]{}"));

    }


}
