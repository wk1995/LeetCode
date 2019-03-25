package com.wk.exercise.leetCode;

import com.wk.StaticMethod;
import com.wk.data.structure.NaturalTree;

import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/14/7:57
 *      desc   : 叉树的前序遍历
 *
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q589 extends QNaturalTree {

    @Override
    public void answer() {
//        preorder(naturalTreeRoot);
        List<Integer> list=ergodic(naturalTreeRoot,StaticMethod.ForwardOrder);
        System.out.println(StaticMethod.INSTANCE.ergodicList(list));
    }
    private void  preorder(NaturalTree root) {
        System.out.println(StaticMethod.INSTANCE.ergodicNaturalTreeOrder(root,StaticMethod.ForwardOrder));
    }


}
