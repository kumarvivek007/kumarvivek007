package com.kv.dataStructures;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(arr));

    }
     public static List<List<Integer>> threeSum(int[] nums){
         int len  = nums.length;
         Arrays.sort(nums);
         List<List<Integer>> result = new LinkedList<>();
         for (int i=0 ; i< len-2 ;i++ ){
            // if(i==0 ||(i>0 && nums[i]!= nums[i+1])){
                 int l = i+1;
                 int r = len -1;
                 int sum = 0-nums[i];
                 while(l<r){
                     if(nums[l]+nums[r] == sum){
                         result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                         while(l<r &&(nums[l] == nums[l+1])) l++;
                         while(l<r &&(nums[r] == nums[r-1])) r--;
                         l++;
                         r--;
                     }
                     else if(nums[l]+nums[r] > sum)
                         r--;
                     else
                         l++;
                 }
             }
         //}
         return result;

     }
}
