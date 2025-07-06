package solutions;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
 */
public class Solutions0003 implements tags.HashTable,tags.String,dfficulty.Medium{
    /*
    示例 1:

    输入: s = "abcabcbb"
    输出: 3
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    示例 2:

    输入: s = "bbbbb"
    输出: 1
    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
    示例 3:

    输入: s = "pwwkew"
    输出: 3
    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
         请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */

    public static int f(String s) {

        char[] chars = s.toCharArray();
        Map<Character, String> map = new HashMap<>();

        String s1 ="";
        String s2 = "";
        for(char c :chars){
            if (!map.containsKey(c)){
                s2 = s2 + c;
                map.put(c,s2);
            }else{
//               String s3 = map.get(c);
                map.clear();
                if(s2.length()>s1.length()) {
                    s1 = s2;
                    s2 = "" + c;
                    map.put(c,s2);
                }
            }
        }
        System.out.println(s1);

        return s1.length();
    }

    // 只适合小写字母！
    public static int f2(String s) {
        int[] cnt = new int[128];
        int ans = 0, n = s.length();
        for (int l = 0, r = 0; r < n; ++r) {
            char c = s.charAt(r);
            ++cnt[c];
            while (cnt[c] > 1) {
                --cnt[s.charAt(l++)];
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(f("pwwkew"));
        System.out.println(f2("pwwkew"));

        System.out.println(f("pWWkew"));
        System.out.println(f2("pWWkew"));

    }
}
