package com.wk.exercise.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/keyboard-row/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : 键盘行
 *
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 *
 *  
 *
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *  
 *
 * 注意：
 *
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/keyboard-row
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </pre>
 */
public class Q500 implements Q {

    @Override
    public void answer() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    private String[] findWords(String[] words) {
        if(words==null){
            return null;
        }
        if(words.length==0){
            return new String[0];
        }
        ArrayList<String> result = new ArrayList<>();
        String[] keyboardLines = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (String word:words){
            if(judge(word,keyboardLines)){
                result.add(word);
            }
        }
        final int size=result.size();
        return result.toArray(new String[size]);
    }

    private boolean judge(String word,String[] keyboardLines){
        word=word.toLowerCase();
        //word第一个字母在哪行
        String targetLine=null;
        for(String keyboardLine: keyboardLines){
            if(keyboardLine.indexOf(word.charAt(0))>=0){
                targetLine=keyboardLine;
                break;
            }
        }
        if(targetLine==null){
            return false;
        }
        for(int i=1;i<word.length();i++){
            if(targetLine.indexOf(word.charAt(i))<0){
                return false;
            }
        }
        return true;
    }
}
