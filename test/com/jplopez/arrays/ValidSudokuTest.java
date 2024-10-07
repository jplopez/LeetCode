package com.jplopez.arrays;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

public class ValidSudokuTest {

  ValidSudoku vSudoku = new ValidSudoku();

  final char[][] valid = {
   {'5','3','.','.','7','.','.','.','.'}
  ,{'6','.','.','1','9','5','.','.','.'}
  ,{'.','9','8','.','.','.','.','6','.'}
  ,{'8','.','.','.','6','.','.','.','3'}
  ,{'4','.','.','8','.','3','.','.','1'}
  ,{'7','.','.','.','2','.','.','.','6'}
  ,{'.','6','.','.','.','.','2','8','.'}
  ,{'.','.','.','4','1','9','.','.','5'}
  ,{'.','.','.','.','8','.','.','7','9'}};

  final char[][] invalid = {
     {'8','3','.','.','7','.','.','.','7'}
    ,{'6','.','.','1','9','5','.','.','.'}
    ,{'.','9','8','.','.','.','.','6','.'}
    ,{'8','.','.','.','6','.','.','.','3'}
    ,{'4','.','.','8','.','3','.','.','1'}
    ,{'7','.','.','.','2','.','.','.','6'}
    ,{'.','6','.','.','.','.','2','8','.'}
    ,{'.','.','6','4','1','9','.','.','5'}
    ,{'.','.','.','.','8','.','.','7','9'}};
  

    @Test
  public void isValidSudoku() {
    assertTrue(vSudoku.isValidSudoku(valid));
    assertFalse(vSudoku.isValidSudoku(invalid));
  }

  @Test
  public void validCharTest() {
    assertTrue(vSudoku.validChar(valid[0][0], vSudoku.newDigitsList()));
    assertTrue(vSudoku.validChar(valid[1][2], vSudoku.newDigitsList()));
    assertFalse(vSudoku.validChar('A', vSudoku.newDigitsList()));
    assertFalse(vSudoku.validChar(valid[0][0], Collections.emptyList()));
  }

  @Test
  public void validRow() {
    for(int row=0;row<9;row++) {
      assertTrue(vSudoku.validRow(valid, row,9,vSudoku.newDigitsList()));
    }
    assertFalse(vSudoku.validRow(invalid, 0,9,vSudoku.newDigitsList()));
  }

  @Test
  public void validCol() {
    for(int col=0;col<9;col++) {
      assertTrue(vSudoku.validCol(valid, col,9,vSudoku.newDigitsList()));
    }
    assertFalse(vSudoku.validCol(invalid, 0,9,vSudoku.newDigitsList()));
  }

  @Test
  public void validSubBox() {
    assertTrue(vSudoku.validSubBox(valid,0, 0,3));
    assertTrue(vSudoku.validSubBox(valid,0, 3,3));
    assertTrue(vSudoku.validSubBox(valid,0, 6,3));
    assertTrue(vSudoku.validSubBox(valid,3, 0,3));
    assertTrue(vSudoku.validSubBox(valid,3, 3,3));
    assertTrue(vSudoku.validSubBox(valid,3, 6,3));
    assertTrue(vSudoku.validSubBox(valid,6, 0,3));
    assertTrue(vSudoku.validSubBox(valid,6, 3,3));
    assertTrue(vSudoku.validSubBox(valid,6, 6,3));

    assertFalse(vSudoku.validSubBox(invalid,6, 0,3));
  }

  @Test
  public void validBoard() {
    assertTrue(vSudoku.validBoard(valid));
    assertFalse(vSudoku.validBoard(invalid));
  }


}
