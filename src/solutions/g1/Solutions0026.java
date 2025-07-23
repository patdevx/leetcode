package solutions.g1;


import dfficulty.Easy;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 *
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 *
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 */
public class Solutions0026 implements tags.Array, Easy{

    //示例 1：
    //
    //输入：nums = [1,1,2]
    //输出：2, nums = [1,2,_]
    //解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。

    public static int f(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i : nums){
            set.add(i);
        }
        return set.size();
    }

    public static int f2(int[] nums) {

        int k = 0;
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4,6,6,6,6};

        System.out.println(f(nums));
        System.out.println(f2(nums));
    }


}
