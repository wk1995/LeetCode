package com.wk.data.structure;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/8/20/23:20
 *      desc   : 数据结构->树
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class TwoForkTree {
    public int val;
    public TwoForkTree left;
    public TwoForkTree right;

    public TwoForkTree(int x) {
        val = x;
    }

    public TwoForkTree(int val,int left,int right){
        this.val=val;
        this.left=new TwoForkTree(left);
        this.right=new TwoForkTree(right);
    }
}
