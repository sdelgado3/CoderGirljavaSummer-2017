
import java.util.Scanner;

public class Tictactoe4 {

    static char[][] board;
    static char currentPlayer;
    static Scanner keyboard = new Scanner(System.in);

    public Tictactoe4() {
        board = new char[3][3];
        currentPlayer = 'x';
        initializeBoard();
    }

    public static char getCurrentPlayer()
    {
        return currentPlayer;
    }

    public void initializeBoard() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();

        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }

    public boolean isWinner() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }

    private static boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    public static void changePlayer() {
        if (currentPlayer == 'x') {
            currentPlayer = 'o';
        }
        else {
            currentPlayer = 'x';
        }
    }

    public static boolean placeMark(int row, int col) {

        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayer;
                    return true;
                }
            }
        }

        return false;
    }

    public static void printWelcome()
    {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("To play, enter a number for which box to play in.");
        System.out.println("Column:1,2,3");
        System.out.println("Row:1,2,3");
        System.out.println("You'll need a buddy to play with.  Ready to begin?  Here we go.");

    }

    public static boolean wantsToPlayAgain()
    {
        System.out.print("Would you like to play again?");
        keyboard.nextLine();
        String answer = keyboard.nextLine();
        return (answer.equals("y"));
    }

    public static void getPositionAndPlaceToken()
    {
        boolean invalidInput = true;
        boolean full = true;
        int position=0;
        int row=0;
        int col=0;

        invalidInput = (position < 1 || position > 3);
        full = ((board[row][col] != '-'));

        if (invalidInput) {
            System.out.println("Sorry, position " + position + " is not valid.  Row 1-3 and Columns 1-3.");
        } else {
            if (full) {
                System.out.println("Sorry, position " + position + " is already full.  Pick another.");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Tictactoe4  game = new Tictactoe4();
        game.initializeBoard();
        boolean invalidInput = true;
        int position;
        boolean full = true;

        printWelcome();

        do
        {
            game.printBoard();
            int row;
            int col;

            do
            {

                System.out.println("Player " + game.getCurrentPlayer() + ", enter an empty row and column to place your mark!");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
                getPositionAndPlaceToken();

            }
            while (!game.placeMark(row, col));
            game.changePlayer();
        }
        while(!game.isWinner() && !game.isBoardFull());
        if (game.isBoardFull() && !game.isWinner())
        {
            System.out.println("The game was a tie!");

        } else{

            game.printBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayer()) + " Wins!");
            wantsToPlayAgain();
        }
    }
}

