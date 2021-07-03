package Jeu;

import java.util.ArrayList;
import java.util.List;

public class Ligne {
	
    private Couleur couleur;
    private Extremite depart = null;
    private Extremite arrivee = null;
    private List<Case> casesUtilisees = new ArrayList<>();

    public Ligne(Couleur couleur){
        this.couleur = couleur;;
    }
    
    protected void ajouteCase(Case carre) {
        casesUtilisees.add(carre);
        carre.setLigne(this);
        boolean isExtremite = carre.getUtiliseExtremite();
        if (isExtremite) {
        	Extremite arrive = carre.getExtremite();
        	this.arrivee = arrive;
        	arrive.setLigneArrivee(this);
        }
    }

    protected void miseZero(){
        for(Case caseParcours : casesUtilisees){
            caseParcours.ligneSupprimee();
        }
        casesUtilisees.clear();
        this.depart.oubliLigneDepart();
    }
    
    protected boolean valideFinJeu() {
    	if (arrivee == null || depart == null) {
    		return false;
    		}
    	return true;
    }
    
    protected void setDepart(Extremite depart) {
    	this.depart = depart;
    }
    
    protected void setArrivee(Extremite arrivee) {
    	this.arrivee = arrivee;
    }

    protected Case getDerniere(){
        if (casesUtilisees.size() != 0)
            return casesUtilisees.get(casesUtilisees.size()-1);
        else return depart.getCase();
    }

    protected Couleur getCouleur() {
    	return this.couleur;
    }
    
    protected Extremite getDepart() {
    	return depart;
    }
    
    protected Extremite getArrivee() {
    	return arrivee;
    }

    protected List<Case> getCasesUtilisees() {
		return casesUtilisees;
	}
}
