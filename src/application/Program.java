package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
		try {	
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readPosition(entrada);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readPosition(entrada);
				
				ChessPiece capturedPiece = chessMatch.peformChessMove(source, target);
			}
		catch (ChessException e) {
			System.out.println(e.getMessage());
			entrada.nextLine();
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			entrada.nextLine();
		}
		}
	
	}
}
