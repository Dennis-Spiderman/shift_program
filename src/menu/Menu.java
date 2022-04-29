package menu;

import java.util.Scanner;

import model.TurnsData;

public class Menu {

	private static Scanner in = new Scanner(System.in);
	
	public static void startProgram() {
		mainMenu();
	}
	
	public static void mainMenu() {
		System.out.println("\n-----  Menú  -----"
				+ "\n¿Cual va a ser su opción?"
				+ "\n1) Ver turno actual."
				+ "\n2) Dar turno."
				+ "\n3) Pasar de turno."
				+ "\n4) Mostrar todos los turnos."
				+ "\n5) Eliminar turno actual."
				+ "\n0) Salir.");
		
		int selection = in.nextInt();
		
		switch (selection) {
		case 1:
			showTurn();
			break;
			
		case 2:
			giveTurn();
			break;
			
		case 3:
			nextTurn();
			break;
		
		case 4:
			seeAllTurns();
			mainMenu();	
			break;
			
		case 5:
			deleteActualTurn();
			break;
			
		case 0:
			exit();
			break;
			
		default:
			System.out.println("\nSu opción fue invalida, intente de nuevo.");
			mainMenu();
			break;
		}
	}
	
	public static void showTurn() {

		System.out.println("El turno actual es: " +TurnsData.showActual());

		mainMenu();
	}
	
	public static void giveTurn() {
		
		if(TurnsData.addTurn()) {
			
			System.out.println("\nTurno dado exitosamente.");
			
		} else {
			
			System.out.println("\nNo hay ningún turno disponible para dar.");
		}
		
		mainMenu();
	}
	
	public static void nextTurn() {
		
		if(TurnsData.nextTurn()) {
			
			System.out.println("\nTurno pasado exitosamente.");
			
		} else {
			
			System.out.println("\nNo hay ningún turno disponible para dar.");
		}
		
		mainMenu();
	}
	
	public static void seeAllTurns() {

		TurnsData.printTurns();

		mainMenu();
	}
	
	public static void deleteActualTurn() {
		
		if(TurnsData.deleteActual()) {
			
			System.out.println("\nTurno eliminado exitosamente.");
			
		} else {
			
			System.out.println("\nNo hay ningún turno disponible para dar.");
		}
		
		mainMenu();
	}
	
	public static void exit() {
		
		System.out.println("\nHasta luego!");
		System.exit(0);
		
	}
}
