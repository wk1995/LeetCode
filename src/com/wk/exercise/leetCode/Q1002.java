package com.wk.exercise.leetCode;

import com.wk.StaticMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 1226426603@qq.com
 *      time   : 2019/4/30/12:28
 *      desc   : 查找常用字符
 *
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 *
 * 示例 1：
 *
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 *
 * 示例 2：
 *
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *
 *
 *
 * 提示：
 *
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 *
 *
 *      思路：   遍历每个字符串中的字符出现的个数，然后取最小的
 *      address: https://leetcode-cn.com/problems/find-common-characters/comments/
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
public class Q1002 implements Q {
    @Override
    public void answer() {
        String[] a = {"bella", "label", "roller"};
//        StaticMethod.INSTANCE.ergodicList(commonChars(a));
        System.out.println(commonChars(a));
    }

    private List<String> commonChars(String[] A) {
        ArrayList<String> result = new ArrayList<>();
        int[] caches = new int[26];
        for (char c : A[0].toCharArray()) {
            caches[(c - 'a')]++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] tmps = new int[26];
            for (char c : A[i].toCharArray()) {
                tmps[c - 'a']++;
            }
            for (int position = 0; position < 26; position++)
                caches[position] = Math.min(caches[position], tmps[position]);
        }

        //每个字母
        for (int i = 0; i < 26; i++) {
            //caches[i]，表示i对应的字母出现的个数
            for (int j = 1; j <= caches[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
}
