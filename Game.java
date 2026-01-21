import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayer;

    public Game() {
        board = new Board();
        players = new Player[2];
        currentPlayer = 0;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎮 Welcome to Tic Tac Toe!");

        
        System.out.print("Enter name of Player 1 (X): ");
        String name1 = sc.nextLine();

        System.out.print("Enter name of Player 2 (O): ");
        String name2 = sc.nextLine();

        players[0] = new Player(name1, 'X');
        players[1] = new Player(name2, 'O');

        System.out.println("\nEnter row and column (0-2)\n");

        while (true) {
            board.display();
            Player player = players[currentPlayer];

            System.out.println(player.getName() + "'s turn (" + player.getSymbol() + ")");

            int[] move = InputHandler.getMove(sc, board);
            board.placeSymbol(move[0], move[1], player.getSymbol());

            if (GameStatus.checkWin(board, player.getSymbol())) {
                board.display();
                System.out.println("🎉 " + player.getName() + " wins!");
                break;
            }

            if (GameStatus.isDraw(board)) {
                board.display();
                System.out.println("🤝 Game is a draw!");
                break;
            }

            currentPlayer = (currentPlayer + 1) % 2;
        }

        sc.close();
    }
}
