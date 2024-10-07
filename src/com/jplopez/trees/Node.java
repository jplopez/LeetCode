package com.jplopez.trees;

public class Node {

  public int val;
  public Node left;
  public Node right;
  public Node next;

  public Node() {
  }

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, Node _left, Node _right) {
    val = _val;
    left = _left;
    right = _right;
  }

  public Node(int _val, Node _left, Node _right, Node _next) {
    val = _val;
    left = _left;
    right = _right;
    next = _next;

  }

  public String toString() {
    return "val:"+val+";L:"+(left!=null)+";R:"+(right!=null)+";N:"+(next!=null);
  }
  // public static Node nodeFromArray(int[] vals) {
  //   if(vals==null || vals.length==0) return null;

  //   final int NODE=1, LEFT=2, RIGHT=3;
  //   int STEP = NODE;

  //   Node root = new Node();
  //   Node cursor = root;
  //   Node parent = null;

  //   int i=0;

  //   while(i<vals.length) {
  //     switch (STEP) {
  //       case NODE:
  //         cursor.val=vals[i++];
  //         parent=cursor;
  //         cursor=cursor.left;
  //         STEP=LEFT;
  //         break;
  //       case LEFT:
  //         cursor = new Node(vals[i++]);
  //         cursor=parent.right;
  //         STEP=RIGHT;
  //         break;
  //       case RIGHT:
  //         cursor.right=new Node(vals[i++]);
  //         STEP=LEFT;
  //         parent=parent.left;
  //         cursor=parent.left.left;
  //         break;
  //       default:
  //         break;
  //     } // switch
  //   }   // while

  //   return root;
  // }
}