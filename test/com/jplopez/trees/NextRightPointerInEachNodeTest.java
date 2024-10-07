package com.jplopez.trees;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jplopez.trees.NextRightPointerInEachNode;
import com.jplopez.trees.Node;

public class NextRightPointerInEachNodeTest {

  private NextRightPointerInEachNode solution = new NextRightPointerInEachNode();
  @Test 
  public void connectEmptyTree() { assertNull(solution.connect(null)); }

  @Test 
  public void connectOneNodeTree() { 
    Node n = new Node(-1);
    assertNode(n, -1, false, false);
   }

  @Test 
  public void connectBalancedBinTree() { 

    Node n = new Node(1, 
    new Node(2, new Node(4), new Node(5)), 
    new Node(3, new Node(6), new Node(7)));

    Node res = solution.connect(n);
    assertNode(res, 1, true, true);
    assertNode(res.left, 2, true, true, 3);
    assertNode(res.right, 3, true, true);
    assertNode(res.left.left, 4, false, false, 5);
    assertNode(res.left.right, 5, false, false, 6);
    assertNode(res.right.left, 6, false, false, 7);
    assertNode(res.right.right, 7, false, false);
 
  }

  @Test
  public void connectUnbalancedBinTree1() {

    
    Node n1 = new Node(1, 
    new Node(2, new Node(4), new Node(5)), 
    new Node(3, null, new Node(7)));


    Node res = solution.connect(n1);
    assertNode(res, 1, true, true);
    assertNode(res.left, 2, true, true, 3);
    assertNode(res.right, 3, false, true);
    assertNode(res.left.left, 4, false, false, 5);
    assertNode(res.left.right, 5, false, false, 7);
    assertNode(res.right.right, 7, false, false);

  }

  
  @Test
  public void connectUnbalancedBinTree2() {

    Node n2 = new Node(1, 
    new Node(2, new Node(4), null), 
    new Node(3, null, new Node(5)));


    Node res = solution.connect(n2);
    assertNode(res, 1, true, true);
    assertNode(res.left, 2, true, false, 3);
    assertNode(res.right, 3, false, true);
    assertNode(res.left.left, 4, false, false, 5);
    assertNull(res.left.right);
    assertNull(res.right.left);
    assertNode(res.right.right, 5, false, false);
  }


  @Test
  public void connectUnbalancedBinTree3() {

    Node n2 = new Node(0, 
        new Node(2, 
            new Node(1, 
                new Node(5), 
                new Node(1)), 
            null), 
        new Node(4, 
            new Node(3, 
                null, 
                new Node(6)), 
            new Node(-1, 
                null, 
                new Node(8))));


    Node res = solution.connect(n2);
    assertNode(res, 0, true, true);
    assertNode(res.left, 2, true, false, 4);
    assertNode(res.right, 4, true, true);
    assertNode(res.left.left, 1, true, true, 3);
    assertNull(res.left.right);
    assertNode(res.right.left, 3, false, true, -1);
    assertNode(res.right.right, -1, false, true);
    //3erd row
    assertNode(res.left.left.left, 5, false, false, 1);
    assertNode(res.left.left.right, 1, false, false, 6);
    
    assertNode(res.right.left.right, 6, false, false, 8);
    assertNode(res.right.right.right, 8, false, false);

  }

  @Test
  public void connectUnbalancedBinTree4() {

    Node n2 = new Node(-9, 
        new Node(-3, 
            null,
            new Node(4, 
                new Node(-6), 
                null
            )
        ),  
        new Node(2, 
            new Node(4, 
                new Node(-5), 
                null
            ), 
            new Node(0)
        )
    );

    Node res = solution.connect(n2);
    assertNode(res, -9, true, true);
    assertNode(res.left, -3, false, true, 2);
    assertNode(res.right, 2, true, true);

    assertNode(res.left.right, 4, true, false, 4);
    assertNode(res.right.left, 4, true, false, 0);
    assertNode(res.right.right, 0, false, false);
    
    //3erd row
    assertNode(res.right.left.left, -5, false, false);
    assertNode(res.left.right.left, -6, false, false, -5);
  
  }





  private void assertNode(Node test, int val, boolean left, boolean right) {
    assertNode(test, val, left, right, false, 0);
  }

  private void assertNode(Node test, int val, boolean left, boolean right, int nextVal) {
    assertNode(test, val, left, right, true, nextVal);
  }

  private void assertNode(Node test, int val, boolean left, boolean right, boolean next, int nextVal) {

    assertNotNull("Node("+val+") = null. Expected: not null",test);
    assertTrue("Node("+val+").val = "+test.val+". Expected " + val, test.val == val);
    if(left) assertTrue("Node("+val+").left = null. Expected: not null", test.left!=null);
    else assertTrue("Node("+val+").left != null. Expected: null", test.left==null);

    if(right) assertTrue("Node("+val+").right = null. Expected: not null", test.right!=null);
    else assertTrue("Node("+val+").right != null. Expected: null",test.right==null);

    if(next) {
      assertTrue("Node("+val+").next = null. Expected: Node("+nextVal+")",test.next!=null);
      assertTrue("Node("+val+").next = Node("+test.next.val+"). Expected: Node("+nextVal+")", test.next.val == nextVal);
      }  //else assertTrue(test.next==null);

   }
}
