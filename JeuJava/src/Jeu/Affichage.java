package Jeu;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Affichage extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private Color colorBackground = new Color(28,29,33);
	private int niveauSuivant;
    private Dimension dimension;
    private Grid grille;
    private Dimension dimensionTransition = new Dimension(360,180);

    public Affichage(Plateau plateau, Dimension dimension, Controleur controleur, List<Couleur> couleurs, int niveauSuivant){
        super("FlowGame");
        this.dimension = dimension;
        this.niveauSuivant = niveauSuivant;
        this.setBackground(colorBackground);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(dimension);
        
        grille = new Grid(dimension, plateau, couleurs);
        this.add(grille);
        
        GestionClavier gestionClavier = new GestionClavier(controleur,this);
        this.addKeyListener(gestionClavier);
        
        GestionSouris gestionSouris = new GestionSouris(controleur,dimension,plateau,this);
        this.addMouseListener(gestionSouris);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    protected void ecranFin(){
        this.remove(grille);
        this.setPreferredSize(dimensionTransition);
        this.add(new EcranTransition(dimensionTransition,this));
        
        this.pack();
        this.repaint();
    }

    protected int getNiveauSuivant(){
        return niveauSuivant;
    }

    protected Dimension getDimension() {
        return dimension;
    }
}
