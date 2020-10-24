package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.TwoForkTree;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/10/24 <br/>
 *      desc   : 二叉树的前序遍历         <br/>
 *
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 *  示例:
 *
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 *
 * 输出: [1,2,3]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q144 implements Q {
    @Override
    public void answer() {

    }

    private List<Integer> preorderTraversal(TwoForkTree root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        preorderTraversal(root,result);
        return result;
    }

    private void preorderTraversal(TwoForkTree root,List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorderTraversal(root.left,result);
        preorderTraversal(root.right,result);
    }
}
