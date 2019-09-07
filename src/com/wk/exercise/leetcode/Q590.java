package com.wk.exercise.leetcode;

import com.wk.StaticMethod;

import java.util.List;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/17/8:02
 *      desc   : N叉树的后序遍历
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q590 extends QNaturalTree {
    @Override
    public void answer() {
        List<Integer> list=ergodic(naturalTreeRoot,StaticMethod.PostOrder);
        System.out.println(StaticMethod.INSTANCE.ergodicList(list));
    }
}
