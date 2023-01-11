package model;

import java.time.LocalDate;

public abstract class Console {

	private String nom;
	private Double prix;
	private LocalDate date;

	public Console(String nom, Double prix, LocalDate date) {
		this.nom = nom;
		this.prix = prix;
		this.date = date;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public Double getPrix() {
		return prix;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
