package Jeu;

import javax.swing.*;

public class Bouton extends JButton {

	private static final long serialVersionUID = 1L;
	
	private int numero;
    private JFrame frame;

    public Bouton(int numero,JFrame frame){
        super("Niveau "+numero);
        this.numero = numero;
        this.frame = frame;
    }

    public Bouton(int numero, JFrame frame, String nom){
        super(nom);
        this.numero = numero;
        this.frame = frame;
    }

    protected int getNiveau(){
        return numero;
    }

    protected void fermeFenetre(){
        frame.dispose();;
    }
}
