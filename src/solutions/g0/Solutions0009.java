package solutions.g0;


/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Solutions0009 implements tags.Math,dfficulty.Easy{
    /*
    例如，121 是回文，而 123 不是。
     */
    public static Boolean f(int x) {
        //个位数 -负数 不是回文
        if (x < 0 || (x > 0 && x % 10 == 0)){
            return false;
        }
        int a = 0;
        int b = x;
        while (b>0){
            a=b%10+a*10;
            b=b/10;
        }
        return a==x;
    }
    public static boolean f2(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int y = 0;
        for (; y < x; x /= 10) {
            y = y * 10 + x % 10;
        }
        return x == y || x == y / 10;
    }

    public static void main(String[] args) {

        System.out.println(f(12121));

        System.out.println(f(11));
        System.out.println(f(0));


    }
}
