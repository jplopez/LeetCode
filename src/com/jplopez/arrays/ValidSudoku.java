package com.jplopez.arrays;

import java.util.Arrays;
import java.util.List;

public class ValidSudoku {

  private static final char EMPTY = '.';

  public boolean isValidSudoku(char[][] board) {
    return validBoard(board)
    && validSubBox(board,0, 0,3)
    && validSubBox(board,0, 3,3)
    && validSubBox(board,0, 6,3)
    && validSubBox(board,3, 0,3)
    && validSubBox(board,3, 3,3)
    && validSubBox(board,3, 6,3)
    && validSubBox(board,6, 0,3)
    && validSubBox(board,6, 3,3)
    && validSubBox(board,6, 6,3);
  }

  boolean validCol(char[][] board, int col, int colCount, List<Character> digits) {
    for(int i=0;i<colCount;i++) if(!validChar(board[i][col],digits)) return false;
    return true;
  }

  boolean validRow(char[][] board, int row, int rowCount, List<Character> digits) {
    for(int i=0;i<rowCount;i++) if(!validChar(board[row][i],digits)) return false;
    return true;
  }

  boolean validBoard(char[][] board) {
    int index=0;
    int size=9;
    while(index<size && validRow(board, index,size, newDigitsList()) 
        && validCol(board, index, size, newDigitsList())) index++;
    return index==size;
  }

  boolean validSubBox(char[][] board, int firstRow, int firstCol, int size) {
    List<Character> digits = newDigitsList();
    int row=0;
    int col=0;
    while((row<size && col<size) && validChar(board[firstRow+row][firstCol+col], digits)) {
      row=(col==size-1)?row+1:row;
      col=(col==size-1)?0:col+1;
    }
    return (row==size);
  }

  boolean validChar(char c, List<Character> digits) {
    if(c==EMPTY) return true;
    int i = digits.indexOf(c);
    if(i>=0){
      digits.set(i,EMPTY);
      return true;
    } else return false;
  }

  List<Character> newDigitsList() {
    return Arrays.asList('0','9','8','7','6','5','4','3','2','1');
  }
}
