package com.jja.garage;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

	private TypeMoteur type;
	private String cylindre;
	private Double prix;
	
	public Moteur(String cylindre,Double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
		
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeMoteur type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public TypeMoteur getType() {
		return type;
	}

	/**
	 * @return the cylindre
	 */
	public String getCylindre() {
		return cylindre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return type + " " + cylindre + " (" + prix + "€)";
	}

	
	
}
