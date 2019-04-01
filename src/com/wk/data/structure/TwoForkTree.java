package com.wk.data.structure;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

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

    public TwoForkTree(int left, int right) {
        this.left = new TwoForkTree(left);
        this.right = new TwoForkTree(right);
    }

    public TwoForkTree(int val, int left, int right) {
        this(val);
        this.left = new TwoForkTree(left);
        this.right = new TwoForkTree(right);
    }

    public TwoForkTree(Integer[] vals) {
        int length = vals.length;
        PriorityQueue<TwoForkTree> arrayQueue = new PriorityQueue<>();
        //表示当前指针的深度
        int layer = 0;
        for (int i = 0; i < length; i++) {
            //其实这里说明了现在是根节点
            if (arrayQueue.isEmpty()) {
                arrayQueue.add(new TwoForkTree(vals[i]));
                continue;
            }
            //当前深度最多的节点数
            int size = layer << 1;
            for (int j = 0; j < size; j++) {
                TwoForkTree tmp = arrayQueue.poll();
                if (i < length)
                    tmp.left = new TwoForkTree(vals[i++]);
                else
                    break;
                if (i < length)
                    tmp.right = new TwoForkTree(vals[i++]);
                else
                    break;
            }
            layer++;
        }
    }

    //以树的形式来显示二叉树
    public void show() {
        int deep = getDeep();
        if (deep <= 1) {
            System.out.println(val);
            return;
        }
        //最后一层最多节点数
        int lastLayerNum = 1 << (deep - 1);
        //因为每个节点与旁边的节点会有一个空格，表示最后一层需要占totle个位子
        int totle = (lastLayerNum << 1) - 1;
        //根节点前面需要的空格数，下面每一层的最左边节点空格都是上一层的最左边的空格数-1然后再除以2，
        //并且同一层的相邻节点之间的空格数是最左边的节点空格数的两倍
        int rootSpace = (totle - 1) >> 1;
        StringBuilder result = new StringBuilder();
        for (int currentDeep = 1; currentDeep <= deep; currentDeep++) {
            //表示每层最左节点的空格数
            int currentSpace = (totle - 1) >> currentDeep;
            //当前的最多子节点数
            int currentNum=1<<(currentDeep-1);
            for(int i=0;i<currentSpace;i++)
                result.append(" ");
            result.append("\r\n");
        }
    }

    public int getDeep() {
        int deep = 0;
        return getBranchDeep(this, deep);
    }

    private int getBranchDeep(TwoForkTree twoForkTree, int deep) {
        if (twoForkTree == null)
            return deep;
        deep++;
        deep = Math.max(getBranchDeep(twoForkTree.left, deep), getBranchDeep(twoForkTree.right, deep));
        return deep;
    }
}
