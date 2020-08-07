package com.wk.exercise.leetcode;

import com.wk.data.structure.TwoForkTree;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 1226426603@qq.com <br/>
 *      time   : 2020/8/7 <br/>
 *      desc   :  相同的树         <br/>

给定两个二叉树，编写一个函数来检验它们是否相同。

如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

示例 1:

输入:       1         1
/ \       / \
2   3     2   3

[1,2,3],   [1,2,3]

输出: true
示例 2:

输入:      1          1
/           \
2             2

[1,2],     [1,null,2]

输出: false
示例 3:

输入:       1         1
/ \       / \
2   1     1   2

[1,2,1],   [1,1,2]

输出: false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/same-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


 *      address:
 *      GitHub : https://github.com/wk1995 <br/>
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 * </pre>
 */
public class Q100 implements Q {
    @Override
    public void answer() {

    }

    private boolean isSameTree(TwoForkTree p, TwoForkTree q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
