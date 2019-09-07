package com.wk.exercise.leetcode

import com.wk.StaticMethod
import java.util.*

/**
 * <pre>
 *      @author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/2/13
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : 下一个更大元素 II

        给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。

        示例 1:

        输入: [1,2,1]
        输出: [2,-1,2]
        解释: 第一个 1 的下一个更大的数是 2；
        数字 2 找不到下一个更大的数；
        第二个 1 的下一个最大的数需要循环搜索，结果也是 2。



 * </pre>
 */
class Q503:Q {
    override fun answer() {
        val nums=intArrayOf(1, 2,1)
        StaticMethod.ergodicList(nextGreaterElements(nums).toList())
    }
    private  fun nextGreaterElements(nums: IntArray): IntArray {
        val size=nums.size*2

        val result= IntArray(size)
        val newNum=IntArray(size)
        for(i in 0 until  size){
            if(i>=size/2)
            newNum[i]=nums[i-size/2]
            else
                newNum[i]=nums[i]
        }
        val stack=Stack<Int>()
        for (i in 0 until size){
            deal(stack,i,newNum,result)
        }
        while (stack.isNotEmpty()){
            result[stack.pop()] =-1
        }
        return result
    }

    private fun deal(stack:Stack<Int>,i:Int,nums: IntArray,result: IntArray){
        val size=result.size
        if(stack.isEmpty()){
            stack.push(i)
            return
        }
        val top=stack.peek()
        if(nums[top]<nums[i] && top<i && i<top+size ){
            result[top]=nums[i]
            stack.pop()
            deal(stack,i,nums,result)
        }else
            stack.push(i)
    }
}