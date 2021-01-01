package com.entreprise.employe;

public class Commercial extends Employe {
	private double sommefixe=0d;
	private double chiffre_daffaire= 0d;
	private static final double pourcentage= 1d;
	
	// constructeur avec un seul parametre
	public Commercial(String nom) {
		super(nom);
	}
	public Commercial(String nom, double somefixe, double chiffre) {
		super(nom);
		this.sommefixe= somefixe;
		this.chiffre_daffaire= chiffre;
	}
	public double getSalaire() {
		return sommefixe +(chiffre_daffaire*pourcentage)/100 ;
	}
	public double getSommefixe() {
		return sommefixe;
	}
	public double getChiffre_daffaire() {
		return chiffre_daffaire;
	}
	public static double getPourcentage() {
		return pourcentage;
	}
	public void setSommefixe(double sommefixe) {
		this.sommefixe = sommefixe;
	}
	public void setChiffre_daffaire(double chiffre_daffaire) {
		this.chiffre_daffaire = chiffre_daffaire;
	}
	public void setInfoSalaire(double sommefixe,double chiffre_dafaire) {
		this.sommefixe= sommefixe;
		this.chiffre_daffaire= chiffre_dafaire;
	}
	public String toString() {
		return super.toString() +", Somme fixe = " +getSommefixe() + ", Chiffre d'affaire = "+
	getChiffre_daffaire()+ ", salaire = "+ getSalaire();
	}

}
