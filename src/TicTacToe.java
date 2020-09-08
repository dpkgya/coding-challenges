public class TicTacToe {

    public boolean validTicTacToe(String[] board) {
        char[][] gameBoard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            gameBoard[i] = board[i].toCharArray();
        }

        // Get number of X player and O player
        //
        int numOfX = 0;
        int numOfO = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = gameBoard[i][j];

                if (c == 'X') {
                    numOfX++;
                } else if (c == 'O') {
                    numOfO++;
                }
            }
        }

        if (numOfX < numOfO || numOfX - numOfO > 1) {
            return false;
        }

        if (numOfX - numOfO == 1) {
            if (hasWon(gameBoard, 'O')) {
                return false;
            }
        }

        if (numOfX == numOfO) {
            if (hasWon(gameBoard, 'X')) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasWon(char[][] gameBoard, char player) {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == player &&
                    gameBoard[i][1] == gameBoard[i][0] &&
                    gameBoard[i][2] == gameBoard[i][1]) {
                return true;
            }

            if (gameBoard[0][i] == player &&
                    gameBoard[1][i] == gameBoard[0][i] &&
                    gameBoard[2][i] == gameBoard[1][i]) {
                return true;
            }

            if (player == gameBoard[0][0] &&
                    gameBoard[0][0] == gameBoard[1][1] &&
                    gameBoard[1][1] == gameBoard[2][2]) {
                return true;
            }

            if (player == gameBoard[0][2] &&
                    gameBoard[1][1] == gameBoard[0][2] &&
                    gameBoard[1][1] == gameBoard[2][0]) {
                return true;
            }
        }

        return false;
    }

}
