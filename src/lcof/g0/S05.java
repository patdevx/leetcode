package lcof.g0;


import java.util.Arrays;

/**
 * 面试题 05. 替换空格
 * 题目描述
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class S05 implements tags.String, dfficulty.Easy {

    //示例 1：
    //
    //输入：s = "We are happy."
    //输出："We%20are%20happy."
    //
    //
    //限制：
    //
    //0 <= s 的长度 <= 10000

    //简单的循环
    public static String f(String s){
        return s.replace(" ","%20");
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(f(s));
    }
}
