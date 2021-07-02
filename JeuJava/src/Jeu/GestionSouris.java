package Jeu;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GestionSouris implements MouseListener {

    private Controleur controleur;
    private Affichage affichage;
    private int dimensionQuadrillage;

    public GestionSouris(Controleur controleur, Dimension dimension, Plateau plateau, Affichage affichage){
        this.controleur = controleur;
        this.affichage = affichage;
        this.dimensionQuadrillage = (int)((int) Math.min(dimension.getHeight()/plateau.getDimension(),dimension.getWidth()/plateau.getDimension())*0.92);;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(controleur.jeuFini()){
            affichage.ecranFin();
        }
        int abscisse = (int) (e.getX()-dimensionQuadrillage*0.1)/dimensionQuadrillage;
        int ordonee = (int) (e.getY()-dimensionQuadrillage*0.1-21)/dimensionQuadrillage;
        controleur.selectionLigne(abscisse,ordonee);
        affichage.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}