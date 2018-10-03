import static org.junit.Assert.*;

import org.junit.Test;

import Piece.*;
import Game.*;
public class GameTest {

	@Test
	public void test() {
		Game game = new Game(10);
		boolean check = game.side1[1].canMoveHere(game.board, new Position(1,1));
		assertEquals(true,check);
		
	}

}
