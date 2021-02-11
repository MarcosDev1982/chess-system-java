package application;



import java.util.Scanner;



import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			UI.printBoard(chessmatch.getPiece());
			System.out.println();
			System.out.print("Source");
			ChessPosition source = UI.readChessposition(sc);
			
			System.out.println();
			System.out.print("Target");
			ChessPosition target = UI.readChessposition(sc);
			
			ChessPiece capturedPiece = chessmatch.performChessMove(source , target );
		}
		
		
	    
		
	}
	

}
