package Piece;
import Game.*;

public class Bishop extends Piece{

	public Bishop(Cell cell, Boolean isSide1) {
		super(cell, isSide1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMoveHere(Board board, Position position) {
		int desX = position.getX();
		int desY = position.getY();
		int pieceX = cell.getPosition().getX();
		int pieceY = cell.getPosition().getY();
		if (desX>5 || desX <0 || desY>5 || desY<0){
			return false;
		}
		else {
			if (desX == pieceX-1 && desY == pieceY+1){
				return true;
			}
			else if (desX == pieceX+1 && desY == pieceY+1){
				return true;
			}
			else if (desX == pieceX+1 && desY == pieceY-1){
				return true;
			}
			else if (desX == pieceX-1 && desY == pieceY-1){
				return true;
			}
			else if (desX == pieceX-2 && desY == pieceY+2){
				if (board.cells[pieceX-1][pieceY-1].isPieceHere() == true)
					return false;
				else return true;
			}
			else if (desX == pieceX+2 && desY == pieceY+2){
				if (board.cells[pieceX+1][pieceY+1].isPieceHere() == true)
					return false;
				else return true;
			}
			else if (desX == pieceX+2 && desY == pieceY-2){
				if (board.cells[pieceX+1][pieceY-1].isPieceHere() == true)
					return false;
				else return true;
			}
			else if (desX == pieceX-2 && desY == pieceY-2){
				if (board.cells[pieceX-1][pieceY-1].isPieceHere() == true)
					return false;
				else return true;
			}
			else return false;
		}		
	}

	@Override
	public
	void display() {
		if (isSide1 == true)
			System.out.print("B");
		else System.out.print("b");
	}

}
