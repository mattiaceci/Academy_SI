package Model;

import java.util.ArrayList;

import View.IO;

public class Piatto {
	private String nome;
	private String ingredienti;
	private double prezzo;
	
	public ArrayList<Piatto> riempiLista(ArrayList<Piatto> piatti) {
		piatti.add(new Piatto("lasagna","Pasta, Sugo, Carne, Besciamella", 15.50));
		piatti.add(new Piatto("carbonara","Pasta, Uova, Guanciale, Pepe", 12.00));
		piatti.add(new Piatto("bistecca","Bistecca di manzo, Limone, Contorno", 21.20));
		piatti.add(new Piatto("sorbetto","Limone, Cannella", 9.00));
		return piatti;
	}

	public static void modificaPiatto(String nomePiatto, ArrayList<Piatto> piatti) {
		boolean controllo = false;
		for(int i = 0; i < piatti.size(); i++) {
			if(nomePiatto.equals(piatti.get(i).getNome())) {
				System.out.println("Modifica il piatto " + i);
				piatti.set(i, IO.registraPiatto());
				System.out.println("Piatto modificato!");
				controllo = true;
			}
		}
		if(controllo == false) {
			System.out.println("Il nome del piatto inserito non è contenuto nel menù!");
		}
	}
	
	public static void eliminaPiatto(String nomePiatto, ArrayList<Piatto> piatti) {
		boolean controllo = false;
		for(int i = 0; i < piatti.size(); i++) {
			if(nomePiatto.equals(piatti.get(i).getNome())) {
				System.out.println("Elimina il piatto " + i);
				piatti.remove(i);
				System.out.println("Piatto eliminato");
				controllo = true;
			}
		}
		if(controllo == false) {
			System.out.println("Il nome del piatto inserito non è contenuto nel menù!");
		}
	}
	
	public Piatto() {
		
	}
	
	public Piatto(String nome, String ingredienti, Double prezzo) {
		super();
		this.nome = nome;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Piatto: " + nome + " - " + ingredienti + " - " + prezzo + "€"+ "\n";
	}

}
