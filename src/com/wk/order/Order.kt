package com.wk.order

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2018/12/5/23:19
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
abstract class Order {
    //降序
    abstract fun descOrder(sortList: ArrayList<Int>):ArrayList<Int>
    //升序
    abstract fun ascOrder(sortList: ArrayList<Int>):ArrayList<Int>

}