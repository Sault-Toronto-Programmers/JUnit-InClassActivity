package com.trios;

public class GradeCalculator {
    public static boolean passOrFail(int score) throws Exception{
        if (score <0 || score > 100) {
            throw new Exception();
        }else if(score <=49){
            return false;
        }else{
            return true;
        }
    }
}
