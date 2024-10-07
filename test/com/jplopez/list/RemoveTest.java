package com.jplopez.list;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveTest {

  Remove r = new Remove();

@Test 
public void deleteNodeTest() {
  ListNode head = new ListNode(4);
  head.next=new ListNode(5, (new ListNode(1,new ListNode(9))));
  r.deleteNode(head.next);
  assertTrue(head.next.val==1);
}

  @Test
  public void removeNthFromEndTest1() {
    ListNode head = new ListNode(1);
    head.next=new ListNode(2, (new ListNode(3,new ListNode(4, new ListNode(5)))));
  
    ListNode newHead = r.removeNthFromEnd(head, 2);
    assertTrue("expected 1: "+newHead.val,newHead.val==1);
    assertTrue("expected 2: "+newHead.next.val,newHead.next.val==2);
    assertTrue("expected 3: "+newHead.next.next.val,newHead.next.next.val==3);
    assertTrue("expected 5: "+newHead.next.next.next.val,newHead.next.next.next.val==5);
  }

  @Test
  public void removeNthFromEndTest2() {
    ListNode head = new ListNode(1);
  
    ListNode newHead = r.removeNthFromEnd(head, 1);
    assertNull(newHead);
  }

  @Test
  public void removeNthFromEndTest3() {
    ListNode head = new ListNode(1, new ListNode(2));
  
    ListNode newHead = r.removeNthFromEnd(head, 1);
    assertTrue("expected 1: "+newHead.val,newHead.val==1);
    assertNull(newHead.next);
  }

  @Test
  public void removeNthFromEndTest4() {
    ListNode head = new ListNode(1, new ListNode(2));
  
    ListNode newHead = r.removeNthFromEnd(head, 2);
    assertTrue("expected 2: "+newHead.val,newHead.val==2);
    assertNull(newHead.next);
  }
}
