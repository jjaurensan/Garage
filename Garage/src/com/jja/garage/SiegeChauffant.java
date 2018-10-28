package com.jja.garage;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	private Double prix = 562.9d;
	private String nomOption = "Siège chauffant";
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}
	@Override
	public String getOptionNom() {
		// TODO Auto-generated method stub
		return nomOption;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nomOption + "("+prix+"€)";
	}
}
