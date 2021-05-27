package com.wk.exercise.leetcode;

import com.wk.data.structure.TwoForkTree;

import static com.wk.ErgodicType.STRATUM_LEFT_TO_RIGHT;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/8/28 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address:
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 二叉搜索树的最近公共祖先

 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。

 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”

 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]


 示例 1:

 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 输出: 6
 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 示例 2:

 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 输出: 2
 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * </pre>
 */
//todo
public class Q235 implements Q {
    @Override
    public void answer() {
        Integer[] rootArray={6,2,8,0,4,7,9,null,null,3,5};
        TwoForkTree root=TwoForkTree.createTwoForkTree(rootArray,STRATUM_LEFT_TO_RIGHT,0);
    }
    public TwoForkTree lowestCommonAncestor(TwoForkTree root, TwoForkTree p, TwoForkTree q) {
        return null;
    }
}
