package com.wk.exercise.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/4/30/13:59
 *      desc   : 杨辉三角
 *      address: https://leetcode-cn.com/problems/pascals-triangle/
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q118 implements Q {
   private static ArrayList<List<Integer>> result = new ArrayList<>();
    @Override
    public void answer() {
        System.out.println(generate(5));
    }


    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> nums = new ArrayList<>();
        List<Integer> prior = null;
        for(int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>(i);

            for(int j = 0; j < i; j++)
                if(j == 0 || j == i - 1)
                    temp.add(1);
                 else
                    temp.add(prior.get(j - 1) + prior.get(j));
            nums.add(temp);
            prior = temp;
        }
        return nums;
    }
}
