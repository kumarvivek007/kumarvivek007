package com.kv.dataStructures.arrays;

public class FindMedianSortedArraysSolution {
    /* Not Solved  !!*/
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] fullArr = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        double result;

        while(k<fullArr.length){
            if(nums1[i] <nums2[j]){
                fullArr[k] = nums1[i];
                if(i< nums1.length){
                    i++;
                }

            }else if(nums1[i] >nums2[j]){
                fullArr[k] = nums2[j];
                if(j< nums2.length){
                    j++;
                }
            }
            k++;
        }
        int mid = fullArr.length/2;
        if(fullArr.length % 2 >0){
            result = (double) fullArr[mid];
        }else{
            result = ((double) fullArr[mid] +(double) fullArr[mid-1])/2.00;
        }

        return result;
    }
    public static void main(String[] args) {
        int [] nums1 = {1,3};
        int [] nums2 = {2};
        FindMedianSortedArraysSolution obj = new FindMedianSortedArraysSolution();
        System.out.print(obj.findMedianSortedArrays(nums1,nums2));
    }
}
