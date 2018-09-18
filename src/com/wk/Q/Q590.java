package com.wk.Q;

import com.wk.StaticMethod;
import com.wk.data.structure.NaturalTree;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/9/17/8:02
 *      desc   : N叉树的后序遍历
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q590 implements Q {
    @Override
    public void answer() {
        NaturalTree naturalTree3Left=new NaturalTree(5,null);
        NaturalTree naturalTree3Right=new NaturalTree(6,null);
        List<NaturalTree> childer21=new ArrayList<>();
        childer21.add(naturalTree3Left);
        childer21.add(naturalTree3Right);
        NaturalTree naturalTree21=new NaturalTree(3,childer21);
        NaturalTree naturalTree22=new NaturalTree(2,null);
        NaturalTree naturalTree23=new NaturalTree(4,null);
        List<NaturalTree> childer1=new ArrayList<>();
        childer1.add(naturalTree21);
        childer1.add(naturalTree22);
        childer1.add(naturalTree23);
        NaturalTree naturalTree1=new NaturalTree(1,childer1);
        List<Integer> list=ergodic(naturalTree1);
        StaticMethod.INSTANCE.ergodicList(list);
    }
    private List<Integer> ergodic(NaturalTree root){
        List<Integer> nodeList=new ArrayList<>();
        if(root == null ) return nodeList;
        List<NaturalTree> childer =root.children;
        if(childer==null || childer.isEmpty()){
            nodeList.add(root.val);
            return nodeList;
        }
        for(int i=0;i<childer.size();i++){
            nodeList.addAll(ergodic(childer.get(i)));
        }
        nodeList.add(root.val);
        return nodeList;
    }
}
