package com.wk.exercise.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   :  <br/>
 *      desc   : 答案的模板         <br/>



 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
public class Q1512 implements Q {
    @Override
    public void answer() {
        System.out.println(numIdenticalPairs(new int[]{1,1,1,1}));
    }
    private int numIdenticalPairs(int[] nums) {
        if(nums==null){
            return 0;
        }
        HashMap<Integer,ArrayList<Integer>> resultMap=new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> list=resultMap.get(nums[i]);
            if(list==null){
                list=new ArrayList<>();
            }
            list.add(i);
            resultMap.put(nums[i],list);
        }
        int result=0;
        for(ArrayList<Integer> list:resultMap.values()){
            if(list.size()<=1){
                continue;
            }
            result+=((list.size()-1)*list.size())/2;
        }
        return result;
    }
}
