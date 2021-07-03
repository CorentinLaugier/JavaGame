package Jeu;

public class Plateau {
	
    private Case[][] listCase;
    private int dimension;

	public Plateau(int dimension){
        this.dimension = dimension;
        listCase = new Case[dimension][dimension];
        for(int i = 0; i<dimension; i++){
            for(int j = 0; j<dimension; j++){
                listCase[i][j] = new Case();
            }
        }
    }
    
    protected boolean plateauComplet() {
    	for (int i=0; i<this.dimension; ++i) {
    		for (int j=0; j<this.dimension; ++j){
    			if (!listCase[i][j].valideFinJeu()){
    				return false;
    			}
    		}
    	}
    	return true;
    }

    protected void ajouteExtremite(int ligne, int colonne, Couleur couleur){
        Case caseExtremite = this.getCase(ligne,colonne);
        caseExtremite.setExtremite(couleur);
    }

    protected Case getMaCaseVoisine(Case moi, Direction direction) {
    	int[] position = getPosition(moi);
    	int ligne = position[0];
    	int colonne = position[1];
    	
    	switch (direction) {
    	case HAUT:
    		if (ligne != 0) {
    			return listCase[ligne-1][colonne];
    		}
    		return null;
    		
    	case BAS:
    		if (ligne != dimension-1) {
    			return listCase[ligne+1][colonne];
    		}
    		return null;
    		
    	case DROITE:
    		if (colonne != dimension-1) {
    			return listCase[ligne][colonne+1];
    		}
    		return null;
    		
    	case GAUCHE:
    		if (colonne != 0) {
    			return listCase[ligne][colonne-1];
    		}
    		return null;
    	}
    		
    	return null;
    }
    
    protected int[] getPosition(Case moi) {
    	for (int i=0; i<this.dimension; ++i) {
    		for (int j=0; j<this.dimension; ++j){
    			if (listCase[i][j] == moi) {
    				return new int[] {i,j};
    			} 
    		}
    	}
    	return new int[2] ;
    }

    protected Case getCase(int ligne, int colonne){
        return listCase[ligne][colonne];
    }

    protected Ligne getLigne(int ligne, int colone) {
    	return listCase[ligne][colone].getLigne();
    }
    
    protected int getDimension(){
        return dimension;
    }
}