package com.wk.data.structure;

import com.wk.ErgodicType;
import com.wk.StringConstants;
import com.wk.StringUtils;
import com.wk.SuppressConstant;

import java.util.*;

/**
 * <pre>
 *      @author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/8/20/23:20
 *      desc   : 数据结构->树
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class TwoForkTree {
    public int val;
    public TwoForkTree left;
    public TwoForkTree right;



    public TwoForkTree(int x) {
        val = x;
    }

    public TwoForkTree(int val, int left, int right) {
        this(val, new TwoForkTree(left), new TwoForkTree(right));
    }

    public TwoForkTree(int val, TwoForkTree left, TwoForkTree right) {
        this(val);
        this.left = left;
        this.right = right;
    }

    public static TwoForkTree createTwoForkTree(Integer[] vals, ErgodicType mErgodicType, Integer startPosition) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        int treeNodeSize = vals.length;
        if (startPosition >= treeNodeSize || vals[startPosition] == null) {
            return null;
        }
        TwoForkTree result = new TwoForkTree(vals[startPosition]);
        if (treeNodeSize - startPosition == 1) {
            return result;
        }
        switch (mErgodicType) {
            case FORWARD_ORDER:
                break;
            case POST_ORDER:
                break;
            case MIDDLE_ORDER:
                break;
            case STRATUM_LEFT_TO_RIGHT:
                Deque<TwoForkTree> deque = new ArrayDeque<>();
                deque.addLast(result);
                for (int i = startPosition + 1; i < treeNodeSize; i++) {
                    TwoForkTree next = deque.poll();
                    if (next == null) {
                        break;
                    }
                    Integer leftVal = vals[i];
                    if (leftVal != null) {
                        TwoForkTree left = new TwoForkTree(leftVal);
                        next.left = left;
                        deque.addLast(left);
                    }
                    i++;
                    Integer rightVal = vals[i];
                    if (rightVal != null) {
                        TwoForkTree right = new TwoForkTree(rightVal);
                        next.right = right;
                        deque.addLast(right);
                    }
                }
                break;
            default:
                break;
        }
        return result;
    }


    public static TwoForkTree createTwoForkTree(List<Integer> vals, ErgodicType mErgodicType, int startPosition1) {
        if (vals == null || vals.size() == 0) {
            return null;
        }
        int size = vals.size();
        return createTwoForkTree(vals.toArray(new Integer[size]), mErgodicType, startPosition1);
    }

    /**
     *  以树的形式来显示二叉树
     *  思路：
     * 1：第n层，有2的(n-1)次方个节点
     * 2：一个节点的子节点需要3个空间，见3
     * 3:第n层，除了第一层以外，结点之间的间隔所占的空间为：2的(maxDepth-n)+1的次方-1
     * 4：第n层，第一个结点距离左边所占的空间为：2的（maxDepth-n）的次方-1
     * 5：n从1开始
     *
     * */
    public void showTwoForkTree() {
        int maxDepth = getTwoForkTreeDeep(this);
        if (maxDepth <= 1) {
            System.out.println(val);
            return;
        }
        StringBuilder result = new StringBuilder();
        ArrayDeque<TwoForkTree> arrayDeque=new ArrayDeque<>();
        arrayDeque.add(this);
        for(int depth = 1; depth <= maxDepth; depth++) {
            //第depth层，节点个数
            int nodeCount=(int)Math.pow(2, depth - 1);
            System.out.println("第"+depth+"层，节点个数: "+nodeCount);
            //第depth层，第一个节点距离左边的空间
            int leftSpacing=(int)Math.pow(2,maxDepth-depth)-1;
            System.out.println("第"+depth+"层，第一个节点距离左边的空间: "+leftSpacing);
            result.append(StringUtils.repeatString(StringConstants.STRING_BLANK_SINGLE,leftSpacing));
            if(depth!=1){
                int nodeSpace=(int)Math.pow(2,maxDepth-depth+1)-1;
                System.out.println("第"+depth+"层，节点间隔: "+nodeSpace);
                for(int index=0;index<nodeCount;index++){
                    TwoForkTree current=arrayDeque.pop();
                    int value=current.val;
                    if(current.left!=null) {
                        arrayDeque.add(current.left);
                    }
                    if(current.right!=null) {
                        arrayDeque.add(current.right);
                    }

                    result.append(value);
                    if( index==nodeCount-1){
                        result.append(StringConstants.NEW_LINE);
                    }else {
                        result.append(StringUtils.repeatString(StringConstants.STRING_BLANK_SINGLE, nodeSpace));
                    }
                }
            }else{
                TwoForkTree current=arrayDeque.pop();
                int value=current.val;
                arrayDeque.add(current.left);
                arrayDeque.add(current.right);
                result.append(value).append(StringConstants.NEW_LINE);

            }
        }
        System.out.println(result.toString());
    }

    public ArrayList<Integer> ergodic(ErgodicType mErgodicType) {
        ArrayList<Integer> result = new ArrayList<>();
        switch (mErgodicType) {
            case STRATUM_LEFT_TO_RIGHT:
                Deque<TwoForkTree> deque = new ArrayDeque<>();
                deque.addLast(this);
                while (deque.size() != 0) {
                    TwoForkTree top = deque.pollFirst();
                    if (top == null) {
                        break;
                    }
                    result.add(top.val);
                    TwoForkTree left = top.left;
                    if (left != null) {
                        deque.addLast(left);
                    }
                    TwoForkTree right = top.right;
                    if (right != null) {
                        deque.addLast(right);
                    }
                }
                break;
            default:
                break;
        }
        return result;
    }

    /**
     * 获取树的最大深度
     */
    private static int getTwoForkTreeDeep(TwoForkTree twoForkTree) {
        return getBranchDeep(twoForkTree, 0);
    }

    private static int getBranchDeep(TwoForkTree twoForkTree, int deep) {
        if (twoForkTree == null) {
            return deep;
        }
        deep++;
        deep = Math.max(getBranchDeep(twoForkTree.left, deep), getBranchDeep(twoForkTree.right, deep));
        return deep;
    }

    private static String repeatStringByJoin(String target, int count) {
        if (target == null || count <= 0) {
            return null;
        }
        return String.join("", Collections.nCopies(count, target));
    }


}
