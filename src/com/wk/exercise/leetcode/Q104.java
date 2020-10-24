package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.TwoForkTree;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/10/24 <br/>
 *      desc   :  104. 二叉树的最大深度         <br/>

给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

3
/ \
9  20
/  \
15   7
返回它的最大深度 3 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q104 implements Q {

    @Override
    public void answer() {

    }

    private int maxDepth(TwoForkTree root) {
        return maxDepth(root,0);

    }

    private int maxDepth(TwoForkTree root,int deep){
        if(root==null){
            return deep;
        }
        deep++;
        int left=maxDepth(root.left,deep);
        int right=maxDepth(root.right,deep);
        return Math.max(left,right);
    }

}
