package com.jplopez.arrays;

public class RotateArray {

  public void rotate(int[] nums, int k) {
    if(nums==null) return;

    int l=nums.length-1;
    int prev=nums[l];
    for(int i=0;i<=l;i++) {
      if(k>0) {
        int temp=nums[i];
        nums[i]=prev;
        prev=temp;

        if(i==l) {
          i=0;
          k--;
          if(k==0) nums[0]=prev;
        }
      }
    }

  }

  public void rotate2(int[] nums, int k) {
    int oldIndex;
    int nextIndex;
    int counter=nums.length;
    int piv=0; // pivot value to track current position

    while(counter>0) {
      oldIndex=piv;
      int newValue=nums[oldIndex];
      do {
        nextIndex=calcIndex(oldIndex,k,nums.length);
        int oldValue=nums[nextIndex];
        nums[nextIndex]=newValue;
        counter--;
        if(nextIndex!=piv) {
          int temp=newValue;
          newValue=oldValue;
          oldValue=temp;
          oldIndex=nextIndex;
        }
      } while(nextIndex!=piv);
      piv++;
    }
  }

  int calcIndex(int i,int k,int mod) {
    if(i+k<mod) return (i+k);
    return calcIndex(0,(i+k)%mod,mod);
  }



}
