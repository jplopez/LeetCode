package com.jplopez.trees;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class LowestCommonAncestorBinTree {

  private static final int NOT_FOUND=-1;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    List<Integer> pPath = nodePath(root, p, new ArrayList<Integer>());
    List<Integer> qPath = nodePath(root, q, new ArrayList<Integer>());

    int length=Math.min(pPath.size(),qPath.size()),lca=pPath.get(0),i=1;
    while(i<length && (pPath.get(i)==qPath.get(i))) lca=pPath.get(i++);
    return new TreeNode(lca);
  }

  private List<Integer> nodePath(TreeNode root, TreeNode n, List<Integer> path) {
    path.addLast(root.val);
    if(root.val == n.val) return path;
    if(isFinalLeaf(root)) return null;
    if(root.left!=null) {
      List<Integer> lPath = nodePath(root.left, n, new ArrayList<Integer>(path));
      if(lPath!=null) return lPath;
    }
    if(root.right!=null) {
      List<Integer> rPath = nodePath(root.right, n, new ArrayList<Integer>(path));
      if(rPath!=null) return rPath;
    }
    return null;
  }

  private boolean isFinalLeaf(TreeNode n) { 
      return (n.left==null && n.right==null); }

  public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    int qDepth = NOT_FOUND;
    int pDepth = nodeDepth(root.left, p, 0);
    if(pDepth==NOT_FOUND) pDepth = nodeDepth(root.right, p, 0);

    qDepth = nodeDepth(root.left, q, 0);
    if(qDepth==NOT_FOUND) qDepth = nodeDepth(root.right, q, 0);

    System.out.println("p "+pDepth +" q "+qDepth);
    return null;
  }

  private int nodeDepth(TreeNode root, TreeNode n, int depth) { 
    if(root==null) return NOT_FOUND;
    if(root.val==n.val) return depth+1;
    
    int brDepth = nodeDepth(root.left, n, depth+1);
    if(brDepth==NOT_FOUND) brDepth = nodeDepth(root.right, n, depth+1);
    return brDepth;
  }

  private TreeNode lca(TreeNode root, TreeNode p, TreeNode q, int depth) {
    if(depth==1) return root;
    if(root==null) return null;

    TreeNode ret = lca(root.left, p,q,depth-1);
    if(ret!=null) return ret;
    return lca(root.right,p,q,depth-1);   
 }

  // private TreeNode nodePath(TreeNode root, TreeNode p, TreeNode q, boolean pfound, boolean qfound) {
  //   pfound = (pfound)? pfound: (root.val == p.val); 
  //   qfound = (qfound)? qfound: (root.val == q.val); 

  //   if(pfound && qfound) return root;
  //   if(isFinalLeaf(root)) return null;

  //   TreeNode branch = (root.left!=null)?nodePath(root.left, p,q,pfound,qfound):null;
  //   if(branch==null) branch = (root.right!=null)?nodePath(root.right, p,q,pfound,qfound):null;
  //   if(branch!=null) {
  //     pfound = (pfound)? pfound: (branch.val == p.val); 
  //     qfound = (qfound)? qfound: (branch.val == q.val);   
  //     if(pfound && qfound) return root;
  //     if(pfound || qfound) return nodePath(branch,p,q,pfound,qfound);
  //   }
  //   return root;
  // }

}
