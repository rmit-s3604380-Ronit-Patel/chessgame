package Piece;

import static org.junit.Assert.*;

import org.junit.Test;

import Game.Game;
import Game.Position;

public class RookTest {

	@Test
	public void test() {
		Game game = new Game(10);
		boolean checkTrue = game.side1[0].canMoveHere(game.board, new Position(2,0));
		boolean checkFalse = game.side1[0].canMoveHere(game.board, new Position(9,9));
		assertEquals(true,checkTrue);
		assertEquals(false,checkFalse);
	}

}
