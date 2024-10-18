package com.jplopez.sorting;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortedArrayTest {

  MergeSortedArray msa = new MergeSortedArray();

  @Test
  public void test1() {
    int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
    int m=3, n=3;
    int[] out={1,2,2,3,5,6};
    msa.merge(nums1, m, nums2, n);
    int i=0;
    while(i<out.length) assertTrue("["+i+"] ",nums1[i]==out[i++]);
    assertTrue(i==out.length);
  }
}
