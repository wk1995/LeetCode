package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.TwoForkTree;
import com.wk.exercise.ByteBounce202010;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/10/29 <br/>
 *      desc   : 226. 翻转二叉树         <br/>


226. 翻转二叉树
翻转一棵二叉树。

示例：

输入：

4
/   \
2     7
/ \   / \
1   3 6   9
输出：

4
/   \
7     2
/ \   / \
9   6 3   1


 *      address: https://leetcode-cn.com/problems/invert-binary-tree/
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q226 implements Q ,ByteBounce202010 {
    @Override
    public void answer() {

    }

    private TwoForkTree invertTree(TwoForkTree root) {
        if(root==null){
            return null;
        }
        TwoForkTree result=new TwoForkTree(root.val);
        result.left=invertTree(root.right);
        result.right=invertTree(root.left);
        return result;
    }
}
