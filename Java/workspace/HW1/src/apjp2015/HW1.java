package apjp2015;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

import apjp2015.HW1.EightQueen;
import apjp2015.HW1.Sudoku;
import apjp2015.HW1.Sudoku.SValue;


/**
 * Use java enums to represent and solve typical puzzles.
 *   
 * This HW provides you with two partial enum classes : EightQueen and Sudoku,
 * one for representing 8 queen board positions and one for Sudoku cells.
 * Your tasks is to complete them and implement methods for checking if an input board is a solution
 * and, given a partial solution, try to complete it and provide one complete solution.
 * 
 * Note: You should also write test cases to test if your program is correct. 
 * 
 *
 */
public class HW1 {

	public static void main(String[] args) {
		
		// TODO Write your test cases here!
		//EightQueen test area1
		//1-1. (Condition of this case: negative diagonal relation)
		EnumSet<EightQueen> boardQueen1 = EnumSet.of(EightQueen.P00, EightQueen.P14, EightQueen.P21, EightQueen.P35, EightQueen.P42, EightQueen.P56, EightQueen.P63, EightQueen.P77);		
		System.out.println("EightQueen test area1-1");
		System.out.println("displayQBoard:");
		System.out.print(EightQueen.displayQBoard(boardQueen1));
		System.out.println("isSolution:");
		System.out.println("Result: " + EightQueen.isSolution(boardQueen1));
		System.out.println("isSolution after getSolution:");
		System.out.println("Result: " + EightQueen.isSolution(EightQueen.getSolution(boardQueen1)));
		//1-2 (Condition of this case: same row relation)
		EnumSet<EightQueen> boardQueen2 = EnumSet.of(EightQueen.P01, EightQueen.P14, EightQueen.P21, EightQueen.P35, EightQueen.P42, EightQueen.P56, EightQueen.P63, EightQueen.P77);		
		System.out.println("\nEightQueen test area1-2");
		System.out.println("displayQBoard:");
		System.out.print(EightQueen.displayQBoard(boardQueen2));
		System.out.println("isSolution:");
		System.out.println("Result: " + EightQueen.isSolution(boardQueen2));
		System.out.println("isSolution after getSolution:");
		System.out.println("Result: " + EightQueen.isSolution(EightQueen.getSolution(boardQueen2)));
		//1-3 (Condition of this case: Six preloaded cell and wait for getSolution)
		EnumSet<EightQueen> boardQueen3 = EnumSet.of(EightQueen.P30, EightQueen.P72, EightQueen.P64, EightQueen.P05, EightQueen.P26, EightQueen.P47);
		System.out.println("\nEightQueen test area1-3");
		System.out.println("displayQBoard:");
		System.out.print(EightQueen.displayQBoard(boardQueen3));
		System.out.println("isSolution:");
		System.out.println("Result: " + EightQueen.isSolution(boardQueen3));
		System.out.println("isSolution after getSolution:");
		System.out.println("Result: " + EightQueen.isSolution(EightQueen.getSolution(boardQueen3)));
		System.out.println("displayQBoard after getSolution:");
		System.out.print(EightQueen.displayQBoard(EightQueen.getSolution(boardQueen3)));
		
		System.out.print("\n\n");
		
		//Sudoku test area2
		//2-1 (Condition of this case: remove some Sudoku cell)
		EnumMap<Sudoku, SValue> boardSudoku1 = new EnumMap<Sudoku, SValue> (Sudoku.class);
		for (int i=0; i<81; i++) {
			boardSudoku1.put(Sudoku.values()[i], SValue.values()[(i + i/9*3 + i/27)%9]);
			//boardSudoku1.put(Sudoku.values()[80], SValue.values()[0]);
		}
	
		boardSudoku1.remove(Sudoku.values()[80]);
		boardSudoku1.remove(Sudoku.values()[24]);
		boardSudoku1.remove(Sudoku.values()[12]);
		boardSudoku1.remove(Sudoku.values()[55]);
		boardSudoku1.remove(Sudoku.values()[77]);
		System.out.println("\nSudoku test area2-1");
		System.out.println("displaySBoard:");
		System.out.print(Sudoku.displaySBoard(boardSudoku1));
		System.out.println("isSolution:");
		System.out.println("Result: " + Sudoku.isSudokuSolution(boardSudoku1));
		System.out.println("isSolution after getSolution:");
		System.out.println("Result: " + Sudoku.isSudokuSolution(Sudoku.getSolution(boardSudoku1)));
		System.out.println("displayQBoard after getSolution:");
		System.out.print(Sudoku.displaySBoard(Sudoku.getSolution(boardSudoku1)));
		
		//2-2 (Condition of this case: Blank Sudoku board)
		EnumMap<Sudoku, SValue> boardSudoku2 = new EnumMap<Sudoku, SValue> (Sudoku.class);
		System.out.println("\nSudoku test area2-2");
		System.out.println("displaySBoard:");
		System.out.print(Sudoku.displaySBoard(boardSudoku2));
		System.out.println("isSolution:");
		System.out.println("Result: " + Sudoku.isSudokuSolution(boardSudoku2));
		System.out.println("isSolution after getSolution:");
		System.out.println("Result: " + Sudoku.isSudokuSolution(Sudoku.getSolution(boardSudoku2)));
		System.out.println("displayQBoard after getSolution:");
		System.out.print(Sudoku.displaySBoard(Sudoku.getSolution(boardSudoku2)));
		
		//2-3 (Condition of this case: Real question with some cells(row5, column1, 5, 9) removed)
		int[][] Sudoku3 = { { 9, 6, 3, 1, 7, 4, 2, 5, 8 },
			                { 1, 7, 8, 3, 2, 5, 6, 4, 9 },
			                { 2, 5, 4, 6, 8, 9, 7, 3, 1 },
			                { 8, 2, 1, 4, 3, 7, 5, 9, 6 },
			                { 4, 9, 6, 8, 5, 2, 3, 1, 7 },
			                { 7, 3, 5, 9, 6, 1, 8, 2, 4 },
			                { 5, 8, 9, 7, 1, 3, 4, 6, 2 },
			                { 3, 1, 7, 2, 4, 6, 9, 8, 5 },
			                { 6, 4, 2, 5, 9, 8, 1, 7, 3 } };
		EnumMap<Sudoku, SValue> boardSudoku3 = new EnumMap<Sudoku, SValue> (Sudoku.class);
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				if(i != 4 && j != 0 && j != 4 && j != 8)
					boardSudoku3.put( Sudoku.values()[i*9+j], SValue.values()[Sudoku3[i][j]-1] );
			}
		}
		System.out.println("\nSudoku test area2-3");
		System.out.println("displaySBoard:");
		System.out.print(Sudoku.displaySBoard(boardSudoku3));
		System.out.println("isSolution:");
		System.out.println("Result: " + Sudoku.isSudokuSolution(boardSudoku3));
		System.out.println("isSolution after getSolution:");
		System.out.println("Result: " + Sudoku.isSudokuSolution(Sudoku.getSolution(boardSudoku3)));
		System.out.println("displayQBoard after getSolution:");
		System.out.print(Sudoku.displaySBoard(Sudoku.getSolution(boardSudoku3)));
		
	}	
		
	
	/**
	 * 
	 * @author chencc
	 *
	 */
	
	public enum EightQueen {
		P00, P01, P02, P03, P04, P05, P06, P07,
		P10, P11, P12, P13, P14, P15, P16, P17,
		P20, P21, P22, P23, P24, P25, P26, P27,
		P30, P31, P32, P33, P34, P35, P36, P37,
		P40, P41, P42, P43, P44, P45, P46, P47,
		P50, P51, P52, P53, P54, P55, P56, P57,
		P60, P61, P62, P63, P64, P65, P66, P67,
		P70, P71, P72, P73, P74, P75, P76, P77;
	
	 //Every position is indexed by its row and column value.  
	 int row, col ;	
	 
	 
	 static { // use static initializer to fill in (row, col) for every literal PXX.
		
		EightQueen[] allNQueen = EightQueen.values() ;
		int k = 0 ;
	   	for(int r =0; r < 8; r++ ){
	   		for(int c = 0; c < 8; c++){
	   	      allNQueen[k].row = r;
	   	      allNQueen[k].col = c;
	   	      k++ ;
	   		}
	   	}		 
	 }
	 
	 
	 /** Given a set of board positions, return a string displaying
	  *  the layout and content of the board.
	  */
	 public static String displayQBoard(EnumSet<EightQueen> board) {
		 String str = "";
			for (int r=0; r<8; r++) {
				str += "-------------------\n";
				for (int c=0; c<8; c++) {
					if(board.contains(EightQueen.values()[r*8+c]))
						str += "|X";
					else
						str += "| ";
				}
				str += "|\n";
			}
		  str += "-------------------\n";
	
		  return str;
//		 return 
//		 "-----------------\n" +
//		 "|X| | | | | | | |\n" +
//		 "-----------------\n" +
//		 "| | |X| | | | | |\n" +
//		 "...              \n"  ;
	 }
		
		
	/** Given a set of board positions, determine if it is a solution of 8 Queens problem.
	 *  @param board  a set of positions
	 *  @return true if it is a solution of 8 queen.
	 */
	 
	public static boolean isSolution(EnumSet<EightQueen> board ){
		if (board.size() != 8){
			System.out.println("The board's size is not match to 8.");
			return false;
		}
		
		Iterator<EightQueen> it = board.iterator();
		while (it.hasNext()) {
			EightQueen current = it.next();
			Iterator<EightQueen> itt = board.iterator();
			while(itt.hasNext()) {
				EightQueen compare = itt.next();
				if (compare == current) //same component
					continue;

				if (compare.row == current.row || compare.col == current.col){
					System.out.println("The two components are on the same ROW or COLUMN, where their's coordinate are (" + current.row + ", " + current.col + "), ("+ compare.row + ", " + compare.col + ").");
					return false;
				}
				if (compare.row - current.row == compare.col - current.col){
					System.out.println("The two components are negative diagonal relation, where their's coordinate are (" + current.row + ", " + current.col + "), ("+ compare.row + ", " + compare.col + ").");
					return false;
				}
				if (compare.row - current.row == -(compare.col - current.col)){
					System.out.println("The two components are positive diagonal relation, where their's coordinate are (" + current.row + ", " + current.col + "), ("+ compare.row + ", " + compare.col + ").");
					return false;
				}
			}
		}
		return true;
	}
	
	
	/** Given a set of board positions, determine if we get a solution of 8 Queens problem by adding additional positions
	 *  to the input board. Return any such extension of the input board if it is possible and return an empty set if
	 *  there is no such solution.  
	 *  @param  board  a set of positions . 
	 *  @return a solution board which is an extension of the inpout board, or Emptyset.none() 
	 *          if there is no solution.
	 */
	 
	public static EnumSet<EightQueen> getSolution(EnumSet<EightQueen> board ){
		if (board.size()==8){
			if (isSolution(board))
				return board;
			else  //Already been put 8 component but not a solution anymore!
				return EnumSet.noneOf(EightQueen.class);
		}
		
		EnumSet<EightQueen> remain = EnumSet.allOf(EightQueen.class);
		for (EightQueen q : board) {
			//Remove same ROW and COLUMN from every q.
			for (int r=0; r<8; r++)
				remain.remove(EightQueen.values()[r*8+q.col]);
			for (int c=0; c<8; c++)
				remain.remove(EightQueen.values()[q.row*8+c]);
			//Remove positive and negative Diagonal from every q.
			for (int r=q.row, c=q.col; r<8 && c<8; r++, c++)
				remain.remove(EightQueen.values()[r*8+c]);
			for (int r=q.row, c=q.col; r>=0 && c>=0; r--, c--)
				remain.remove(EightQueen.values()[r*8+c]);
			for (int r=q.row, c=q.col; r<8 && c>=0; r++, c--)
				remain.remove(EightQueen.values()[r*8+c]);
			for (int r=q.row, c=q.col; r>=0 && c<8; r--, c++)
				remain.remove(EightQueen.values()[r*8+c]);
		}
		
		//Nothing remaining can be found!
		if (remain.isEmpty())
			return EnumSet.noneOf(EightQueen.class);
		else { //Remaining can be found!
			for (EightQueen q : remain) {
				EnumSet<EightQueen> target = board.clone();
				target.add(q);
				EnumSet<EightQueen> solution = getSolution(target);
				if (!solution.isEmpty())
					return solution;
			}
		}
		return EnumSet.noneOf(EightQueen.class);
	}
	
	////////////////////////////////////////////////////////////
	////// Add any additional methods/fields  from here      ///
	///////////////////////////////////////////////////////////
	
	
			
	}
	
	
	
	/**
	 * 
	 * @author chencc
	 *
	 */
	
	public enum Sudoku {
		
		 C11, C12, C13, C14, C15, C16, C17, C18, C19,
		 C21, C22, C23, C24, C25, C26, C27, C28, C29,		
		 C31, C32, C33, C34, C35, C36, C37, C38, C39,
		 C41, C42, C43, C44, C45, C46, C47, C48, C49,
		 C51, C52, C53, C54, C55, C56, C57, C58, C59,
		 C61, C62, C63, C64, C65, C66, C67, C68, C69,
		 C71, C72, C73, C74, C75, C76, C77, C78, C79,
		 C81, C82, C83, C84, C85, C86, C87, C88, C89,
		 C91, C92, C93, C94, C95, C96, C97, C98, C99,;
	
	 //Every Cell is indexed by its row and column value.  
	 int row, col ;	
	 
	 
	 static { // use static initializer to fill in (row, col) of every literal CXX.
		
		 Sudoku[] allSudoku = Sudoku.values() ;
			int k = 0 ;
		   	for(int r =0; r < 9; r++ ){
		   		for(int c = 0; c < 9; c++){
		   	      allSudoku[k].row = r;
		   	      allSudoku[k].col = c;
		   	      k++ ;
		   		}
		   	}
	 }
	 
	 
	 public enum SValue {
		 //Index value from 0 to 8.
		 S1,S2,S3,S4,S5,S6,S7,S8,S9 ;
	 }
		
		
	/** Given board configuration, determine if it is a solution of the soduku problem.
	 *  @param board  a set of positions
	 *  @return true if it is a solution of 8 the Sudoku problem.
	 */
	 
	public static boolean isSudokuSolution(EnumMap<Sudoku, SValue> board ){
		if (board.size() != 81){
			System.out.println("The board's size is not match to 81 (9*9).");
			return false;
		}

		//Check row1, row2, ..., row9
		for (int r=0; r<9; r++) {
			EnumSet<SValue> v = EnumSet.noneOf(SValue.class);
			for (int c=0; c<9; c++) {
				v.add(board.get(Sudoku.values()[r*9+c]));
			}
			if (!v.equals(EnumSet.allOf(SValue.class))){
				System.out.println("There are conflicts in n ROWs.");
				return false;
			}
		}
		//Check column1, column2, ..., column9
		for (int c=0; c<9; c++) {
			EnumSet<SValue> v = EnumSet.noneOf(SValue.class);
			for (int r=0; r<9; r++) {
				v.add(board.get(Sudoku.values()[r*9+c]));
			}
			if (!v.equals(EnumSet.allOf(SValue.class))){
				System.out.println("There are conflicts in n COLUMNs.");
				return false;
			}
		}
		//Check square1, square2, ..., square9
		for (int r=0; r<9; r+=3) {
			for (int c=0; c<9; c+=3) {
				EnumSet<SValue> v = EnumSet.noneOf(SValue.class);
				for (int rCount=r; rCount<r+3; rCount++) {
					for (int cCount=c; cCount<c+3; cCount++) {
						v.add(board.get(Sudoku.values()[rCount*9+cCount]));
					}
				}
				if (!v.equals(EnumSet.allOf(SValue.class))){
					System.out.println("There are conflicts in n SQUAREs.");
					return false;
				}
			}
		}
		
		return true;
	}
			
	
	
	
	
	/** Given a set of cell contents, determine if we can get a solution of the Soudoku problem by adding additional cell contents
	 *  to the input board. Return any such extension of the input board if it is possible and return an empty set if
	 *  there is no such solution.  
	 *  @param  board  a set of cell contents. 
	 *  @return a solution board which is an extension of the inpout board, or EnumMap.none() 
	 *          if there is no solution.
	 */
	 
	public static EnumMap<Sudoku, SValue> getSolution(EnumMap<Sudoku, SValue> board ){
		if (board.size() == 81) {
			if (isSudokuSolution(board))
				return board;
			else
				return new EnumMap<Sudoku, SValue>(Sudoku.class);
		}
		
		EnumSet<Sudoku> remain = EnumSet.allOf(Sudoku.class);
		remain.removeAll(board.keySet());
		Sudoku s = remain.iterator().next();
		outerloop:
		for (SValue v : SValue.values()) {
			//Check certain ROW in every COLUMN.
			for (int c=0; c<9; c++) {
				if (v == board.get(Sudoku.values()[s.row*9+c]))
					continue outerloop;
			}
			//Check certain COLUMN in every ROW. If getting the unique value, you can go through next check point.
			for (int r=0; r<9; r++) {
				if (v == board.get(Sudoku.values()[r*9+s.col]))
					continue outerloop;
			}
			//Check certain SUQARE.
			for (int r=s.row/3*3; r<s.row/3*3+3; r++) {
				for (int c=s.col/3*3; c<s.col/3*3+3; c++) {
					if (v == board.get(Sudoku.values()[r*9+c]))
						continue outerloop;
				}
			}
			
			EnumMap<Sudoku, SValue> target = board.clone();
			target.put(s, v); //s is the assignment of remain.iterator().next().
			EnumMap<Sudoku, SValue> solution = getSolution(target);
			if (solution.isEmpty())
				continue;
			else
				return solution;
		}
		
		return new EnumMap<Sudoku, SValue>(Sudoku.class);  // an empty map	
	}
	
	 /** Given a set of board positions, return a string displaying
	  *  the layout and content of the board.
	  */
	 public static String displaySBoard(EnumMap<Sudoku, SValue> board) {
		 String str = "";
			for (int r=0; r<9; r++) {
				str += "-------------------\n";
				for (int c=0; c<9; c++) {
					SValue v = board.get(Sudoku.values()[r*9+c]);
					if (v!=null)
						str += "|" + (v.ordinal()+1);
					else
						str += "|.";
				}
				str += "|\n";
			}
			str += "-------------------\n";
	
			return str;
//		 return 
//		 "-------------------\n" +
//		 "|3|2|1|7|8|6|4|5|9|\n" +
//		 "-------------------\n" +
//		 "|2|7|8|1|3|4|.|.|.|\n" +
//		 "...              \n"  ;
		  }
	
	////////////////////////////////////////////////////////////
	////// Add any additional methods/fields  from here      ///
	///////////////////////////////////////////////////////////
	
	}
	

}