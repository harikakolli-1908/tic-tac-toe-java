public class Board {
    private char[][] grid;

    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                grid[i][j] = ' ';
    }

    public void display() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public boolean isEmpty(int row, int col) {
        return grid[row][col] == ' ';
    }

    public void placeSymbol(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }

    public char[][] getGrid() {
        return grid;
    }
}
