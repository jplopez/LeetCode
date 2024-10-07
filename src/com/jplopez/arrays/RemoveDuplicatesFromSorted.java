package com.jplopez.arrays;

public class RemoveDuplicatesFromSorted {

  public int removeDuplicates(int[] nums) {
    int prev=nums[0];
    int l=nums.length;
    int i=1;
    while(i<l) {
      int pivot=i;
      if(prev==nums[i]) {
        prev=nums[i];
        for(int p=pivot;p<l-1;p++) {
          nums[p]=nums[p+1];
        }
        l--;
      } else {
        prev=nums[i];
        i++;
      }
    }
    return l;
  }
}
