package solutions.g0;


import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。
 */
public class Solutions0013 implements tags.Math,tags.String,tags.HashTable,dfficulty.Easy{
    /*
    输入: s = "III"
    输出: 3
     */
    public static String cs = "IVXLCDM";
    public static int[] vs = {1, 5, 10, 50, 100, 500, 1000};
    public static Map<Character, Integer> d = new HashMap<>();
    static {
        for (int i = 0; i < vs.length; ++i) {
            d.put(cs.charAt(i), vs[i]);
        }
    }
    public static int f(String s) {

        int length = s.length();
        int tol=d.get(s.charAt(length -1));

        for(int i = 0; i< length -1; ++i){
            int a = d.get(s.charAt(i));
            int b = d.get(s.charAt(i+1));
            if(a<b){
                tol+= -1*a;
            }else {
                tol+= a;
            }
        }

        return tol;
    }
    public static  int f2(String s) {

        int n = s.length();
        int ans = d.get(s.charAt(n - 1));
        for (int i = 0; i < n - 1; ++i) {
            int sign = d.get(s.charAt(i)) < d.get(s.charAt(i + 1)) ? -1 : 1;
            ans += sign * d.get(s.charAt(i));
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(f("MCMXCII"));

        System.out.println(f("MDCCXCII"));
//        System.out.println(f("MDXCII"));

//        System.out.println(f("MCCMXCIIII"));

//        System.out.println(f2("MCMXCIV"));

        System.out.println(f2("MCMXCII"));
        System.out.println(f2("MDCCXCII"));

//        System.out.println(f2("MCCMXCIIII"));

    }


}
