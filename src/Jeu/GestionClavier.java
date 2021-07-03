package Jeu;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class GestionClavier implements KeyListener {
	
    private Controleur controleur;
    private Affichage affichage;

    public GestionClavier(Controleur controleur,Affichage affichage){
        this.controleur = controleur;
        this.affichage = affichage;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(controleur.jeuFini()){
            affichage.ecranFin();
        }
        Direction suivant;
        
        if(key==37||key==38||key==39||key==40) {
            if (key == 38) {
                suivant = Direction.GAUCHE;
            } else if (key == 40) {
                suivant = Direction.DROITE;
            } else if (key == 39) {
                suivant = Direction.BAS;
            } else {
                suivant = Direction.HAUT;
            }
            controleur.action(suivant);
            affichage.repaint();
        }
    }

	@Override
    public void keyTyped(KeyEvent e) {
	}

	@Override
    public void keyReleased(KeyEvent e) {
	}
}
