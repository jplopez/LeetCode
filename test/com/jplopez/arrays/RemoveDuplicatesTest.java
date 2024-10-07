package com.jplopez.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RemoveDuplicatesTest {

  private RemoveDuplicatesFromSorted t = new RemoveDuplicatesFromSorted();

  @Test
  public void case1() {
    int[] nums = {1,1,2};
    int[] expectedNums={1,2};
    assertSolution(nums,expectedNums);
  }

  
  @Test
  public void case2() {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int[] expectedNums={0,1,2,3,4};
    assertSolution(nums,expectedNums);
  }

  public void assertSolution(int[] nums, int[] expectedNums) {
    int l = expectedNums.length;
    int x = t.removeDuplicates(nums);
    assertTrue("num expected "+l+". received:"+x, x==l);
    for(int i=0;i<l;i++) assertTrue(nums[i]==expectedNums[i]);
  }
}
