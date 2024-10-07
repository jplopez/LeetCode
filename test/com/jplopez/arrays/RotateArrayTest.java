package com.jplopez.arrays;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class RotateArrayTest {


  private RotateArray ra = new RotateArray();
  @Test
  public void edgeCases() {
    int[] nums=null;
    ra.rotate(nums, 0);
    assertTrue(nums==null);
  }

  @Test
  public void addModTest() {
    int sum = ra.calcIndex(4,3,7);
    assertTrue("Expected 0. received: "+sum,sum==0);
    sum = ra.calcIndex(2,6,5);
    assertTrue("Expected 3. Received: "+sum,sum==3);

    sum = ra.calcIndex(1,8,5);
    assertTrue("Expected 4. Received: "+sum,sum==4);
  }

  @Test
  public void case1() {
    /*
     * Input: nums = [1,2,3,4,5,6,7], k = 3
       Output: [5,6,7,1,2,3,4]
     */
    int[] nums = {1,2,3,4,5,6,7};
    int k=3;
    ra.rotate2(nums, k);
    System.out.println("output "+Arrays.toString(nums));
    assertTrue(nums.length==7);
    int[] outpu = {5,6,7,1,2,3,4};
    for(int i=0;i<outpu.length;i++) assertTrue("item "+i+": expected:"+outpu[i]+" received:"+nums[i], nums[i]==outpu[i]);

  }

  @Test
  public void case2() {
    /*
     * Input: nums = [-1,-100,3,99], k = 2
       Output: [3,99,-1,-100] 
     */
    int[] nums = {-1,-100,3,99};
    int k=2;
    ra.rotate2(nums, k);
    assertTrue(nums.length==4);
    int[] outpu = {3,99,-1,-100};
    for(int i=0;i<outpu.length;i++) assertTrue("item "+i+": expected:"+outpu[i]+" received:"+nums[i], nums[i]==outpu[i]);
  }

  @Test
  public void case3() {
    /*
     * Input: nums = [-1,-100,3,99], k = 2
       Output: [3,99,-1,-100] 
     */
    int[] nums = {1,2,3,4,5,6};
    int k=4;
    ra.rotate2(nums, k);
    assertTrue(nums.length==6);
    int[] outpu = {3,4,5,6,1,2};
    for(int i=0;i<outpu.length;i++) assertTrue("item "+i+": expected:"+outpu[i]+" received:"+nums[i], nums[i]==outpu[i]);
  }
}


