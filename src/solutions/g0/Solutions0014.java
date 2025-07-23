package solutions.g0;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。
 */
public class Solutions0014 implements tags.Array,tags.String,tags.Trie,dfficulty.Easy{

    //示例 1：
    //
    //输入：strs = ["flower","flow","flight"]
    //输出："fl"

    public static String f(String[] strs) {

        if(strs==null||strs.length==0) {
            return "";
        }

        String s1 = strs[0];
        for(int i=0;i<strs.length;i++){
            int minl = compareTo(s1,strs[i]);
            if(minl==0){
                return "";
            }
            s1 = s1.substring(0,minl);
        }
        return s1;
    }
    public static int compareTo(String s1,String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int k = Math.min(l1,l2);
        int j =0;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        while(j<k){
            if(c1[j]!=c2[j]){
                break;
            }
            j++;
        }
        return j;
    }

    public static String f2(String[] strs) {

        int n = strs.length;
        for (int i = 0; i < strs[0].length(); ++i) {
            for (int j = 1; j < n; ++j) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }


    public static void main(String[] args) {
        String[] strs = {"flow","flower","flowc","flightcc"};
        System.out.println(f(strs));
        System.out.println(f2(strs));

    }


}
