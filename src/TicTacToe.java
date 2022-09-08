import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int row, column;
		GameBoard game1 = new GameBoard();
		game1.printBoard();
		do {
			System.out.print("Row: ");
			row = scnr.nextInt();
			System.out.print("\n");
			System.out.print("Column: ");
			column = scnr.nextInt();
			System.out.print("\n");
		} while (game1.chooseSpace(row, column, 'x') == false);
		scnr.close();
	}
}
