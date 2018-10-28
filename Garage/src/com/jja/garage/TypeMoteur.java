package com.jja.garage;

public enum TypeMoteur {
//Objets directement construits
DIESEL("Moteur Diesel"),
ESSENCE("Moteur Essence"),
HYBRIDE("Moteur Hybride"),
ELECTRIQUE("Moteur Electrique");
	
	private String typemoteur ="";
	
	//constructeur
		TypeMoteur(String typemoteur){
			this.typemoteur = typemoteur;
		}
		public String toString(){
		return typemoteur;
		}
}