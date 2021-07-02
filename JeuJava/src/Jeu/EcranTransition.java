package Jeu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcranTransition extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private Color colorBackground = new Color(28,29,33);
	private Color colorForeground = new Color(239,47,88);
    private Affichage affichage;

    public EcranTransition(Dimension dimensionTransition, Affichage affichage){
        super();
        this.affichage = affichage;
        this.setSize(dimensionTransition);
        this.setBackground(colorBackground);
        this.setLayout(new GridLayout(2,3,10,10));
        this.add(new JLabel());
        JLabel texteFin = new JLabel("");
        texteFin.setForeground(colorForeground);
        texteFin.setText("<html>Vous avez r�ussi, bravo !</html>");
        this.add(texteFin);
        this.add(new JLabel());

        Border border = BorderFactory.createLineBorder(Color.gray);

        JButton boutonMenu = new JButton("Menu principal");
        boutonMenu.setForeground(colorForeground);
        boutonMenu.setBackground(colorBackground);
        boutonMenu.setBorder(border);
        boutonMenu.addActionListener(this);
        this.add(boutonMenu);

        if(affichage.getNiveauSuivant() != -1) {
            Bouton boutonSuivant = new Bouton(affichage.getNiveauSuivant(),affichage,"Niveau suivant"); // affichage.getNiveauSuivant() n'est pas redondant avec affichage en argument car Bouton prend affichage en tant que JPanel pour pouvoir être utilisé dans EcranFin et dans ChoixNiveau.
            boutonSuivant.setForeground(colorForeground);
            boutonSuivant.setBackground(colorBackground);
            boutonSuivant.setBorder(border);
            boutonSuivant.addActionListener(new ListenerNiveau(affichage.getDimension()));
            this.add(boutonSuivant);
        }
        else{
            this.add(new JLabel());
        }

        JButton boutonExit = new JButton("Quitter");
        boutonExit.setForeground(colorForeground);
        boutonExit.setBackground(colorBackground);
        boutonExit.setBorder(border);
        boutonExit.addActionListener(this);
        this.add(boutonExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonPressed = (JButton) e.getSource();
        
        if(buttonPressed.getText().equals("Menu principal")){
            affichage.dispose();
            new ChoixNiveau();
        }
        else {
            affichage.dispose();
        }
    }
}
