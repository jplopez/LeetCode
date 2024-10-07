package com.jplopez.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainsDuplicateTest {

  private ContainsDuplicate cd = new ContainsDuplicate();

  @Test
  public void case1() {
    int nums[] = {1,2,3,1};
    assertTrue("expected true",cd.containsDuplicate(nums));
    assertTrue("expected true",cd.containsDuplicate2(nums));
  }

  @Test
  public void case2() {
    int nums[] = {1,2,3,4};
    assertFalse("expected false",cd.containsDuplicate(nums));
    assertFalse("expected false",cd.containsDuplicate2(nums));
  }

  @Test
  public void case3() {
    int nums[] = {1,1,1,3,3,4,3,2,4,2};
    assertTrue("expected true",cd.containsDuplicate(nums));
    assertTrue("expected true",cd.containsDuplicate2(nums));
  }

}
