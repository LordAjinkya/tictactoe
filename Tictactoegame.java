
package tictactoe;
import java.util.Scanner;


public class Tictactoegame {
	
	char playerchance;
	char computerchance;
	char board[] = new char[10];
	Scanner scan = new Scanner(System.in);
	//create board
	public static char[] game() {
		for (int i = 1; i < board.length; i++) {
			board[i]=' ';
		}
		return board;
		
		
	}
	//display board
	static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2]  + " |");
               
                           
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5]  + " |");
               
                           
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8]  + " |");
               
                           
        System.out.println("|---|---|---|");
    }
	
	//To check if the player is free to move
	public boolean Position(int location) {
		if (board[location] == 'X' || board[location] == 'O') { 
			System.out.println("choose other position");
			return true;
		} else {
			return false;
		}
	}
		
	     
	    
	    	
	    	
}


