/**
 * Created by Rustam Borzov on 5/23/2017.
 */
import java.util.Scanner;

public class TicTacToe{



    private char[][] board;
    private char player; // 'X' or 'O'

    /*
     * Instantiate board to be a 3 by 3 char array of spaces.
     * Set player to be 'X'.
     */
    public TicTacToe() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
        player = 'X';
    }

    /*
     * If s represents a valid move, add the current player's symbol to the board and return true.
     * Otherwise return false.
     */
    public boolean play(String s) {
        if (s.length() != 2){
            return false;
        } else {
            if ((s.charAt(0) == 'A' || s.charAt(0) == 'a') && s.charAt(1) == '1') {
                if (board[0][0] == ' ') {
                    board[0][0] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'A' || s.charAt(0) == 'a') && s.charAt(1) == '2') {
                if (board[0][1] == ' ') {
                    board[0][1] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'A' || s.charAt(0) == 'a') && s.charAt(1) == '3') {
                if (board[0][2] == ' ') {
                    board[0][2] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'B' || s.charAt(0) == 'b') && s.charAt(1) == '1') {
                if (board[1][0] == ' ') {
                    board[1][0] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'B' || s.charAt(0) == 'b') && s.charAt(1) == '2') {
                if (board[1][1] == ' ') {
                    board[1][1] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'B' || s.charAt(0) == 'b') && s.charAt(1) == '3') {
                if (board[1][2] == ' ') {
                    board[1][2] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'C' || s.charAt(0) == 'c') && s.charAt(1) == '1') {
                if (board[2][0] == ' ') {
                    board[2][0] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'C' || s.charAt(0) == 'c') && s.charAt(1) == '2') {
                if (board[2][1] == ' ') {
                    board[2][1] = player;
                    return true;
                } else return false;
            } else if ((s.charAt(0) == 'C' || s.charAt(0) == 'c') && s.charAt(1) == '3') {
                if (board[2][2] == ' ') {
                    board[2][2] = player;
                    return true;
                } else return false;
            } else {
                return false;
            }
        }
    }

    /*
     * Switches the current player from X to O, or O to X.
     */
    public void switchTurn() {
        if (player == 'X') player = 'O';
        else player = 'X';
    }

    /*
     * Returns true if the current player has won the game.
     * Three in a row, column or either diagonal.
     * Otherwise, return false.
     */
    public boolean won() {
		if ((board[1][1] != ' ') && (((board[1][1] == board[0][1]) && (board[1][1] == board [2][1])) || //check middle column
                ((board[1][1] == board[1][0]) && (board[1][1] == board [1][2])) || //check middle row
                ((board[1][1] == board[0][0]) && (board[1][1] == board [2][2])) || //check diagonal
                ((board[1][1] == board[0][2]) && (board[1][1] == board [2][0])))) //check diagonal
        {
            return true;
        } else if ((board[0][1] != ' ') && (((board[0][1] == board[0][0]) && (board[0][1] == board [0][2])))) //check upper row
        {
            return true;
        } else if ((board[2][1] != ' ') && (((board[2][1] == board[2][0]) && (board[2][1] == board [2][2])))) //check bottom row
        {
            return true;
        } else if ((board[1][0] != ' ') && (((board[1][0] == board[0][0]) && (board[1][0] == board [2][0])))) //check left column
        {
            return true;
        } else if ((board[1][2] != ' ') && (((board[1][2] == board[0][2]) && (board[1][2] == board [2][2])))) //check right column
        {
            return true;
        } else
        {
            return false; // TODO: replace with your own return statement.
        }
    } // I would divide this method. It is too complex

    /*
     * Returns true if there are no places left to move
     */
    public boolean stalemate() {
	    /*
		 * Step 4: Fill in the code for the stalemate method. It
         * should return true if there are no more places to move
		 * on the board. Otherwise, return false return false;
		 */
	    boolean draw = true;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == ' ') draw = false;
            }
        }
        return draw;   // replace with your own return
    }
    public char getPlayer() {
        return player;
    }
    public void print() {
        System.out.println();
        System.out.println("\t  1 2 3");
        System.out.println();
        System.out.println("\tA "+board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
        System.out.println("\t  -----");
        System.out.println("\tB "+board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
        System.out.println("\t  "+"-----");
        System.out.println("\tC "+board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
        System.out.println();
    }

	/*
	 * Step 6: Main Method for Final Step - Delete your main method
	 * and uncomment this one.
	 * Runs the game by getting input from the user, making the
	 * appropriate moves, and prints who won or if it was a stalemate.
	*/

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		System.out.println("Welcome to tic-tac-toe");
		System.out.println("Enter coordinates for your move following the X and O prompts");

		while(!game.stalemate()) {
			game.print();//Print the game


            String turn = in.nextLine();//Prompt player for their move


			while (!game.play(turn)) {
                System.out.println("Invalid coordinates! Try again!");
                turn = in.nextLine();
            }
            //Loop while the method play does not return true when given their move.
			//Body of loop should ask for a different move

			if (game.won()){
			    break;//If the game is won, call break;
            }


			game.switchTurn();//Switch the turn

		}
		game.print();
		if(game.won()){
			System.out.println("Player "+game.getPlayer()+" Wins!!!!");
		} else {
			System.out.println("Stalemate");
		}
	}

}