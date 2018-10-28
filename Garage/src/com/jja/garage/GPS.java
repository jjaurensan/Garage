package com.jja.garage;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	private Double prix = 113.5d;
	private String nomOption = "GPS";

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
