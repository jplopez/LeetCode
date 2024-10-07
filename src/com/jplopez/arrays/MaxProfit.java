package com.jplopez.arrays;

public class MaxProfit {

  private static final int BUY=-1;
  private static final int SELL=1;


  public int maxProfit(int[] prices) {
    int op=BUY; // operation
    int profit=0;
  
    int i=0;
    while(i<prices.length) {
      boolean skip=false;
      if(op==BUY) {
        int buy=bestBuy(profit,i,prices);
        if(buy!=-1) {
          i=buy;
          System.out.println("buy on day "+(i+1)+" price "+prices[i]);
        } else skip=true;
      } 
      else if(op==SELL) {
        i=bestSell(profit,i,prices);
        System.out.println("sell on day "+(i+1)+" price "+prices[i]);
      }
      if(!skip) {
        System.out.println("profit: "+profit+"+"+(op*prices[i])+"="+(profit+(op*prices[i])) );
        profit+=op*prices[i];
        op = (op==BUY)? SELL:BUY;
      }
      i++;
    }
    
    if(profit<=0) return 0;
    return profit;
  }

  private int bestBuy(int profit, int i, int[] prices) {
    if(i<prices.length-1) {
      if(prices[i]>prices[i+1]) return bestBuy(profit, i+1, prices);
      return i;
    }
    return -1;
  }

  private int bestSell(int profit, int i, int[] prices) {
    if(i==prices.length-1) return i;
    if(prices[i]<prices[i+1]) return bestSell(profit, i+1, prices);
    return i;
  }


}
