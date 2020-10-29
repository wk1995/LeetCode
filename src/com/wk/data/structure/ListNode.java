package com.wk.data.structure;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/08/2018/8/12
 *      desc   : 单链表数据结构
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x){
        val=x;
    }
    public ListNode(){
    }

    public static ListNode createListNode( Integer ...xs){
        return createListNode(Arrays.asList(xs));
    }

    public static ListNode createListNode( List<Integer> vals){
        if(vals==null || vals.size()<=0){
            return null;
        }
        ListNode result=null;
        ListNode pre=null;
       /* vals.forEach((Integer integer)->{

        });*/
        for(int i=0;i<vals.size();i++){
            if(result==null) {
                result =new  ListNode(vals.get(i));
                pre=result;
            }else{
                ListNode next=new  ListNode(vals.get(i));
                pre.next=next;
                pre=next;
            }
        }
        return result;
    }
    @Override
    public String toString() {
        if (next != null) {
            return val + "," + next.toString();
        } else {
            return String.valueOf(val);
        }
    }

    public ListNode getByIndex(int index){
        if(index<0){
            return null;
        }
        ListNode result=null;
        for(int i=index;i>=0;i--){
            if(result==null) {
                result=this;
            } else {
                result=result.next;
                if(result==null){
                    return null;
                }
            }
        }
        return result;
    }
}
