package com.wk.order

import com.wk.StaticMethod
import com.wk.SuppressConstant

/**
 * <pre>
 *      @author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/3/13
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : 冒泡排序




 * </pre>
 */
@Suppress(SuppressConstant.UNUSED)
class BubbleSort<T : Comparable<T>>: Sort<T>() {
    override fun descSort(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }




    override fun ascSort(sortList: ArrayList<T>): ArrayList<T> {
        return sort1(sortList)
    }


    /**
     * 从第一个数开始，跟下一个对比
     * 如果比它大，则调换位置，然后以第二个数跟下一个对比，直到求出最大的数,重复该操作
     *
     *
     *  时间复杂度：n2
     *      最差的情况下，需要执行n(n-1)/2次
     *      空间复杂度：O(1)
     * */
    private fun sort1(sortList: ArrayList<T>): ArrayList<T>{
        val size=sortList.size
        for(i in sortList.indices-1)
            for(j in 0 until size-i-1)
                if(sortList[j]>sortList[j+1]){
                    val tmp=sortList[j]
                    sortList[j]=sortList[j+1]
                    sortList[j+1]=tmp
                }
        return sortList

    }

    /**
     *  在sort1的基础上增加一个特殊情况的标志
     *  如果已经排好序,说明一轮下来没有任何数进行交换操作
     * */
    private fun sort2(sortList: ArrayList<T>): ArrayList<T>{
        var hasSwap:Boolean
        val size=sortList.size
        for(i in sortList.indices-1) {
            hasSwap=false
            for (j in 0 until size - i - 1)
                if (sortList[j] > sortList[j + 1]) {
                    val tmp = sortList[j]
                    sortList[j] = sortList[j + 1]
                    sortList[j + 1] = tmp
                    hasSwap = true
                }
            //表示a[i+1]都大于a[i] 说明已经是排好序的
            if(!hasSwap)
                return sortList
        }
        return sortList
    }

    /**
     * 在sort2基础上延伸,sort2在某次交换后已经是排好序了，但如果只有部分排好序呢
     *
     *
     *
     * */
    private fun sort3(sortList: ArrayList<T>): ArrayList<T>{
        var start=0
        var end=sortList.size-1



        return sortList
    }

}