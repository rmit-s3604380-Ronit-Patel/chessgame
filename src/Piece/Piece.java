package Piece;
import Game.Board;
import Game.Cell;
import Game.Position;

public abstract class Piece {
	Cell cell;
	Boolean status;
	Boolean isSide1;

	public Boolean isInGame() {
		return status;
	}

	public Boolean getIsSide1() {
		return isSide1;
	}

	public Piece(Cell cell, Boolean isSide1) {
		this.status = true;
		this.cell = cell;
		this.isSide1 = isSide1;
		cell.setPiece(this);
	}
	
	public boolean getStatus(){
		return status;
	}
	
	public void setStatus(boolean a){
		status = a;
	}
	
	public Cell getCell(){
		return cell;
	}
	
	public void moveTo(Cell cell){
		this.cell.setPiece(null);
		this.cell = cell;
	}
	
	//Find the path to position destination, if there is any piece in path (include destination
	//return false
	public abstract boolean canMoveHere(Board board, Position position);
	
	public abstract void display();
}
