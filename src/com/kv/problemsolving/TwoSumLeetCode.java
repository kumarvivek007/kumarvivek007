package com.kv.problemsolving;

import java.util.Arrays;

public class TwoSumLeetCode {
    public static void main(String[] args) {
        int[] digites = {9,8,7,6,5,4,3,2,1,9};

        System.out.println(Arrays.toString(plusOne(digites)));

    }
    public static int[] plusOne(int[] digits) {
        int last = digits[digits.length - 1] +1;
        int resultSize = digits.length;
        if(last>9){
            resultSize = resultSize + 1;
        }
        int[] result  = new int[resultSize] ;
        for(int i = 0 ; i <digits.length -1; i++ ){
            result[i] = digits[i];
        }
        if(resultSize > digits.length){
            result[resultSize - 1] =  last % 10;
            result[resultSize - 2] =  last / 10;
        }else{
            result[resultSize - 1] =last;
        }
        return result;
    }
}
