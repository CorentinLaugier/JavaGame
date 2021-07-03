package Jeu;

import javax.swing.*;
import java.util.List;
import java.awt.*;

public class Grid extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Dimension dimension;
    private int lignes;
    private int colonnes;
    private Plateau plateau;
    private Color defaultColor = new Color(100,100,100);
    private List<Couleur> couleurs;

	public Grid(Dimension dimension,Plateau plateau, List<Couleur> couleurs){
        this.plateau = plateau;
        this.dimension = dimension;
        this.lignes = plateau.getDimension();
        this.colonnes = plateau.getDimension();
        this.couleurs = couleurs;
    }
    /**
     *
     */
    @Override
    protected void paintComponent(Graphics g){
    	this.setBackground(new Color(44,29,29));
        super.paintComponent(g);
        g.setColor(defaultColor);
        Graphics2D g2d = (Graphics2D) g.create();
        int tailleCases;
        int tailleCercles;
        tailleCases = (int)((int) Math.min(dimension.getHeight()/lignes,dimension.getWidth()/colonnes)*0.92);
        tailleCercles = (int) (tailleCases*0.8);

        for(int i = 0; i<lignes; i++){
        	for(int j = 0;j<colonnes;j++){
        		g.drawRect((int) (tailleCases*0.05) + i*tailleCases,
        				(int) (tailleCases*0.05) + j*tailleCases,
        				tailleCases,
        				tailleCases);
        	}
        }
        for (Couleur couleur:couleurs) {
    		g.setColor(couleur.getColor());
    		Extremite[] extremites = couleur.getExtremites(); 
    		Extremite extremite1 = extremites[0];
    		Extremite extremite2 = extremites[1];
    		
        	if (extremite1 != null) {
        		Case caseCourante = extremite1.getCase();
        		int[] position = plateau.getPosition(caseCourante);
        		
                g.fillOval((int) ((tailleCases*0.05)+(position[0]+0.1)*tailleCases),
                		(int) ((tailleCases*0.05)+(position[1]+0.1)*tailleCases),
                		tailleCercles,
                		tailleCercles);

        	}
        	if (extremite2 != null) {
        		Case caseCourante = extremite2.getCase();
        		int[] position = plateau.getPosition(caseCourante);
        		
                g.fillOval((int) ((tailleCases*0.05)+(position[0]+0.1)*tailleCases),
                		(int) ((tailleCases*0.05)+(position[1]+0.1)*tailleCases),
                		tailleCercles,
                		tailleCercles);
            }
        	
        	Ligne ligne = couleur.getLigne();
        	List<Case> listCases = ligne.getCasesUtilisees();
        	int size = listCases.size();
        	
        	if (size > 0) {
        		Case caseCourante = listCases.get(0);
        		int[] position = plateau.getPosition(caseCourante);
        		
        		g.fillOval((int) ((position[0]+0.3+0.05)*tailleCases),
        				(int) ((position[1]+0.3+0.05)*tailleCases),
        				(int)(tailleCercles*0.5),
        				(int)(tailleCercles*0.5));
        		
                Direction direction = Direction.HAUT;
                
                for(Direction dir:Direction.values()) {
                	Extremite depart = ligne.getDepart();
                	if (plateau.getMaCaseVoisine(caseCourante, dir) == depart.getCase()) {
                		direction = dir;
                	}
                }
                
                switch (direction){
                case HAUT:
                	g.fillRect((int) ((position[0]-0.5+0.05)*tailleCases),
                			(int) ((position[1]+0.05+0.3)*tailleCases),
                			tailleCases,
                			(int)(tailleCases*0.4));
                	break;
                	
                case BAS:
                	g.fillRect((int) ((position[0]+0.5+0.05)*tailleCases),
                			(int) ((position[1]+0.05+0.3)*tailleCases),
                			tailleCases,
                			(int)(tailleCases*0.4));
                	break;
                	
                case DROITE:
                	g.fillRect((int) ((position[0]+0.05+0.3)*tailleCases),
                			(int) ((position[1]+0.5+0.05)*tailleCases),
                			(int)(tailleCases*0.4),
                			tailleCases);
                	break;
                	
                case GAUCHE:
                	g.fillRect((int) ((position[0]+0.05+0.3)*tailleCases),
                			(int) ((position[1]-0.5+0.05)*tailleCases),
                			(int)(tailleCases*0.4),
                			tailleCases);
                	break;
                	
                }
        	}
        	
        	for (int i=1; i<size; i++) {
        		
        		Case caseCourante = listCases.get(i);
          		int[] position = plateau.getPosition(caseCourante);
          		
        		g.fillOval((int) ((position[0]+0.3+0.05)*tailleCases),
        				(int) ((position[1]+0.3+0.05)*tailleCases),
        				(int)(tailleCercles*0.5),
        				(int)(tailleCercles*0.5));
        		
                Direction direction = Direction.HAUT;
                for(Direction dir:Direction.values()) {
                	if (plateau.getMaCaseVoisine(caseCourante, dir) == listCases.get(i-1)) {
                		direction = dir;
                	}
                }
                
                switch (direction){
                case HAUT:
                	g.fillRect((int) ((position[0]-0.5+0.05)*tailleCases),
                			(int) ((position[1]+0.05+0.3)*tailleCases),
                			tailleCases,
                			(int)(tailleCases*0.4));
                	break;
                	
                case BAS:
                	g.fillRect((int) ((position[0]+0.5+0.05)*tailleCases),
                			(int) ((position[1]+0.05+0.3)*tailleCases),
                			tailleCases,
                			(int)(tailleCases*0.4));
                	break;
                	
                case DROITE:
                	g.fillRect((int) ((position[0]+0.05+0.3)*tailleCases),
                			(int) ((position[1]+0.5+0.05)*tailleCases),
                			(int)(tailleCases*0.4),
                			tailleCases);
                	break;
                	
                case GAUCHE:
                	g.fillRect((int) ((position[0]+0.05+0.3)*tailleCases),
                			(int) ((position[1]-0.5+0.05)*tailleCases),
                			(int)(tailleCases*0.4),
                			tailleCases);
                	break;
                	
                }
        	}
            g.setColor(defaultColor);
        }
        g2d.dispose();
    }
}
