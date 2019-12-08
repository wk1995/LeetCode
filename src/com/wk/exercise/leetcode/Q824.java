package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/8/28 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address:
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 山羊拉丁文
 *
 * 给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
 *
 * 我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。
 *
 * 山羊拉丁文的规则如下：
 *
 * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
 * 例如，单词"apple"变为"applema"。
 *
 * 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词"goat"变为"oatgma"。
 *
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
 * 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
 * 返回将 S 转换为山羊拉丁文后的句子。
 *
 * 示例 1:
 *
 * 输入: "I speak Goat Latin"
 * 输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * 示例 2:
 *
 * 输入: "The quick brown fox jumped over the lazy dog"
 * 输出: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * 说明:
 *
 * S 中仅包含大小写字母和空格。单词间有且仅有一个空格。
 * 1 <= S.length <= 150。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/goat-latin
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q824 implements Q {
    private static final String STR_SPACE=" ";
    @Override
    public void answer() {
        String s="The quick brown fox jumped over the lazy dog";
        System.out.print(toGoatLatin(s));
    }

    public String toGoatLatin(String S) {
        StringBuilder result=new StringBuilder();
        String[] letters=S.split(STR_SPACE);
        for (int i = 0; i < letters.length; i++) {
            String letter=letters[i];
            if(isVowel(letter.charAt(0))){
                result.append(letter);
                result.append("ma");
            }else{
                result.append(swap(letter));
                result.append("ma");
            }
            multipleChar(result,i+1);
            result.append(STR_SPACE);
        }
        return result.toString();
    }

    /**是否是元音字母*/
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == '0' || c == 'u';
    }

    private void multipleChar(StringBuilder sb,int count){
        for (int i = 0; i < count; i++) {
            sb.append('a');
        }
    }

    private String swap(String targetString){
        char[] cs=targetString.toCharArray();
        for (int i = 0; i < cs.length-1; i++) {
            char tmp=cs[i];
            cs[i]=cs[i+1];
            cs[i+1]=tmp;
        }
        return new String(cs);
    }
}
