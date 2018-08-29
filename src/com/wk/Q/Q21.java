package com.wk.Q;


import com.wk.data.structure.ListNode;


/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/08/2018/8/12
 *      desc   : 合并两个有序链表
 *
         将两个有序链表合并为一个新的有序链表并返回。
            新链表是通过拼接给定的两个链表的所有节点组成的。

         示例：

          输入：1->2->4, 1->3->4
          输出：1->1->2->3->4->4
 *

 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */

public class Q21 implements Q {
    @Override
    public void answer() {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);

    }

}
