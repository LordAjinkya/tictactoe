
package tictactoe;
import java.util.Scanner;
import java.util.Random;


public class Tictactoegame {
	
	char playerchance;
	char computerchance;
	private static char board[] = new char[10];
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
	
	public void letterchoosing() {
		Scanner scan = new Scanner(System.in);
		char player = scan.next().charAt(0); // getting input from player

		if (player == 'X') {
			System.out.println("HumanPlayer symbol : 'X' ");
			System.out.println("ComputerPlayer symbol: 'O' ");
		} else {
			System.out.println("HumanPlayer symbol : 'O' ");
			System.out.println("ComputerPlayer symbol: 'X' ");
		}
	}
	
	//Toss to check which player plays first
	public void Toss() {
	      Random r = new Random();
	      int chance = r.nextInt(2);
	      if (chance == 1) {
	         System.out.println("Player is playing");
	      } else {
	         System.out.println("Computer is playing");
	      }
	   }
	
	//main method
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe game");
		Tictactoegame boardgame = new Tictactoegame();
		boardgame.game(); 
		boardgame.printBoard(); 
		boardgame.Position(0);
		boardgame.letterchoosing();
		boardgame.Toss();
	}
		
		
			    		
}


