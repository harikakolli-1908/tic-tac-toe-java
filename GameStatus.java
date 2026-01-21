public class GameStatus {

    public static boolean checkWin(Board board, char symbol) {
        char[][] g = board.getGrid();

        for (int i = 0; i < 3; i++) {
            if (g[i][0] == symbol && g[i][1] == symbol && g[i][2] == symbol) return true;
            if (g[0][i] == symbol && g[1][i] == symbol && g[2][i] == symbol) return true;
        }

        return (g[0][0] == symbol && g[1][1] == symbol && g[2][2] == symbol) ||
               (g[0][2] == symbol && g[1][1] == symbol && g[2][0] == symbol);
    }

    public static boolean isDraw(Board board) {
        char[][] g = board.getGrid();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (g[i][j] == ' ')
                    return false;
        return true;
    }
}
