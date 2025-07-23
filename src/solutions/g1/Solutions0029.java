package solutions.g1;



/**
 *给你两个整数，被除数 dividend 和除数 divisor。将两数相除，要求 不使用 乘法、除法和取余运算。
 *
 * 整数除法应该向零截断，也就是截去（truncate）其小数部分。例如，8.345 将被截断为 8 ，-2.7335 将被截断至 -2 。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的 商 。
 *
 * 注意：假设我们的环境只能存储 32 位 有符号整数，其数值范围是 [−231,  231 − 1] 。本题中，如果商 严格大于 231 − 1 ，则返回 231 − 1 ；如果商 严格小于 -231 ，则返回 -231 。
 */
public class Solutions0029 implements tags.String, dfficulty.Medium{

    //
    //
    //示例 1:
    //
    //输入: dividend = 10, divisor = 3
    //输出: 3
    //解释: 10/3 = 3.33333.. ，向零截断后得到 3 。
    //示例 2:
    //
    //输入: dividend = 7, divisor = -3
    //输出: -2
    //解释: 7/-3 = -2.33333.. ，向零截断后得到 -2 。

    public static int f(int dividend, int divisor) {
        //its int !
        return dividend/divisor;
    }


    public int divide(int a, int b) {
        if (b == 1) {
            return a;
        }
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        boolean sign = (a > 0 && b > 0) || (a < 0 && b < 0);
        a = a > 0 ? -a : a;
        b = b > 0 ? -b : b;
        int ans = 0;
        while (a <= b) {
            int x = b;
            int cnt = 1;
            while (x >= (Integer.MIN_VALUE >> 1) && a <= (x << 1)) {
                x <<= 1;
                cnt <<= 1;
            }
            ans += cnt;
            a -= x;
        }
        return sign ? ans : -ans;
    }
    public static void main(String[] args) {

//        int dividend = 10, divisor = 3;
        int dividend = 7, divisor = -3;

        System.out.println(f(dividend,divisor));
    }


}
