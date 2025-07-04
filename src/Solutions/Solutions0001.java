package Solutions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 *
 * 你可以按任意顺序返回答案。
 */
public class Solutions0001 implements tags.HashTable, tags.Array, dfficulty.Easy {

    //Two Sum
    //Tags 	Array,Hash Table

    /*
    示例 1：
    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     */
    // 暴力法，
    public static int[] f(int[] nums, int target){
        int[] returnNums = new int[]{-1,-1};
        for (int i =0 ;i<nums.length; i++ ){
           /* if(nums[i]>target){
                continue;
            }*/
            for (int j=i+1 ; j<nums.length ; j++){
                if (nums[i] +nums[j] == target){
                   returnNums[0] = i;
                   returnNums[1] = j;
                   return returnNums;
               }
            }
        }
        return returnNums;
    }
    //hash表 nums 需为不可重复的
    public static int[] f2(int[] nums, int target){
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0;i<nums.length; ++i) {
           int j = nums[i];
           int k = target - j;
           if(d.containsKey(j)){
               return new int[]{d.get(j),i};
           }
           d.put(k,i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{21, 12, 7, 7, 6};
        int target = 11;
        int[] returnNums;
//        nums = new int[]{21, 12, 7, 8, 6};
        returnNums = f(nums,14);
        returnNums = f2(nums,target);

        System.out.println(Arrays.toString(nums) + "\t target :" +target);
        System.out.println("returnNums ："+Arrays.toString(returnNums));
    }
}
