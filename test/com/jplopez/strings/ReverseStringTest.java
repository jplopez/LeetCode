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

  @Test
  public void reverseInt() {
    int x = 123;
    int out = rs.reverse(x);
    assertTrue("Expected 321. Received "+out,out==321);

    x = -123;
    out = rs.reverse(x);
    assertTrue("Expected -321. Received "+out,out==-321);

    x = 120;
    out = rs.reverse(x);
    assertTrue("Expected 21. Received "+out,out==21);

  }

  @Test
  public void reverseInt1() {
    int x = -2147483648;
    int out = rs.reverse(x);
    assertTrue("Expected 0. Received "+out,out==0);
  }

  @Test
  public void anagram1() {
    String s = "anagram", t = "nagaram";
    assertTrue(rs.isAnagram(s, t));

    s = "rat";t = "car";
    assertFalse(rs.isAnagram(s, t));
  }

  @Test
  public void anagram2() {
    String in="new york times";
    String out="monkeys write";
    assertTrue(rs.isAnagram(in, out));
  }
}
