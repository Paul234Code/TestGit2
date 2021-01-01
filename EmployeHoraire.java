package com.entreprise.employe;

public class EmployeHoraire extends Employe {
	private double tauxHoraire=0d;
	private double nombreHeure=0d;
	private double pourcentageHeuresup=0d;
    private static final double nbreDues=40;
    // constructeur de la classe
    public EmployeHoraire(String nom){
    	super(nom);
    }
    public EmployeHoraire(String nom,double taux,double nbreheure,double pourcentage) {
    	super(nom);
    	this.tauxHoraire= taux;
    	this.nombreHeure= nbreheure;
    	this.pourcentageHeuresup= pourcentage;
    }
    public void setInfoSalaire(double taux, double nbrheure, double pourcentage) {
    	this.tauxHoraire= taux;
    	this.nombreHeure= nbrheure;
    	this.pourcentageHeuresup= pourcentage;
    }
    public double getTauxHoraire() {
    	return tauxHoraire;
    }
    public double getNombreHeure() {
    	return nombreHeure;
    }
    public double getPourcentageHeuresup() {
    return pourcentageHeuresup;
}
    public double getSalaire() {
    	double salaire=0d;
    	if (nombreHeure !=0 && tauxHoraire !=0 && pourcentageHeuresup!=0) {
    		if (nombreHeure>nbreDues) {
    	
    		    return tauxHoraire *(nbreDues+(nombreHeure-nbreDues)*(1+ pourcentageHeuresup/100));
    		}
    		else {
    			return tauxHoraire* nombreHeure;
    		}
    	}
    	else
    	 return 0d;
    
    

}
	@Override
	public String toString() {
		return  super.toString()+", TauxHoraire = " + getTauxHoraire() + " , NombreHeure = "+ getNombreHeure() + 
				", PourcentageHeuresup = " + getPourcentageHeuresup() + " ,Salaire = "
				+ getSalaire() ;
	}
    
  }



