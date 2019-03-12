package com.wk.Q;

import com.wk.data.structure.TwoForkTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/12/20:15
 *      desc   :  叶子相似的树

         请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
                3
            5       1
         6  2     9     8
            7 4

         举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。

         如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。

         如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。



 * 成功
 * 显示详情
 * 执行用时 : 8 ms, 在Leaf-Similar Trees的Java提交中击败了4.79% 的用户
 * 内存消耗 : 35.4 MB, 在Leaf-Similar Trees的Java提交中击败了0.00% 的用户
 *
 *
 *
 *
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q872 implements Q {
    @Override
    public void answer() {

        TwoForkTree root1 = new TwoForkTree(3, 5, 1);
        root1.left.left = new TwoForkTree(2);
        root1.left.right = new TwoForkTree(2, 7, 4);
        root1.right.left = new TwoForkTree(9);
        root1.right.right = new TwoForkTree(8);
        TwoForkTree root2 = root1;
        System.out.println(leafSimilar(root1, root2));

    }

    private boolean leafSimilar(TwoForkTree root1, TwoForkTree root2) {
        List<Integer> list1 = deal(root1, new ArrayList<>());
        List<Integer> list2 = deal(root2, new ArrayList<>());
        System.out.println("list1:  " + Arrays.toString(list1.toArray()));
        System.out.println("list2:  " + Arrays.toString(list2.toArray()));
        int size = list1.size();
        if (size != list2.size())
            return false;
        for (int i = 0; i < size; i++) {
            if (!list1.get(i).equals(list2.get(i)))
                return false;
        }
        return true;
    }

    /**
     * 执行用时 : 2 ms,
     */
    private List<Integer> deal(TwoForkTree root, List<Integer> list) {
        if ((root.left == null) && (root.right == null)) {
            list.add(root.val);
            return list;
        }
        if (root.left != null)
            deal(root.left, list);
        if (root.right != null)
            return deal(root.right, list);

        return list;
    }

    /**
     *
     * */
    private List<Integer> deal1(TwoForkTree root, List<Integer> list) {
        if ((root.left == null) && (root.right == null)) {
            list.add(root.val);
            return list;
        }
        if (root.left == null)
            return deal(root.right, list);
        if (root.right == null)
            return deal(root.left, list);
        deal(root.left, list);
        return deal(root.right, list);
    }
}
