package com.jplopez.trees;
import static org.junit.Assert.*;

import org.junit.Test;

import com.jplopez.trees.LowestCommonAncestorBinTree;
import com.jplopez.trees.TreeNode;

public class LowestCommonAncestorTest {

  LowestCommonAncestorBinTree lca = new LowestCommonAncestorBinTree();

  @Test
  public void lca1_ex1() {

    TreeNode t = 
      TreeNode.build(3)
        .left(TreeNode.build(5)
                .left(TreeNode.build(6))
                .right(TreeNode.build(2)
                  .left(7)
                  .right(4))
              )
        .right(TreeNode.build(1)
                .left(0)
                .right(8)
              );

    assertNode(t, 3, 5, 1);
    assertNode(t.left, 5, 6, 2);
    assertNode(t.right, 1, 0, 8);
    assertNode(t.left.right, 2, 7, 4);

    assertNode(
        lca.lowestCommonAncestor(t, 
            TreeNode.build(5), 
            TreeNode.build(1)), 
          3);

   }

  @Test
  public void lca1_ex2() { 
    TreeNode t = 
      TreeNode.build(3)
        .left(TreeNode.build(5)
                .left(TreeNode.build(6))
                .right(TreeNode.build(2)
                  .left(7)
                  .right(4))
              )
        .right(TreeNode.build(1)
                .left(0)
                .right(8)
              );

    assertNode(
      lca.lowestCommonAncestor(t, 
          TreeNode.build(5), 
          TreeNode.build(4)), 
        5);

  }



  @Test
  public void lca2_ex1() {

    TreeNode t = 
      TreeNode.build(3)
        .left(TreeNode.build(5)
                .left(TreeNode.build(6))
                .right(TreeNode.build(2)
                  .left(7)
                  .right(4))
              )
        .right(TreeNode.build(1)
                .left(0)
                .right(8)
              );

    assertNode(t, 3, 5, 1);
    assertNode(t.left, 5, 6, 2);
    assertNode(t.right, 1, 0, 8);
    assertNode(t.left.right, 2, 7, 4);

    assertNode(
      lca.lowestCommonAncestor2(t, 
          TreeNode.build(5), 
          TreeNode.build(1)), 
        3);
   }

  @Test
  public void lca2_ex2() { 
    TreeNode t = 
      TreeNode.build(3)
        .left(TreeNode.build(5)
                .left(TreeNode.build(6))
                .right(TreeNode.build(2)
                  .left(7)
                  .right(4))
              )
        .right(TreeNode.build(1)
                .left(0)
                .right(8)
              );

    assertNode(
      lca.lowestCommonAncestor2(t, 
          TreeNode.build(5), 
          TreeNode.build(4)), 
        5);
  }


  public final void assertNode(TreeNode test, int val) {
    assertNotNull("TreeNode is null", test);
    assertTrue("Val is: " + test +". Expected was: " + val, test.val == val);    
  }

  public final void assertNode(TreeNode test, int val, int left, int right) {
    assertNotNull("TreeNode is null", test);
    assertTrue(test +" expected val was: " + val, test.val == val);
    assertNotNull(test + "left is null", test.left);
    assertTrue(test +".left = " + test.left + ". Expected val was: " + left, test.left.val == left);
    assertNotNull(test + "right is null", test.right);
    assertTrue(test +".right = " + test.right + ". Expected val was: " + right, test.right.val == right);
  }
}
