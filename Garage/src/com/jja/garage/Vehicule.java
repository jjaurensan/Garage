package com.jja.garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

abstract class Vehicule implements Serializable{

	protected Double prix;
	protected String Nom;
	protected Marque nomMarque; 
	protected Moteur Moteur;
	protected Double prixGlobaleVehicule;
	List<Option> options = new ArrayList<Option>();
	
	
	public Vehicule() {
		
		// TODO Auto-generated constructor stub
	}
	
	public void addOption(Option opt) {
		this.options.add(opt);
	}
	
	public void setMoteur(Moteur moteur) {
		this.Moteur= moteur;
		}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}

	/**
	 * @return the options
	 */
	public Option getOptions() {
		return (Option) options;
	}

	/**
	 * @return the nomMarque
	 */
	public Marque getNomMarque() {
		return nomMarque;
	}

	/**
	 * @return the moteur
	 */
	public Moteur getMoteur() {
		return Moteur;
	}
		
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		prixGlobaleVehicule=Vehicule.this.Moteur.getPrix();
		if (this.options.size()!=0) {
			for (int j = 0; j <this.options.size(); j++) {				
					prixGlobaleVehicule+=this.options.get(j).getPrix();
			}		
			return "+ " + nomMarque +" "+ Nom +" : " + Moteur + options + " d'une valeur totale de "+ prixGlobaleVehicule +"€";
		}		
		return "+ " + nomMarque +" "+ Nom +" : " + Moteur + " d'une valeur totale de "+ prixGlobaleVehicule +"€";
		//return "Vehicule [prix="+ prix + ","+ " Nom=" + Nom + ", nomMarque=" + nomMarque + ", Moteur=" + Moteur+ ", options=" + options + "]";
	}

}
