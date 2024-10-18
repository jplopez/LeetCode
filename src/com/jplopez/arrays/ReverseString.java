package com.jplopez.arrays;

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
    return f*strToInt32(s);      
  }

  private int strToInt32(char[] s) {
    Long rev=Long.valueOf(String.valueOf(s));
    if(rev>LIMIT || rev<-1*LIMIT) return 0;
    return rev.intValue();
  }
}
