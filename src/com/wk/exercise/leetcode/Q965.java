package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;
import com.wk.data.structure.TwoForkTree;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/8/21:47
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q965 implements Q {
    @Override
    public void answer() {
        TwoForkTree root=new TwoForkTree(1);
        TwoForkTree leftRoot=new TwoForkTree(1);
        TwoForkTree leftRootLeft=new TwoForkTree(1);
        TwoForkTree leftRootRight=new TwoForkTree(1);
        TwoForkTree rightRoot=new TwoForkTree(1);
        TwoForkTree rightRootRight=new TwoForkTree(1);
        leftRoot.left=leftRootLeft;
        leftRoot.left=leftRootRight;
        rightRoot.right=rightRootRight;
        root.left=leftRoot;
        root.right=rightRoot;
        System.out.println(isUnivalTree(root)) ;
    }

    private boolean isUnivalTree(TwoForkTree root) {
        int value=root.val;
        return deal(root,value);
    }
    private boolean deal(TwoForkTree root,int value){
       if(root==null) {
           return true;
       }
       if(root.val==value) {
           return deal(root.left,value) && deal(root.right,value);
       }
       return false;
    }
}

