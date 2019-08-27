package com.wk.data.structure;

import java.util.*;

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

    /**遍历的方式*/
    enum ErgodicType{
        /**前序遍历*/
        FORWARD_ORDER,
        /**后序遍历*/
        POST_ORDER,
        /**中序遍历*/
        MIDDLE_ORDER,
        STRATUM_LEFT_TO_RIGHT,
        STRATUM_LEFT_TO_LEFT
    }
    public TwoForkTree(int x) {
        val = x;
    }

    public TwoForkTree(int val, int left, int right) {
       this(val,new TwoForkTree(left),new TwoForkTree(right));
    }
    public TwoForkTree(int val,TwoForkTree left,TwoForkTree right){
        this(val);
        this.left=left;
        this.right=right;
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
        switch (mErgodicType){
            case FORWARD_ORDER:
                break;
            case POST_ORDER:
                break;
            case MIDDLE_ORDER:
                break;
            case STRATUM_LEFT_TO_LEFT:
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

    //以树的形式来显示二叉树
    public void show() {
        int deep = getTwoForkTreeDeep(this);
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

    public void showTwoForkTree(){
        int maxDepth = getTwoForkTreeDeep(this);
        if (maxDepth <= 1) {
            System.out.println(val);
            return;
        }
        StringBuilder result=new StringBuilder();
        //最后一行空格的个数，每个最小的完全二叉树之间是需要空格的
        int blankSpaceNum=new Double(Math.pow(2,maxDepth-2)-1).intValue();
        //最后两行形成的最小的完全二叉树的个数
        int leastTwoForkTreeNum=new Double(Math.pow(2,maxDepth-2)).intValue();
        /*最大所需空间，其实也就是最后一层的空间
        * 3*leastTwoForkTreeNum的原因：
        * 一颗最小的完全二叉树，最后一行所占space为3，把二叉树最后两行拆解
        * 成一个个最小完全二叉树，然后这一个个最小完全二叉树的个数肯定是2的倍数，
        * 除了第一行之外都满足这个
        * */
        int maxSpaceNum=new Double(3*leastTwoForkTreeNum+blankSpaceNum).intValue();
        for(int depth=1;depth<=maxDepth;depth++){
            //第depth层 第一个Node前面空格的num
            int firstNodeNum=new Double(Math.pow(2,maxDepth-depth)).intValue()-1;
            if(depth==1){
                result.append(repeatStringByJoin(BLANK_SPACE,firstNodeNum));
                result.append("O");
                result.append(NEW_LINE);
                continue;
            }
            //第depth层 每个node之间的间距
            int amongOfTreeNodeNum = new Double(Math.pow(2, maxDepth - depth + 1)).intValue() - 1;


        }


    }

    public void ergodic(ErgodicType mErgodicType, ArrayList<Integer> result){

        switch (mErgodicType){
            case STRATUM_LEFT_TO_LEFT :

                break;
        }
    }

    /**获取树的最大深度*/
    public static int getTwoForkTreeDeep(TwoForkTree twoForkTree) {
        return getBranchDeep(twoForkTree, 0);
    }

    private  static int getBranchDeep(TwoForkTree twoForkTree, int deep) {
        if (twoForkTree == null)
            return deep;
        deep++;
        deep = Math.max(getBranchDeep(twoForkTree.left, deep), getBranchDeep(twoForkTree.right, deep));
        return deep;
    }
    public static String repeatStringByJoin( String target, int count){
        if(target==null || count<=0){
            return null;
        }
        return String.join("", Collections.nCopies(count, target));
    }
    private static final String BLANK_SPACE=" ";
    private static final String NEW_LINE="\r\n";
}
