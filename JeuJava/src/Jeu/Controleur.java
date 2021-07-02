package Jeu;

public class Controleur {
	
    private Plateau plateau;
    private Ligne ligneCourante = null;

    public Controleur(Plateau plateau){
        this.plateau = plateau;
    }
    
    protected void selectionLigne(int ligne, int colonne) {
    	ligneCourante = plateau.getLigne(ligne, colonne);
    }

    
    protected void action(Direction direction) {
    	if (ligneCourante != null) {
            Case caseCourante = ligneCourante.getDerniere();
        	Case caseSuivante = plateau.getMaCaseVoisine(caseCourante, direction);
        	boolean nonFinLigne = ligneCourante.getDepart() == null || ligneCourante.getArrivee() == null;
        	if (caseSuivante != null && caseSuivante.accepteLigne(ligneCourante) && nonFinLigne){
        	    ligneCourante.ajouteCase(caseSuivante);
        	}
        }
    }
    
    protected boolean jeuFini(){
        return plateau.plateauComplet();
    }
}