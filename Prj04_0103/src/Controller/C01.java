package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Piatto;
import Model.Utente;
import View.IO;
import View.Menu;

/*andiamo a creare un sistema di inserimento che permetta di ordinare x tipi di piatto a tua scelta (minimo 3) e che sia divisa nel seguente modo:
	1) Vuoi ordinare?	#
	2) Vuoi uscire?	end programma e stampa il prezzo finale

	#
	1) Ordina (prezzo e nome) 				    -> 
	2) Visualizza (nome ed ingredienti)			-> Visionare tutti i piatti 
	3) esci (ci riporta alla condizione iniziale)
*/	

public class C01 {

	public static void main(String[] args) {
		Scanner scannerI = new Scanner(System.in);
		Scanner scannerS = new Scanner(System.in);
		
		Piatto piatto = new Piatto();
		Utente utente = new Utente();
		ArrayList<Piatto> listaPiatti = new ArrayList<Piatto>();
		ArrayList<Piatto> piattiSelezionati = new ArrayList<Piatto>();
		ArrayList<Utente> utenti = new ArrayList<Utente>();
		
		utente.creaUtenti(utenti);
		piatto.riempiLista(listaPiatti);
		int scelta0, scelta1, scelta2, scelta3;
		int sceltaUtente;
		boolean verifica0 = false;
		boolean verifica1 = false;
		boolean verifica2 = false;
		boolean verificaUtente = false;
		
		do {
			Menu.menuPrimaFase();
			sceltaUtente = scannerI.nextInt();
			if(sceltaUtente == 3) {
				verificaUtente = true;
			}
			
			switch(sceltaUtente) {
				case 1:
					//inserimento dell'utente tramite il metodo registraUtente
					Utente u = IO.registraUtente();
					boolean utenteGiaPresente = false;
					//controllo che i nomi utente siano univoci
					for(int i = 0; i<utenti.size(); i++) {
						if((utenti.get(i).getUser().equals(u.getUser()))) {
							utenteGiaPresente = true;
						}
					}
					if(utenteGiaPresente == false) {
						utenti.add(u);
						IO.successo();
					}else {
						System.out.println("Nome utente già esistente!");
					}
				break;
				
				case 2:
					//utilizzo lo stesso metodo di prima per un altro scopo
					Utente ut = IO.registraUtente();
		
					for(int i = 0; i < utenti.size(); i++) {	
						//controllo che l'utente loggato sia presente negli utenti registrati
						if(utenti.get(i).getUser().equals(ut.getUser())) {
							if(utenti.get(i).getPassword().equals(ut.getPassword())){
								if(utenti.get(i).getUtenza().equals(ut.getUtenza())){
									//una volta verificato che l'utente è registrato controllo che sia un user o un admin
									if(utenti.get(i).getUtenza().equals("user")) {
										do {
											Menu.menuSecondaFase();
											scelta0 = scannerI.nextInt();
											IO.spazio();
											if(scelta0 == 2) {
												verifica0 = true;
											}
											
											switch(scelta0) {
												case 1:
													do {
														Menu.menuTerzaFase();
														scelta1 = scannerI.nextInt();
														IO.spazio();
														if(scelta1 == 3) {
															verifica1 = true;
														}
														switch(scelta1) {
															case 1:
																System.out.println("I piatti disponibili sono: ");
																
																for(int t = 0; t < listaPiatti.size(); t++) {
																	System.out.println(t + ")" + " " + listaPiatti.get(t));
																	}
																System.out.print("\nScegli il numero corrispondente alla tua scelta: ");
																scelta2 = scannerI.nextInt();
																IO.spazio();
																
																piattiSelezionati.add(listaPiatti.get(scelta2));
																IO.successo();
															break;
															
															case 2:
																System.out.println("Il menù è: ");
																System.out.println(listaPiatti);
																IO.spazio();
															break;
														}
													}while(scelta1<=3 && verifica1 == false);
												break;
											}
										}while(scelta0<=2 && verifica0 == false);
										//prendere il prezzo di ogni oggetto presente nella lista piattiSelezionati
										if(piattiSelezionati.size()>0) {
											int prezzoTotale = 0;
											for(int j = 0; j<piattiSelezionati.size(); j++) {
												prezzoTotale += piattiSelezionati.get(j).getPrezzo();
											}
											System.out.println("Il conto è: " + prezzoTotale + "€");
											System.out.println("\nAlla prossima");
										}else {
											System.out.println("\nLa prossima mangia qualcosa!");
										}
									}else if(utenti.get(i).getUtenza().equals("admin")){
										do {
											Menu.menuQuartaFase();
											scelta3 = scannerI.nextInt();
											IO.spazio();
											if(scelta3 == 2) {
												verifica2 = true;
											}
											switch(scelta3) {
												case 1:
													System.out.println("Il Menù attuale è: ");
													System.out.println(listaPiatti);
													listaPiatti.add(IO.registraPiatto());
													IO.successo();
												break;
											}
										}while(scelta3<=2 && verifica2 == false);
									}
								}
							}
						}
					}
				break;
			}
		}while(sceltaUtente<=3 && verificaUtente == false);
		System.out.println("\nAlla prossima!");
	}
}
