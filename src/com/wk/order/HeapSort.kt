package com.wk.order

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/14/20:43
 *      desc   : 堆排序
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class HeapSort<T : Comparable<T>> : Sort<T>() {
    override fun descSort(sortList: ArrayList<T>): ArrayList<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ascSort(sortList: ArrayList<T>): ArrayList<T> {
        val size = sortList.size

  /*      for (sortIndex in size - 1 downTo 1) {

            val parentIndex =
                    if (sortIndex % 2 == 1) {//左子叶
                        (sortIndex - 1) / 2
                    } else
                        (sortIndex - 2) / 2

            if(sortList[parentIndex]>sortList[sortIndex])
        }*/


        //当index==2即还剩最后一个数了，这个数其实也就是最小的了，下面的都是排好的
        for (index in size downTo 2) {
            var parentIndex = index / 2 - 1
            while (parentIndex in 0..index) {
                var left = 2 * parentIndex + 1
                val tmp = sortList[parentIndex]
                while (left < index) {
                    if (left + 1 < index && sortList[left + 1] > sortList[left])
                        left++
                    if (sortList[left] > tmp) {
                        sortList[parentIndex] = sortList[left]
                        parentIndex = left
                    } else {

                        break
                    }
                    sortList[parentIndex] = tmp
                    left = 2 * left + 1
                }
                parentIndex--
            }
            val tmp = sortList[0]
            sortList[0] = sortList[index - 1]
            sortList[index - 1] = tmp
        }
        return sortList
    }
}