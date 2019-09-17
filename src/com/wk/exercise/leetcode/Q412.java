package com.wk.exercise.leetcode;

import com.wk.SuppressConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      @author : wk <br/>
 *      e-mail : 122642603@qq.com <br/>
 *      time   : 2019/7/1 <br/>
 *      GitHub : https://github.com/wk1995 <br/>
 *      address: https://leetcode-cn.com/problems/fizz-buzz/
 *      CSDN   : http://blog.csdn.net/qq_33882671 <br/>
 *      desc   : Fizz Buzz
 *
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 *
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 *
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 *
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * 示例：
 *
 * n = 15,
 *
 * 返回:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fizz-buzz
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * </pre>
 */
@SuppressWarnings(SuppressConstant.UNUSED)
public class Q412 implements Q {
    @Override
    public void answer() {
    System.out.println(fizzBuzz(15));
    }

    private List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if (isMultipleOfFive(i) && isMultipleOfThree(i)) {
                result.add("FizzBuzz");
            } else if (isMultipleOfFive(i)) {
                result.add("Buzz");
            } else if (isMultipleOfThree(i)) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    private boolean isMultipleOfThree(int num) {
        return (num % 3 == 0);
    }

    private boolean isMultipleOfFive(int num) {
        return num % 5 == 0;
    }

}
