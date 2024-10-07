package com.jplopez.trees;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/994/
 * 
 */
public class NextRightPointerInEachNode {

  public Node connect(Node root) {
    if (root == null) return null;
   
    if(root.right != null) {
      Node next = nextRight(root);
      if(next!=null) root.right.next = (next.left != null)? next.left : next.right;
    }
    if(root.left != null) {
      if(root.right != null) root.left.next = root.right;
      else {
        Node next = nextRight(root); 
        if(next!=null) root.left.next = (next.left != null)? next.left : next.right;
      }
    }
      root.right= connect(root.right);
      root.left = connect(root.left);
      return root;
  }

  public Node nextRight(Node n) {
    if(n==null) return null;
    if (n.next != null && !isFinalLeaf(n.next)) return n.next;
    else return this.nextRight(n.next);
  }
  public boolean isFinalLeaf(Node n) {
    return (n!=null) && (n.left == null && n.right==null);
  }
}
