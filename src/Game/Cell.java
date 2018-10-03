package Game;
import Piece.*;
//When an object of this class is created, it only have position, piece is null. Constructor only set its position

public class Cell {
	private Piece piece;
	private Position position;

	public Cell(Position position) {
		this.position = position;
	}
	
	public Position getPosition(){
		return position;
	}
	
	public boolean isPieceHere(){
		if (piece == null){
			return false;
		}
		else {
			return true;
		}
	}
	
	public Piece getPiece(){
		return piece;
	}
	
	public void setPiece(Piece piece){
		this.piece = piece;
	}
	
	public void display(){
		if (piece == null)
			System.out.print(" ");
		else piece.display();
	}
}
