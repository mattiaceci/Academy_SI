package Model;

import java.util.ArrayList;

public class Utente {
	private String user;
	private String password;
	private String utenza;
	private double budget;

	public ArrayList<Utente> creaUtenti(ArrayList<Utente> utenti) {
		utenti.add(new Utente("mattia", "123", "admin"));
		utenti.add(new Utente("mirko", "456", "user"));
		return utenti;
	}

	public Utente() {

	}

	public Utente(String user, String password, String utenza) {
		super();
		this.user = user;
		this.password = password;
		this.utenza = utenza;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUtenza() {
		return utenza;
	}

	public void setUtenza(String utenza) {
		this.utenza = utenza;
	}
}
