package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.Arrays;

import static com.wk.SuppressConstant.UNUSED;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/8/28 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address:
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 移动零

 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 示例:

 输入: [0,1,0,3,12]
 输出: [1,3,12,0,0]
 说明:

 必须在原数组上操作，不能拷贝额外的数组。
 尽量减少操作次数。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/move-zeroes
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q283 implements Q {
    @Override
    public void answer() {
        int[] nums={1,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 思路：遍历数组，如果找到0，记下当前0的个数，这时候0都是在一起的，
     * 找到非0的数字时候，让第一个0与它调换位置
     * */
    private void moveZeroes(int[] nums) {
        if(nums==null || nums.length<=1){
            return;
        }
        //0的个数
        int zeroCount=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                zeroCount++;
            }else{
                if(zeroCount==0) {
                    continue;
                }
                nums[i]=nums[i]^nums[i-zeroCount];
                nums[i-zeroCount]=nums[i]^nums[i-zeroCount];
                nums[i]=nums[i]^nums[i-zeroCount];
            }
        }
    }
}
