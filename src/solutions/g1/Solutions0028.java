package solutions.g1;


import dfficulty.Easy;

/**
 *28. 找出字符串中第一个匹配项的下标
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。
 */
public class Solutions0028 implements tags.String, Easy{

    //示例 1：
    //
    //输入：haystack = "sadbutsad", needle = "sad"
    //输出：0
    //解释："sad" 在下标 0 和 6 处匹配。
    //第一个匹配项的下标是 0 ，所以返回 0 。
    //示例 2：
    //
    //输入：haystack = "leetcode", needle = "leeto"
    //输出：-1
    //解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。

    public static int f(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        //
        String haystack = "sadbutsad"; String needle = "sad";
//        String haystack = "leetcode";  String needle = "leeto";

        System.out.println(f(haystack,needle));
    }


}
