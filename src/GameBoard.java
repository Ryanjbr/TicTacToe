import java.util.Random;

public class GameBoard {
	
	private char gameState[][] = new char[3][3];
	public GameBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gameState[i][j] = ' ';
			}
		}
	}
	
	public void printBoard () {		
		for (int i = 0; i < 3; i++) {
			System.out.println("   |   |");
			System.out.printf(" %c | %c | %c\n", gameState [i][0], gameState [i][1], gameState [i][2]);
			if (i < 2) {
				System.out.println("___|___|___");
			}
		}
	}
	
	private void computerSelection () {
		Random rand = new Random();
		boolean taken = true;
		while (taken = true) {
			int row = rand.nextInt(3);
			int column = rand.nextInt(3);
			if (gameState[row][column] == ' ') {
				gameState [row][column] = 'o';
				taken = false;
				break;
			}
		}

	}
	
	private boolean checkForWin () {
		for (int i = 0; i < 3; i++) {
			if (gameState[i][0] == gameState[i][1] && gameState[i][1] == gameState[i][2]) {
				if (gameState[i][0] == 'x') {
					System.out.println("You win the game!");
				}

			}
			if (gameState[0][i] == gameState[1][i] && gameState[1][i] == gameState[2][i]) {
				if (gameState[0][i] == 'x') {
					System.out.println("You win the game!");
				}
			}
		}
	}
	
	public boolean chooseSpace(int row, int column, char side) {
		row -= 1;
		column -= 1;
		if (gameState[row][column] == ' ') {
			gameState[row][column] = side;
			computerSelection();
			printBoard();
			return true;
		}
		else {
			return false;
		}

	}
}
