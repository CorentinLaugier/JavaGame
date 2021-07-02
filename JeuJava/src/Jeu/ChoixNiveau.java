package Jeu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChoixNiveau extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private Color colorBackground = new Color(28,29,33);
	private Color colorForeground = new Color(239,47,88);

    public ChoixNiveau(){
        super("ChoixNiveau");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(300, 300);
        this.setSize(dimension);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(colorBackground);
        jPanel.setLayout(new GridLayout(4,2,10,10));

        Border border = BorderFactory.createLineBorder(Color.gray);

        for(int i = 1;i <= 8;i++){
            Bouton bouton = new Bouton(i, this);
            bouton.setForeground(colorForeground);
            bouton.setBackground(colorBackground);
            bouton.setBorder(border);
            Dimension dimensionFinal = new Dimension(600, 600);
            bouton.addActionListener(new ListenerNiveau(dimensionFinal));
            jPanel.add(bouton);
        }

        this.add(jPanel);
        this.setVisible(true);
    }
}
