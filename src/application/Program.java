package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readPosition(entrada);
	
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readPosition(entrada);
			
			ChessPiece capturedPiece = chessMatch.peformChessMove(source, target);
		
		}
	
	}
}
