import java.util.Scanner;

public class Main {
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        char currPlayer = 'O';
        boolean Won = false;

        printBoard();

        for (int i = 0; i < 9; i++) {
            System.out.print("Player " + (currPlayer == 'O' ? "1" : "2") + " move : ");
            int x, y;

            while (true) {
                x = input.nextInt();
                y = input.nextInt();

                if (x >= 0 && x < 3 && y >= 0 && y < 3 && board [y][x] == '-') {
                    board[y][x] = currPlayer;
                    break;
                } else {
                    System.out.println("Invalid Move");
                }
            }

            printBoard();

            if (checkWin(currPlayer)) {
                System.out.println("Player " + (currPlayer == 'O' ? "1" : "2") + " Win!!");
                Won = true;
                break;
            }

            currPlayer = (currPlayer == 'O') ? 'X' : 'O';
        }

        if (!Won) {
            System.out.println("Draw!!");
        }

        input.close();
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkWin (char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player || board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return  true;
            }

            if (board[0][0] == player && board[1][1] == player && board[2][2] == player || board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return  true;
            }
        }
        return false;
    }
}