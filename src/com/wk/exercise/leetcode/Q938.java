package com.wk.exercise.leetcode;

import com.wk.data.structure.TwoForkTree;

import static com.wk.data.structure.TwoForkTree.ErgodicType.STRATUM_LEFT_TO_LEFT;


/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      address: https://leetcode-cn.com/problems/range-sum-of-bst/
 *      desc   : 二叉搜索树的范围和

 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。

 二叉搜索树保证具有唯一的值。

  

 示例 1：

 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 输出：32
 示例 2：

 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 输出：23
  

 提示：

 树中的结点数量最多为 10000 个。
 最终的答案保证小于 2^31。

 思路：其实就是L，R之间的数字之和，先把树转化为数组，在L,R之间的数的和


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/range-sum-of-bst
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </pre>
 */
public class Q938 implements Q {
    @Override
    public void answer() {
        Integer[] root = {10,5,15,3,7,null,18};
        TwoForkTree mTwoForkTree=TwoForkTree.createTwoForkTree(root,STRATUM_LEFT_TO_LEFT,0);
        System.out.println(rangeSumBST(mTwoForkTree,7,15));
    }

    private int rangeSumBST(TwoForkTree root, int L, int R) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return ergodic(root,L,R,0);
    }

    private int ergodic(TwoForkTree root,int l,int right,int result){
        if(root!=null) {
            if(root.val>=l && root.val<=right){
                result += root.val;
            }
            result = ergodic(root.left, l, right, result);
            result = ergodic(root.right, l, right, result);
        }
        return result;
    }

}
