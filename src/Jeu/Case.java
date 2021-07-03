package Jeu;

public class Case {
	
    private boolean utiliseExtremite;
    private boolean utiliseLigne;
    private Extremite extremite;
    private Ligne lignePassante;

    public Case(){
        utiliseExtremite = false;
        utiliseLigne = false;
        extremite = null;
        lignePassante = null;
    }
    
    protected boolean valideFinJeu() {
    	if (utiliseExtremite) {
    		return extremite.valideFinJeu();
    	}
    	if (utiliseLigne) {
    		return true;
    	}
    	return false;
    }
    
    protected boolean accepteLigne(Ligne ligne) {
    	if(!utiliseLigne && !utiliseExtremite){
    	    return true;
        }
    	else if (utiliseExtremite)
    		return extremite.accepteLigne(ligne);
    	else{
    	    return false;
        }
    }
    
    protected void ligneSupprimee() {
    	utiliseLigne = false;
    	lignePassante = null;
    }

    protected void setExtremite(Couleur couleur){
        this.extremite = new Extremite(this, couleur);
        utiliseExtremite = true;
    }

    protected void setLigne(Ligne ligne){
        this.lignePassante = ligne;
        utiliseLigne = true;
    }
    
    protected Ligne getLigne() {
    	if(utiliseExtremite){
    	    return extremite.getLigne();
        }
    	else if(utiliseLigne){
    	    return lignePassante;
        }
    	else{
    	    return null;
        }
    }

    protected boolean getUtiliseExtremite() {
		return utiliseExtremite;
	}

    protected Extremite getExtremite() {
		return this.extremite;
	}
}