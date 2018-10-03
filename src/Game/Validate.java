package Game;
public class Validate {
	
	int isPositiveInt(String input){
		int number;
		if (tryParseInt(input) == true){
			number = Integer.parseInt(input);
			if (number < 0) number =-1;
		}
		else number = -1;
		return number;
	}
	
	boolean tryParseInt(String string){
		try{
			Integer.parseInt(string);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
	
	boolean isString(int maxLength,String string){
		if (string.length() <= maxLength ){
			return true;
		}
		else return false;
	}
	
	boolean isPosition(Position position){
		if(position.getX()>6 || position.getX()<0 || position.getY()>6 || position.getY()<0){
			return false;
		}
		else return true;
	}
	
//	boolean isInGame(Player player){
//		int piecesInGame = 6;
//		for (int x = 0; x < player.pieces.length; x++){
//			if (player.pieces[x].inGame == false )
//				piecesInGame--;
//		}
//		if(piecesInGame == 0) return false;
//		else return true;
//	}
}
