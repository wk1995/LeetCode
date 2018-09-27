package com.wk.Q;

import com.wk.StaticMethod;
import com.wk.data.structure.NaturalTree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/17/8:04
 *      desc   : N叉树的层序遍历
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q429 extends QNaturalTree {

    @Override
    public void answer() {
        List<List<Integer>> lists=levelOrder(naturalTreeRoot);
        System.out.println(StaticMethod.INSTANCE.ergodicList(lists));
    }

    private List<List<Integer>> levelOrder(NaturalTree root) {
        List<List<Integer>> lists = new ArrayList<>();
        List<NaturalTree> rootNaturalTree = new ArrayList<>();
        if(root!=null)
        rootNaturalTree.add(root);
        way(rootNaturalTree,lists);
        return lists;
    }

    private void way(List<NaturalTree> list, List<List<Integer>> lists) {
        if(list==null || list.isEmpty()) return;
        List<Integer> ab = new ArrayList<>();
        List<NaturalTree> childList = new ArrayList<>();
        list.forEach(
                (o) -> {
                    ab.add(o.val);
                    List children=o.children;
                    if(children!=null)
                        childList.addAll(children);
                }
        );
        lists.add(ab);
        way(childList,lists);
    }
}
