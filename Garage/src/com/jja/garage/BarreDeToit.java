package com.jja.garage;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
private Double prix = 29.9d;
private String nomOption = "Barre de toit";

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
