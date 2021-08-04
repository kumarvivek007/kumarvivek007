package com.kv.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodilityTest {
    public static void main(String[] args) {
        int num=1595899;
        int test =0;
        String snum = String.valueOf(num);
        if(!snum.contains("5")){
            //return num;
        }
        int index =0;

        List<Integer> intlist =  new ArrayList<>();
        while (test!=-1){
            index = snum.indexOf('5',index);
            if(index ==-1){
                break;
            }
            StringBuilder sb = new StringBuilder(snum);
            sb.deleteCharAt(index);
            intlist.add(Integer.parseInt(sb.toString()));
            index = index+1;
        }

        Collections.sort(intlist);

        System.out.println(intlist.get(intlist.size()-1));


    }
}
