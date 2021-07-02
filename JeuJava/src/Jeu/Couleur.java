package Jeu;
 
import java.awt.*;
import java.util.HashMap;

public class Couleur {
	
    private static HashMap<String, Color> colorHashMap = new HashMap<>();
    static {
        colorHashMap.put("orange",new Color(251, 97, 7)); 
        colorHashMap.put("bleu", new Color(57, 20, 175));
        colorHashMap.put("vert", new Color(21, 127, 31));
        colorHashMap.put("jaune", new Color(255, 186,8));
        colorHashMap.put("bleuCiel", new Color(23, 190, 187));
        colorHashMap.put("rouge", new Color(208,0,0));
        colorHashMap.put("rose", new Color(216, 30, 91));
        colorHashMap.put("bordeaux", new Color(104, 45, 99)); 
    }
   
    private Extremite extremite1;
    private Extremite extremite2;
    private Ligne ligne;
    private Color color;

    public Couleur(String name){
        this.extremite1 = null;
        this.extremite2 = null;
        this.ligne = new Ligne(this);
        if(colorHashMap.containsKey(name)){
            this.color = colorHashMap.get(name);
        }
    }
    
    protected Ligne getLigneDepart(Extremite depart) {
        ligne.setArrivee(null);
        ligne.setDepart(depart);
        ligne.miseZero();
        depart.setLigneDepart(ligne);
        extremite1.setLigneArrivee(null);
        extremite2.setLigneArrivee(null);
        if (depart == extremite1) {
        	extremite2.setLigneDepart(null);
        }
        else {
        	extremite1.setLigneDepart(null);
        }
        return ligne;
    }

    protected void addExtremite(Extremite extremite){
        if(this.extremite1 == null) {
            this.extremite1 = extremite;
        }
        else if(this.extremite2 == null) {
            this.extremite2 = extremite;
        }
        else {
            System.out.println("Impossible d'avoir trois extrémités de la même couleur");
        }
    }
    
    protected Ligne getLigne() {
    	return this.ligne;
    }
    
    protected Extremite[] getExtremites() {
    	return new Extremite[] {extremite1, extremite2};
    }

    protected Color getColor(){
        return color;
    }
}