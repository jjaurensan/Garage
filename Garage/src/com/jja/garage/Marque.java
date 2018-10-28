package com.jja.garage;

public enum Marque {
RENO("Voiture RENO"),
PIGEOT("Voiture PIGEOT"),
TROEN("Voiture TROEN");

private String marque="";

// Constructeur
Marque(String marque){
	this.marque= marque;
	} 
public String toString(){
    return marque;
  }
}