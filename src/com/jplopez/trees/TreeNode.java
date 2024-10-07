package com.jplopez.trees;
public class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }

  public String toString() { return "("+val+")"; }

  public int hashCode() { return val; }

  public static final TreeNode build(int val) { return new TreeNode(val); }
  
  public final TreeNode left(TreeNode l) { 
    this.left = l; 
    return this;
  }

  public final TreeNode left(int val) {  
    return this.left(build(val));
  }

  public final TreeNode right(TreeNode r) { 
    this.right = r; 
    return this;
  }

  public final TreeNode right(int val) { 
    return this.right(build(val));
  }

}
