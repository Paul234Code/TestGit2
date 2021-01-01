package com.entreprise.employe;

public abstract class Employe {
	private String nom;
	protected abstract  double getSalaire();
	
	protected  Employe(String nom) {
		this.nom= nom;
	}
	protected String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "nom = " + getNom() ;
	}
		
	
	
	

}
