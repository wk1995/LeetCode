package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.TwoForkTree;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/07/2018/7/18
 *      desc   : 合并二叉树
             给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

             你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。

             示例 1:

             输入:
             Tree 1                     Tree 2
             1                         2
             / \                       / \
             3   2                     1   3
             /                           \   \
             5                             4   7
             输出:
             合并后的树:
             3
             / \
             4   5
             / \   \
             5   4   7
             注意: 合并必须从两个树的根节点开始。

 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q617 implements Q {

    @Override
    public void answer() {
        TwoForkTree t1= new TwoForkTree(1);
        TwoForkTree treeNodeLeft= new TwoForkTree(3);
        TwoForkTree treeNodeRight= new TwoForkTree(2);
        treeNodeLeft.left= new TwoForkTree(5);
        t1.left=treeNodeLeft;
        t1.right=treeNodeRight;
        TwoForkTree t2= new TwoForkTree(2);
        TwoForkTree treeNodeLeft2= new TwoForkTree(1);
        TwoForkTree treeNodeRight2= new TwoForkTree(3);
        TwoForkTree right2= new TwoForkTree(4);
        TwoForkTree right3= new TwoForkTree(7);
        treeNodeLeft2.right=right2;
        treeNodeRight2.right=right3;
        t2.left=treeNodeLeft2;
        t2.right=treeNodeRight2;
        mergeTreeNode(t1,t2);
    }

    private TwoForkTree mergeTreeNode(TwoForkTree leftTreeNode, TwoForkTree rightTreeNode){
        TwoForkTree treeNode;
        if(leftTreeNode==null && rightTreeNode==null) {
            return null;
        } else if(leftTreeNode==null ){
            treeNode=rightTreeNode;
        }
        else if( rightTreeNode==null){
            treeNode=leftTreeNode;
        }else{
            treeNode= new TwoForkTree(leftTreeNode.val + rightTreeNode.val);
            treeNode.left=mergeTreeNode(leftTreeNode.left,rightTreeNode.left);
            treeNode.right=mergeTreeNode(leftTreeNode.right,rightTreeNode.right);
        }

        return treeNode;
    }


    /**
     * 执行用时：
     * 1 ms
     * , 在所有 Java 提交中击败了
     * 71.08%
     * 的用户
     * 内存消耗：
     * 39.1 MB
     * , 在所有 Java 提交中击败了
     * 40.59%
     * 的用户
     * */
    private TwoForkTree mergeTreeNode1(TwoForkTree leftTreeNode, TwoForkTree rightTreeNode){
        if(leftTreeNode==null){
            return  rightTreeNode;
        }
        if(rightTreeNode==null){
            return  leftTreeNode;
        }
        TwoForkTree result;
        result=new TwoForkTree(leftTreeNode.val+rightTreeNode.val);
        result.left=mergeTreeNode1(leftTreeNode.left,rightTreeNode.left);
        result.right=mergeTreeNode1(leftTreeNode.right,rightTreeNode.right);
        return result;
    }
}
