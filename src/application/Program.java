package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import boardgame.Board;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
			
				UI.clearScreen();
				UI.printMatch(chessmatch);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessposition(sc);
				
				boolean[][] possibleMoves = chessmatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessmatch.getPiece(), possibleMoves);
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessposition(sc);
				
				ChessPiece capturedPiece = chessmatch.performChessMove(source , target );
				
			
		}
			catch(ChessException e) {
				
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		
            catch(InputMismatchException e) {
				
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
	}
	

}
