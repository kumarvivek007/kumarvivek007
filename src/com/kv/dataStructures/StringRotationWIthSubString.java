package com.kv.dataStructures;

/**
 * Interview Questions: 1.9 (Arrays and String)
 */

public class StringRotationWIthSubString {
    public static void main(String[] args) {

    }

    boolean isRotation(String s1, String s2){
        int  len = s1.length();
        if(len == s2.length()){
            String s3= s1+s1;
             return false; //isSubstring(s3,s2);
        }
        return false;
    }


}
