package com.jja.garage;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{

private Double prix = 212.35d;
private String nomOption = "Vitre electrique";

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
