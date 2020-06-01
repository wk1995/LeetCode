package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/6/1 <br/>
 *      desc   :  拥有最多糖果的孩子        <br/>
 *
 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q1431 implements Q{
    @Override
    public void answer() {

    }
    /**
     * 线求出最大值，再遍历各个数+extraCandies 是否大于最大值
     * */
    private List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if(candies==null){
            return null;
        }
        int length=candies.length;
        if(length<=0){
            return null;
        }
        List<Boolean> result =new ArrayList<>();
        int max=0;
        for(int i:candies){
            max=Math.max(i,max);
        }
        for(int i:candies){
            result.add(i+extraCandies>=max);
        }
        return result;
    }
}
