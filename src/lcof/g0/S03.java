package lcof.g0;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class S03 implements tags.Array ,tags.HashTable, dfficulty.Easy {

    //示例 1：
    //
    //输入：
    //[2, 3, 1, 0, 2, 5, 3]
    //输出：2 或 3
    //
    //
    //限制：
    //
    //2 <= n <= 100000

    public static int f(int[] nums){
        Set<Integer> set = new HashSet();
        for(int i : nums) {
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return 0;
    }

    //先排序
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0;; ++i) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(f(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}
