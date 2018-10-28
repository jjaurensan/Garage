package com.jja.garage;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

private Double prix = 347.3d;
private String nomOption = "Climatisation";

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
