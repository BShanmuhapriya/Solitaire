package entities;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class View {

	public void displayWelcome() {
		System.out.println("Welcome to Patience!");
		System.out.println("Commands:");
		System.out.println("D = Draw a card from the deck");
		System.out.println("P1-7 = Move card(s) from pile to a lane");
		System.out.println("D1-7 = Move card(s) from pile to a suit");
		System.out.println("1-7D = Move card(s) from a lane to a lane");
		System.out.println("D1-7HCS = Move card(s) from a suit to a lane");
		System.out.println("Q = Quit the game");
	}

	public void displayScore(Score score) {
		System.out.println("Score: " + score.getScore());
		System.out.println("Number of turns: " + score.getNumberOfTurns());
	}

	public void displayBoard(Tableau game) {
		System.out.println("Deck: " + (game.getDeck().isEmpty() ? "Empty" : "Not Empty"));
		System.out.println("Pile: " + (game.getPile().isEmpty() ? "Empty" : "Not Empty"));

		int i;
		Stack lane;
		for(i = 0; i < Tableau.NUM_SUITS; ++i) {
			System.out.print("Suit " + (i + 1) + ": ");
			lane = game.getSuit(i);
			if (lane.isEmpty()) {
				System.out.println("Empty");
			} else {
				System.out.println(((Card)lane.peek()).toString());
			}
		}

		for(i = 0; i < 7; ++i) {
			System.out.print("Lane " + (i + 1) + ": ");
			lane = game.getLane(i);
			Iterator var5 = lane.iterator();

			while(var5.hasNext()) {
				Card card = (Card)var5.next();
				System.out.print(card.toString() + " ");
			}

			System.out.println();
		}

	}

	public void displayCommandNotPossible() {
		System.out.println("Command not possible. Please try again.");
	}

	public void displayGameOver() {
		System.out.println("Congratulations! You've won the game!");
	}

	public void displayQuit() {
		System.out.println("You quit the game. Better luck next time!");
	}

	public Command getUserInput() {
		Scanner scanner = new Scanner(System.in);

		String input;
		do {
			System.out.print("Enter a command: ");
			input = scanner.nextLine().trim();
			if (!Command.isValid(input)) {
				System.out.println("Invalid command. Please try again.");
			}
		} while(!Command.isValid(input));

		return new Command(input);
	}
}
