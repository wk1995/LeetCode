package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.ListNode;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   :  <br/>
 *      desc   : 两两交换链表中的节点         <br/>

给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 

示例 1：


输入：head = [1,2,3,4]
输出：[2,1,4,3]
示例 2：

输入：head = []
输出：[]
示例 3：

输入：head = [1]
输出：[1]
 

提示：

链表中节点的数目在范围 [0, 100] 内
0 <= Node.val <= 100

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q24 implements Q {
    @Override
    public void answer() {
        ListNode listNode=ListNode.createListNode(1,2,3,4);
        listNode=swapPairs(listNode);
        System.out.println(listNode);
    }

    /**
     * 思路：
     * 题意就是每两个交换，那么可以把整个链表堪称三个结点
     * 1，2还有剩下的，交换好1，2，再按照同样的方法交换剩下的
     *
     * 交换的思路：
     * 保存1，2赋值给1，然后把2.next 赋值为1.next，然后再把2.next赋值为1
     *
     * */
    private ListNode swapPairs(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode next=head.next;
        if(next==null){
            return head;
        }
        ListNode tmp=head;
        head=next;
        tmp.next=swapPairs(next.next);
        head.next=tmp;

        return head;
    }

}
