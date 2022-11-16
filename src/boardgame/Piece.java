package boardgame;

public class Piece {

	//the initial position of a piece is null
	protected Position position;
	private Board board;
		
	public Piece(Board board) {
		this.board = board;
	}
	
	protected Board getBoard() {
		return board;
	}

	public boolean possibleMoves() {
		
	}
	
	public boolean posibleMove(Position position) {
		return true;
	}
	
}
