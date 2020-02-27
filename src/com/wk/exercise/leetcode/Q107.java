package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.TwoForkTree;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 二叉树的层次遍历 II

 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

 例如：
 给定二叉树 [3,9,20,null,null,15,7],

 3
 / \
 9  20
 /  \
 15   7
 返回其自底向上的层次遍历为：

 [
 [15,7],
 [9,20],
 [3]
 ]

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q107 implements Q {
    @Override
    public void answer() {
        TwoForkTree root=new TwoForkTree(3,9,20);
        root.right=new TwoForkTree(20,15,7);
    }
    private List<List<Integer>> levelOrderBottom(TwoForkTree root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TwoForkTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> levels = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TwoForkTree node = queue.poll();
                levels.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            //区别点：头插入
            result.addFirst(levels);
        }
        return result;
    }
}
