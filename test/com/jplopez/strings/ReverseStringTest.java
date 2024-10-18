package com.jplopez.strings;

import org.junit.Test;
import static org.junit.Assert.*;

import com.jplopez.arrays.ReverseString;

public class ReverseStringTest {

  ReverseString rs = new ReverseString();

  @Test
  public void edgeTest() {
    char[] s={'a'};
    rs.reverseString(s);
    assertTrue(s[0]=='a');
  }

  @Test
  public void ex1() {
    char[] s = {'h','e','l','l','o'};
    char[] output= {'o','l','l','e','h'};
  
    rs.reverseString(s);
    for(int i=0;i<s.length;i++) assertTrue("["+i+"] expected '"+output[i]+"'' received '"+s[i]+"'",s[i]==output[i]);

  }

  @Test
  public void ex2() {
    char[] s = {'H','a','n','n','a','h'};
    char[] output= {'h','a','n','n','a','H'};
  
    rs.reverseString(s);
    for(int i=0;i<s.length;i++) assertTrue(i+" expected "+output[i]+" received "+s[i],s[i]==output[i]);

  }

}
