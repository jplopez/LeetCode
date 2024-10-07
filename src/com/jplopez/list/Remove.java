package com.jplopez.list;

public class Remove {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head==null) return null;

    int index = 0;
    ListNode tmp = head;
    while (tmp.next != null){
      index++;
      tmp=tmp.next;
    }
    //removing head;
    index-=n;
    if(index<0) return head.next;
    
    tmp = head;
    while (index > 0) {
      tmp = tmp.next;
      index--;
    }
    if(tmp.next.next!=null) {
      tmp.next.val=tmp.next.next.val;
      tmp.next=tmp.next.next;
    } else {
      tmp.next=null;
    }
    return head;
  }

}
