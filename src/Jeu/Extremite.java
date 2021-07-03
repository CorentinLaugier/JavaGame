package Jeu;

import java.awt.*;

public class Extremite {

	private Case position;
	private Couleur couleur;
	private Ligne ligneDepart = null;
	private Ligne ligneArrivee = null;

	public Extremite(Case position,Couleur couleur){
		this.position = position;
		this.couleur = couleur;
		couleur.addExtremite(this);
	}


	protected boolean valideFinJeu() {
		if (ligneDepart != null) {
			return ligneDepart.valideFinJeu();
		}
		if (ligneArrivee != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean accepteLigne(Ligne ligne) {
		if(ligne.getCouleur() == this.couleur){
			if(ligneArrivee == null){
				 return true;
			}
		}
		return false;
	}
	
	protected void oubliLigneDepart() {
		this.ligneDepart = null;
	}
	
	protected void setLigneDepart(Ligne ligne) {
		this.ligneDepart = ligne;
	}
	
	protected void setLigneArrivee(Ligne ligne) {
		this.ligneArrivee = ligne;
	}
	
	protected Case getCase() {
		return this.position;
	}
	
	protected Ligne getLigne() {
		if (ligneDepart != null){
			return ligneDepart;
		}
		else{
			return this.couleur.getLigneDepart(this);
		}
	}
}