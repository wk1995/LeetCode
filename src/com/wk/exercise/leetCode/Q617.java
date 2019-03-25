package com.wk.exercise.leetCode;

/**
 * <pre>
 *      author : wk
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
public class Q617 implements Q {

    @Override
    public void answer() {
        TreeNode t1=new TreeNode(1);
        TreeNode treeNodeLeft=new TreeNode(3);
        TreeNode treeNodeRight=new TreeNode(2);
        treeNodeLeft.left=new TreeNode(5);
        t1.left=treeNodeLeft;
        t1.right=treeNodeRight;
        TreeNode t2=new TreeNode(2);
        TreeNode treeNodeLeft2=new TreeNode(1);
        TreeNode treeNodeRight2=new TreeNode(3);
        TreeNode right2=new TreeNode(4);
        TreeNode right3=new TreeNode(7);
        treeNodeLeft2.right=right2;
        treeNodeRight2.right=right3;
        t2.left=treeNodeLeft2;
        t2.right=treeNodeRight2;
        mergeTreeNode(t1,t2);
    }

    private TreeNode mergeTreeNode(TreeNode leftTreeNode,TreeNode rightTreeNode){
        TreeNode treeNode;
        if(leftTreeNode==null && rightTreeNode==null)
            return null;
        else if(leftTreeNode==null && rightTreeNode!=null){
            treeNode=rightTreeNode;
        }
        else if(leftTreeNode!=null && rightTreeNode==null){
            treeNode=leftTreeNode;
        }else{
            treeNode=new TreeNode(leftTreeNode.val+rightTreeNode.val);
            treeNode.left=mergeTreeNode(leftTreeNode.left,rightTreeNode.left);
            treeNode.right=mergeTreeNode(leftTreeNode.right,rightTreeNode.right);
        }

        return treeNode;
    }
   private  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
