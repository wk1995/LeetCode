package com.wk.exercise.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/21/20:21
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q841 implements Q{
    @Override
    public void answer() {
//        [[1,3],[3,0,1],[2],[0]]
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        List<Integer> list3=new ArrayList<>();
        list1.add(3);
        List<Integer> list4=new ArrayList<>();
        List<List<Integer>> lists=new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        System.out.println(canVisitAllRooms(lists));
    }
    private boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //第0号房间的钥匙
        List<Integer> rootKeys=rooms.get(0);
        List<Integer> position;
        for(Integer rootKey:rootKeys){
            position=new ArrayList<>();
        }
        int roomsNum=rooms.size();
        for(int i=0;i<roomsNum;i++){
            int keyNum=rooms.get(i).size();

        }
        return true;
    }
}
