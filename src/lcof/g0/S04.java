package lcof.g0;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 04. 二维数组中的查找
 * 题目描述
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class S04 implements tags.Array ,tags.TwoPointers, dfficulty.Medium {

    //示示例:
    //
    //现有矩阵 matrix 如下：
    //
    //[
    //  [1,   4,  7, 11, 15],
    //  [2,   5,  8, 12, 19],
    //  [3,   6,  9, 16, 22],
    //  [10, 13, 14, 17, 24],
    //  [18, 21, 23, 26, 30]
    //]
    //给定 target = 5，返回 true。
    //
    //给定 target = 20，返回 false。
    //
    //
    //
    //限制：
    //
    //0 <= n <= 1000
    //
    //0 <= m <= 1000

    //简单的循环
    public static boolean f(int[][] nums, int target){
        for (int [] i : nums){
            for (int j : i){
                if(j == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f2(int[][] nums, int target){
        for (int [] i : nums){
            int index = Arrays.binarySearch(i,target);
            if (index > -1){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [][] nums = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(f2(nums, 5));
        System.out.println(f2(nums, 20));
    }
}
