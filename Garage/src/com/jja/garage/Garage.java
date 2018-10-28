package com.jja.garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


import java.io.Serializable;

public class Garage implements Serializable {

	private ArrayList<Vehicule> voitures; 	
	
	/**
	 * Constructeur du garage avec verification de la sauvegarde automatique
	 */
	public Garage(){
		this.voitures= new ArrayList<Vehicule>();
		File f = new File("garageSauvegardeAuto.txt");
		
		if (f.exists()) { //verification que le fichier exsiste deja
			ObjectInputStream sauvegardeLecture;
				
			//On récupère maintenant les données !
			      try {
					sauvegardeLecture = new ObjectInputStream(
					          new BufferedInputStream(
					            new FileInputStream(f)));
				// integration des voitures
			   
					this.voitures= (ArrayList<Vehicule>) sauvegardeLecture.readObject();
					sauvegardeLecture.close();
			     } catch (ClassNotFoundException e) {
		                e.printStackTrace();
			      } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      
		}else {
		System.out.println("Aucune voiture de sauvegardée");
		}
	}
	/**
	 * Ajout une voiture au garage
	 * @param vehicule 
	 */
	public void addVoiture(Vehicule vehicule) {
		this.voitures.add(vehicule);		
		ObjectOutputStream savegardeEcriture;		
		   	try {
		   	savegardeEcriture = new ObjectOutputStream(
		              new BufferedOutputStream(
		                new FileOutputStream(
		                  new File("garageSauvegardeAuto.txt"))));
		        	
		      //Nous allons écrire l' objet  voitures dans le fichier
		      savegardeEcriture.writeObject(this.voitures);
		     
		      //Ne pas oublier de fermer le flux !
		      savegardeEcriture.close();
		 	      
		   	} catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    } 
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {	
	
		String affichageContenu="";	
		for (int i = 0; i < this.voitures.size(); i++) {
			affichageContenu+=this.voitures.get(i).toString()+"\n";
		}
		return this.entete()+affichageContenu;
	}
	
	
	/**
	 * En tete d'affichage de la liste de vehicule
	 * @return entete du garage
	 */
	public String entete() {
		String affichageContenuEntete;
		affichageContenuEntete = "******************************"+"\n";
		affichageContenuEntete +="*    OpenClassRooms Garage   *"+"\n";
		affichageContenuEntete +="******************************"+"\n";
		return affichageContenuEntete;
		}
	
}
