import java.util.Scanner;

public class InputHandler {

    public static int[] getMove(Scanner sc, Board board) {
        int row, col;

        while (true) {
            System.out.print("Enter row: ");
            row = sc.nextInt();
            System.out.print("Enter column: ");
            col = sc.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                if (board.isEmpty(row, col)) {
                    return new int[]{row, col};
                } else {
                    System.out.println("Cell already occupied. Try again.");
                }
            } else {
                System.out.println("Invalid input. Row & column must be between 0 and 2.");
            }
        }
    }
}
