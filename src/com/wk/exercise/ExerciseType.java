package com.wk.exercise;

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/3/25
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
public enum ExerciseType {
    LEET_CODE("leetCode"),SWORD_FINGER_OFFER("swordFingerOffer");
    private final String name;
     ExerciseType(String name){
        this.name=name;
    }

    public String getName(){
         return name;
    }

}
