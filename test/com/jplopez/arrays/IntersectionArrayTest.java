package com.jplopez.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class IntersectionArrayTest {


  private IntersectionArray ia = new IntersectionArray();

  @Test
  public void case1() {
    int[] nums1={1,2,2,1};
    int[] nums2={2,2};
    int[] output={2,2};

    int[] test = ia.intersect(nums1, nums2);
    sysoutArray(test);

    assertTrue("Expected length "+output.length+" received "+test.length, 
        output.length==test.length);
    for(int i=0;i<output.length;i++) {
      assertTrue("Expected "+output[i]+" received "+test[i],
          output[i]==test[i]);
    }
  }

  @Test
  public void case2() {
    int[] nums1={4,9,5};
    int[] nums2={9,4,9,8,4};
    int[] output1={4,9};

    int[] test = ia.intersect(nums1, nums2);
    Arrays.sort(test);
    sysoutArray(test);
    assertTrue("Expected "+output1.length+" numbers. Received "+test.length,
        output1.length==test.length);
    for(int i=0;i<output1.length;i++) {
      assertTrue("Expected "+output1[i]+
          " received "+test[i], output1[i]==test[i]);
    }
  }

  @Test
  public void case3() {
    int[] nums1={1,2,2,1};
    int[] nums2={2};
    int[] output1={2};

    int[] test = ia.intersect(nums1, nums2);
    Arrays.sort(test);
    sysoutArray(test);
    assertTrue("Expected "+output1.length+" numbers. Received "+test.length,
        output1.length==test.length);
    
    for(int i=0;i<output1.length;i++) {
      assertTrue("Expected "+output1[i]+
          " received "+test[i], output1[i]==test[i]);
    }
  }


  private void sysoutArray(int[] n) {
    System.out.print("{ ");
    for(int i=0;i<n.length;i++)System.out.print(n[i]+" ");
    System.out.println("}");
  }

}
