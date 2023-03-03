package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Piatto;
import Model.Utente;

public class IO {
	static Scanner scannerS = new Scanner(System.in);
	static Scanner scannerD = new Scanner(System.in);
	
	public static Utente registraUtente() {
		System.out.print("\nInserisci il tuo Username: ");
		String user = scannerS.nextLine();
		System.out.println("\n");
		System.out.print("Inserisci la tua Password: ");
		String pwd = scannerS.nextLine();
		System.out.println("\n");
		String utenza = "user";
		/*
		 * l'utente può registrarsi solo come utilizzatore (user) dell'app,
		 * sarà poi l'amministratore di sistema in una visione più ampia del "progetto" 
		 * a "decidere" se quell'utente avrà le credenziali da admin.
		*/
		Utente u = new Utente(user, pwd, utenza);
		return u;
	}

	public static Piatto registraPiatto() {
		System.out.print("\nInserisci nome piatto: ");
		String nomePiatto = scannerS.nextLine();
		System.out.println("\n");
		System.out.print("Inserisci ingredienti: ");
		String ingredienti = scannerS.nextLine();
		System.out.println("\n");
		System.out.print("Inserisci prezzo: ");
		double prezzo = scannerD.nextDouble();	//la prossima volta crea comunque una string e convertila dopo per sicurezza
		System.out.println("\n");
		Piatto p = new Piatto(nomePiatto, ingredienti, prezzo);
		return p;
	}
	
	public static void successo() {
		System.out.println("Operazione avvenuta con successo!");
	}
	
	public static void spazio() {
		System.out.println("\n");
	}
	
	public static void menuAttuale() {
		System.out.println("Menù attuale:");
	}
}
