package com.wk.Q;


import com.wk.StaticMethod;
import com.wk.data.structure.ListNode;


/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/08/2018/8/12
 *      desc   : 合并两个有序链表
 *
 * 将两个有序链表合并为一个新的有序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 *
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */

public class Q21 implements Q {
    @Override
    public void answer() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);
        String resultString = StaticMethod.INSTANCE.ergodicListNode(result);
        if (resultString != null)
            System.out.println(resultString.substring(0, resultString.length() - 2));
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 != null && l2 == null)
            return l1;
        if (l1 == null)
            return l2;
        ListNode listNode;
        if (l1.val > l2.val) {
            listNode = new ListNode(l2.val);
            listNode.next = mergeTwoLists(l1, l2.next);
        } else {
            listNode = new ListNode(l1.val);
            listNode.next = mergeTwoLists(l1.next, l2);
        }
        return listNode;
    }

}
