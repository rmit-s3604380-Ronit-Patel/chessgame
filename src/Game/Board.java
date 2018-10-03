package Game;

public class Board {
	public Cell[][] cells;
	
	public Cell[][] getBoard() {
		return cells;
	}

	public Board(){
		//Instantiate cells
		cells = new Cell[6][6];
		for (int x=0; x < 6; x++){
			for (int y=0; y < 6; y++){
				cells[x][y] = new Cell(new Position(x,y));
			}
		}
	}
	
	public Cell getCell(Position position){
		return cells[position.getX()][position.getY()];
	}
	
	public void display(){
		System.out.print("| |0|1|2|3|4|5|");
		for (int x = 0; x < 6; x++){
			System.out.println();
			System.out.print("|"+x+"|");
			for (int y =0; y < 6; y++){
				cells[x][y].display();
				System.out.print("|");
			}
		}
		System.out.println();
	}
}
