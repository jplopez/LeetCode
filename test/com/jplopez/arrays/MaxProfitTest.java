package com.jplopez.arrays;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaxProfitTest {

  private MaxProfit t = new MaxProfit();

  @Test
  public void case1() {
    int[] prices = {7,1,5,3,6,4};
    int max = t.maxProfit(prices);
    assertTrue("Expected 7. Received:"+max,max==7);
  }

  @Test
  public void case2() {
    int[] prices = {1,2,3,4,5};
    int max = t.maxProfit(prices);
    assertTrue("Expected 4. Received:"+max,max==4);
  }

  @Test
  public void case3() {
    int[] prices = {7,6,4,3,1};
    int max = t.maxProfit(prices);
    assertTrue("Expected 0. Received:"+max,max==0);
  }

}
