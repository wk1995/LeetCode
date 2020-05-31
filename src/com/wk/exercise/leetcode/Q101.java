package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.TwoForkTree;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/5/31 <br/>
 *      desc   :  对称二叉树        <br/>

给定一个二叉树，检查它是否是镜像对称的。

 

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

1
/ \
2   2
/ \ / \
3  4 4  3
 

但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

1
/ \
2   2
\   \
3    3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/symmetric-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。



 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q101 implements Q {
    @Override
    public void answer() {

    }

    private boolean isSymmetric(TwoForkTree root) {
        if(root==null){
            return true;
        }
        return leftIsSameAsRight(root.left,root.right);

    }

    private boolean leftIsSameAsRight(TwoForkTree left,TwoForkTree right){
        if(left==null && right==null){
            return true;
        }
        if(left==null){
            return false;
        }

        if(right==null){
            return false;
        }
        return left.val==right.val && leftIsSameAsRight(left.left,right.right) &&
                leftIsSameAsRight(left.right,right.left);
    }
}
