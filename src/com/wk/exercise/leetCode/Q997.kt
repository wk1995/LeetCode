package com.wk.exercise.leetCode

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/3/20/22:58
 *      desc   : 找到小镇的法官
 *
        在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。

        如果小镇的法官真的存在，那么：

        小镇的法官不相信任何人。
        每个人（除了小镇法官外）都信任小镇的法官。
        只有一个人同时满足属性 1 和属性 2 。
        给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。

        如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。



        示例 1：

        输入：N = 2, trust = [[1,2]]
        输出：2
        示例 2：

        输入：N = 3, trust = [[1,3],[2,3]]
        输出：3
        示例 3：

        输入：N = 3, trust = [[1,3],[2,3],[3,1]]
        输出：-1
        示例 4：

        输入：N = 3, trust = [[1,2],[2,3]]
        输出：-1
        示例 5：

        输入：N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
        输出：3
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class Q997:Q {

    override fun answer() {
        val trust = arrayOf(intArrayOf(1,3),intArrayOf(2,3),intArrayOf(3,1))
        val N=3
        println(findJudge(N,trust))
    }

    //思路：[a,b]a信任b，那把建立一个Map，key表示所谓的法官
    //value就是信任key的人的集合，只要这个集合最后的人数等于N-1
    //还有一点是法官不信任任何人，也就是trust[i][0]这个值不能为上步所求的key
   private fun findJudge(N: Int, trust: Array<IntArray>?): Int {
        var result=-1
        if(trust==null || trust.size==0)
            return N
        val length=trust.size
        if(length<N-1)
            return -1
        //表示key信任的人的集合
        val map2=HashMap<Int,ArrayList<Int>>()
        //表示信任key的人的集合
        val map=HashMap<Int,ArrayList<Int>>()
        for(i in trust.indices){
            val key=trust[i][1]
            val value=trust[i][0]
            var list=map[key]
            if(list==null) {
                list = ArrayList<Int>()
                map[key]=list
            }
            list.add(value)

            val key2=trust[i][0]
            val value2=trust[i][1]
            var list2=map2[key2]
            if(list2==null) {
                list2 = ArrayList<Int>()
                map2[key2]=list2
            }
            list2.add(value2)
        }
        for((k,v) in map){
            if(v.size==N-1 && (map2[k]==null || map2[k]!!.size==0) ){
                if(result==-1)
                    result=k
                else{
                    return -1
                }
            }
        }
        return result
    }
}