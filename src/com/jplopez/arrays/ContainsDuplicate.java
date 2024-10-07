package com.jplopez.arrays;

import java.util.Arrays;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    int i = 0;
    int j = 1;
    while (i < nums.length) {
      if (j == nums.length) {
        i++;
        j = i + 1;
        continue;
      }
      if (nums[i] == nums[j])
        return true;
      j++;
    }
    return false;
  }

  public boolean containsDuplicate2(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return false;
  }
}
