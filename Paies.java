package com.entreprise.employe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Paies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creation d'un tableau Employe de 7 cases
		Employe [] tableauEmploye= new Employe[5];
		// creation d'un employe horaire
		EmployeHoraire employe0= new EmployeHoraire("Paul Faye");
		//ajout d'un enploye horaire dans le tableau
		employe0.setInfoSalaire(20, 60 ,30);
		tableauEmploye[0]= employe0;
		//ajout d'un enploye horaire dans le tableau

		EmployeHoraire employe1= new EmployeHoraire("Sophie Faye");
		employe1.setInfoSalaire(20, 50, 50);
		tableauEmploye[1]= employe1;
		// creation d'un commercial
		Commercial commercial= new Commercial("Elisabeth Faye");
		commercial.setInfoSalaire(20_000, 100_000);
		//ajout dans le tableau
		tableauEmploye[2]= commercial;
		// deuxieme commercial
		Commercial seller= new Commercial("Sanda Cote");
		seller.setInfoSalaire(10_000, 50_000);
		tableauEmploye[3]= seller;
		// troisieme commercial
		Commercial seller1= new Commercial("Jean Diatta");
		seller1.setInfoSalaire(3000, 12000);
		tableauEmploye[4]= seller1;
		
		System.out.println("l'ensemble des Employes de l'Entreprise BRIDGE:");
		System.out.println();
		for( int i=0; i<tableauEmploye.length; i++)
		System.out.println(tableauEmploye[i]);
		
		//utilsation d'un iterator
		List<Employe> mylist= new ArrayList<Employe>();
		mylist.add(employe0);
		mylist.add(employe1);
		mylist.add(commercial);
		mylist.add(seller);
		mylist.add(seller1);
		// defintion d'un iterator
		Iterator<Employe> myIterator = mylist.iterator();
		// affichage de la liste des employes avec un iterator
		System.out.println();
		System.out.println("affichage de la liste des employes avec un iterator:");
		System.out.println();
		while(myIterator.hasNext())
			System.out.println(myIterator.next());
		
		

	}

}
