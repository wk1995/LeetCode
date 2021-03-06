package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/intersection-of-two-arrays/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 两个数组的交集
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q349 implements Q {
    @Override
    public void answer() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4
        };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums1) {
            hashSet.add(i);
        }
        for (int num : nums2) {
            if (hashSet.contains(num)) {
                result.add(num);
                hashSet.remove(num);
            }
        }
        int resultSize = result.size();
        int[] resultInt = new int[resultSize];
        for (int i = 0; i < resultSize; i++) {
            resultInt[i] = result.get(i);
        }
        return resultInt;
    }
}
