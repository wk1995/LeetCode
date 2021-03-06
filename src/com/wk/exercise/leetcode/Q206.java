package com.wk.exercise.leetcode;

import com.wk.data.structure.ListNode;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/reverse-linked-list/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 反转链表

 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL

 * </pre>
 */
public class Q206 implements Q {
    @Override
    public void answer() {
        ListNode head=ListNode.createListNode(1,2,3,4,5);
        System.out.println(reverseList(head));
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
