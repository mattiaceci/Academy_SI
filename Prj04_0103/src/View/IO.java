package View;

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
		System.out.print("Scegli la tua utenza (admin/user): ");
		String utenza = scannerS.nextLine();
		System.out.println("\n");
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
