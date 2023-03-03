package Controller;

public class C01 {

	public static void main(String[] args) {
		/*
		Scrivere la definizione di un metodo in Java chiamato "somma" che prende due interi come argomenti e 
		restituisce la loro somma.
		Scrivere il codice per chiamare il metodo "somma" definito nella domanda 1, passando i valori 5 e 7 
		come argomenti e stampando il risultato.
		
		Scrivere la definizione di un metodo in Java chiamato "media" che prende un array di numeri interi 
		come argomento e restituisce la loro media come un valore double.
		
		Scrivere il codice per chiamare il metodo "media" definito nella domanda 3, passando 
		l'array {2, 4, 6, 8, 10} come argomento e stampando il risultato.
		
		Scrivere la definizione di un metodo in Java chiamato "inverti" che prende una stringa come argomento 
		e restituisce la stringa invertita.
		
		Scrivere il codice per chiamare il metodo "inverti" definito nella domanda 5, passando la 
		stringa "ciao" come argomento e stampando il risultato.
		*/
		somma(5, 7);
		
		int[] array = {1,2,3,4,5,6}; 
		System.out.println("La media è: " + media(array));
		
		int[] array2 = {2, 4, 6, 8, 10};
		media2(array2);
		
		System.out.println(inverti("ciao"));
		System.out.println(inverti("c"));
		
		
	}
	//esercizio 1
	public static void somma(int n1 , int n2) {	//creazione di un metodo pubblico (accessibile da tutti) somma 
		int somma = n1 + n2; //operazione di somma
		System.out.println("La somma tra " + n1 + " e " + n2 + " è: " + somma); //output dei valori sommati e della somma
		//modalità scelta in visione di un "upgrade" a metodo parametrizzato 
	}
	
	//esercizio 2
	public static double media(int[] valori) {
		double media = 0.0; //creazione della variabile media inizializzata a 0
		for (int i = 0; i < valori.length; i++) { //scorro l'array fornito in input
			media += valori[i]; //sommo tutti i valori all'interno della variabile media
		}
		media = media / valori.length; //divido media per il numero di valori presenti nell'array
		return media; //ritorno la media effettiva
 	}
	
	//esercizio 3
	public static void media2(int[] valori) {
		int media = 0;
		for (int i = 0; i < valori.length; i++) { 
			media += valori[i]; 
		}
		media = media / valori.length; 
		System.out.println("Media: " + media);
	}//metodo uguale a quello prima tranne l'unica differenza che questo stampa la la media all'interno mentre
	//nell'esercizio 2 ritornava il risultato
	
	public static String inverti(String stringa) {
		String nStringa=""; //creazione di una variabile String vuota 
		for(int i = stringa.length()-1; i >= 0; i--) { //ciclo la stringa carattere per carattere dll'ultimo al primo
			nStringa += stringa.substring(i, i+1); //l'ultimo carattere della stringa data come parametro viene messo come primo nella nuova stringa
		}
		return nStringa; //ritorno la stringa "modificata"
	}
	
	

}
