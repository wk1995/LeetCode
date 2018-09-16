package com.wk.data.structure;

import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/14/7:46
 *      desc   : 数据结构->N叉树
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class NaturalTree {
    public int val;
    public List<NaturalTree> children;

    public NaturalTree(int val, List<NaturalTree> children) {
        this.val = val;
        this.children = children;
    }
}
