package com.jplopez.arrays;

import java.util.Arrays;

public class ReverseString {

  public void reverseString(char[] s) {
    int i=0;
    int j=s.length-1;
    while(i<j) {
      char tmp=s[i];
      s[i++]=s[j];
      s[j--]=tmp;
    }
  }
  private static final double LIMIT=Math.pow(2d, 31);

  public int reverse(int x) {
    int f=1;
    if(x<0)f=-1;
    char[] s = String.valueOf(Math.abs(x)).toCharArray();
    reverseString(s);
    try{ 
      return f*strToInt32(s);      
    } catch(NumberFormatException e) {
      return 0;
    }
  }

  private int strToInt32(char[] s) {
    Long rev=Long.valueOf(String.valueOf(s));
    if(rev>LIMIT || rev<-1*LIMIT) return 0;
    return rev.intValue();
  }

  public boolean isAnagram(String s, String t) {
    char[] sArray=s.trim().replace(" ","").toCharArray();
    char[] tArray=t.trim().replace(" ","").toCharArray();
    Arrays.sort(sArray,0,sArray.length);
    Arrays.sort(tArray,0,tArray.length);
    return Arrays.toString(sArray).equals(Arrays.toString(tArray));
  }
}
