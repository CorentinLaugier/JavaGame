package Jeu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ListenerNiveau implements ActionListener {
	
	private Dimension dimensionFin;

	public ListenerNiveau(Dimension dimensionFin){
		this.dimensionFin = dimensionFin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Bouton boutonAppuye = (Bouton) e.getSource();
		boutonAppuye.fermeFenetre();

		if(boutonAppuye.getNiveau() == 1){

			Plateau plateau = new Plateau(6);
			Controleur controleur = new Controleur(plateau);
			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);

			plateau.ajouteExtremite(0, 0, orange);
			plateau.ajouteExtremite(0, 4, orange);
			plateau.ajouteExtremite(1, 0, bleu);
			plateau.ajouteExtremite(0, 5, bleu);
			plateau.ajouteExtremite(2, 0, vert);
			plateau.ajouteExtremite(2, 2, vert);
			plateau.ajouteExtremite(4, 0, jaune);
			plateau.ajouteExtremite(2, 3, jaune);
			plateau.ajouteExtremite(5, 0, rouge);
			plateau.ajouteExtremite(2, 5, rouge);
			plateau.ajouteExtremite(4, 1, bleuCiel);
			plateau.ajouteExtremite(2, 4, bleuCiel);

			new Affichage(plateau, dimensionFin, controleur, listCouleurs, 2);
		}
		if(boutonAppuye.getNiveau() == 2){

			Plateau plateau = new Plateau(6);
			Controleur controleur = new Controleur(plateau);
			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);

			plateau.ajouteExtremite(1, 0, orange);
			plateau.ajouteExtremite(2, 0, bleu);
			plateau.ajouteExtremite(5, 0, vert);
			plateau.ajouteExtremite(2, 2, jaune);
			plateau.ajouteExtremite(3, 2, rouge);
			plateau.ajouteExtremite(5, 2, vert);
			plateau.ajouteExtremite(3, 3, bleuCiel);
			plateau.ajouteExtremite(5, 3, bleu);
			plateau.ajouteExtremite(1, 4, rouge);
			plateau.ajouteExtremite(2, 4, jaune);
			plateau.ajouteExtremite(4, 4, bleuCiel);
			plateau.ajouteExtremite(5, 4, orange);

			new Affichage(plateau,dimensionFin, controleur, listCouleurs, 3);
		}
		if(boutonAppuye.getNiveau() == 3){
			Plateau plateau = new Plateau(7);
			Controleur controleur = new Controleur(plateau);

			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");
			Couleur rose = new Couleur("rose");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);
			listCouleurs.add(rose);

			plateau.ajouteExtremite(6,0,rouge);
			plateau.ajouteExtremite(1,1,rose);
			plateau.ajouteExtremite(1,2,bleu);
			plateau.ajouteExtremite(4,2,rose);
			plateau.ajouteExtremite(1,3,orange);
			plateau.ajouteExtremite(2,3,jaune);
			plateau.ajouteExtremite(4,3,bleu);
			plateau.ajouteExtremite(5,3,orange);
			plateau.ajouteExtremite(1,4,bleuCiel);
			plateau.ajouteExtremite(5,4,rouge);
			plateau.ajouteExtremite(1,5,vert);
			plateau.ajouteExtremite(5,5,jaune);
			plateau.ajouteExtremite(6,5,vert);
			plateau.ajouteExtremite(2,6,bleuCiel);

			new Affichage(plateau,dimensionFin, controleur, listCouleurs, 4);
		}
		if(boutonAppuye.getNiveau() == 4){
			Plateau plateau = new Plateau(7);
			Controleur controleur = new Controleur(plateau);

			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");
			Couleur rose = new Couleur("rose");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);
			listCouleurs.add(rose);

			plateau.ajouteExtremite(1, 4, rouge);
			plateau.ajouteExtremite(5, 5, rouge);
			plateau.ajouteExtremite(0, 4, orange);
			plateau.ajouteExtremite(0, 0, orange);
			plateau.ajouteExtremite(5, 0, bleu);
			plateau.ajouteExtremite(6, 3, bleu);
			plateau.ajouteExtremite(4, 3, bleuCiel);
			plateau.ajouteExtremite(5, 1, bleuCiel);
			plateau.ajouteExtremite(0, 1, jaune);
			plateau.ajouteExtremite(2, 4, jaune);
			plateau.ajouteExtremite(2, 0, vert);
			plateau.ajouteExtremite(4, 0, vert);
			plateau.ajouteExtremite(2, 1, rose);
			plateau.ajouteExtremite(4, 2, rose);

			new Affichage(plateau, dimensionFin, controleur, listCouleurs, 5);
		}
		if(boutonAppuye.getNiveau() == 5){
			Plateau plateau = new Plateau(8);
			Controleur controleur = new Controleur(plateau);

			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");
			Couleur rose = new Couleur("rose");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);
			listCouleurs.add(rose);

			plateau.ajouteExtremite(7, 7, rouge);
			plateau.ajouteExtremite(4, 5, rouge);
			plateau.ajouteExtremite(1, 2, orange);
			plateau.ajouteExtremite(6, 0, orange);
			plateau.ajouteExtremite(2, 5, bleu);
			plateau.ajouteExtremite(7, 2, bleu);
			plateau.ajouteExtremite(5, 0, bleuCiel);
			plateau.ajouteExtremite(4, 6, bleuCiel);
			plateau.ajouteExtremite(4, 4, jaune);
			plateau.ajouteExtremite(7, 6, jaune);
			plateau.ajouteExtremite(1, 5, vert);
			plateau.ajouteExtremite(7, 0, vert);
			plateau.ajouteExtremite(1, 6, rose);
			plateau.ajouteExtremite(3, 5, rose);

			new Affichage(plateau,dimensionFin, controleur, listCouleurs, 6);
		}
		if(boutonAppuye.getNiveau() == 6){

			Plateau plateau = new Plateau(8);
			Controleur controleur = new Controleur(plateau);

			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");
			Couleur rose = new Couleur("rose");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);
			listCouleurs.add(rose);

			plateau.ajouteExtremite(4, 1, rouge);
			plateau.ajouteExtremite(3, 6, rouge);
			plateau.ajouteExtremite(4, 0, orange);
			plateau.ajouteExtremite(6, 0, orange);
			plateau.ajouteExtremite(1, 6, bleu);
			plateau.ajouteExtremite(3, 4, bleu);
			plateau.ajouteExtremite(6, 1, bleuCiel);
			plateau.ajouteExtremite(6, 3, bleuCiel);
			plateau.ajouteExtremite(2, 6, jaune);
			plateau.ajouteExtremite(5, 5, jaune);
			plateau.ajouteExtremite(2, 2, vert);
			plateau.ajouteExtremite(2, 4, vert);
			plateau.ajouteExtremite(5, 0, rose);
			plateau.ajouteExtremite(5, 3, rose);

			new Affichage(plateau, dimensionFin, controleur, listCouleurs, 7);
		}
		if(boutonAppuye.getNiveau() == 7){

			Plateau plateau = new Plateau(9);
			Controleur controleur = new Controleur(plateau);

			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");
			Couleur rose = new Couleur("rose");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);
			listCouleurs.add(rose);

			plateau.ajouteExtremite(0, 5, rouge);
			plateau.ajouteExtremite(1, 7, rouge);
			plateau.ajouteExtremite(4, 2, orange);
			plateau.ajouteExtremite(6, 7, orange);
			plateau.ajouteExtremite(6, 2, bleu);
			plateau.ajouteExtremite(4, 8, bleu);
			plateau.ajouteExtremite(6, 3, bleuCiel);
			plateau.ajouteExtremite(4, 7, bleuCiel);
			plateau.ajouteExtremite(4, 1, jaune);
			plateau.ajouteExtremite(7, 2, jaune);
			plateau.ajouteExtremite(1, 1, vert);
			plateau.ajouteExtremite(3, 7, vert);
			plateau.ajouteExtremite(6, 6, rose);
			plateau.ajouteExtremite(5, 7, rose);

			new Affichage(plateau, dimensionFin, controleur, listCouleurs, 8);
		}
		if(boutonAppuye.getNiveau() == 8){

			Plateau plateau = new Plateau(9);
			Controleur controleur = new Controleur(plateau);

			Couleur rouge = new Couleur("rouge");
			Couleur orange = new Couleur("orange");
			Couleur bleu = new Couleur("bleu");
			Couleur bleuCiel = new Couleur("bleuCiel");
			Couleur jaune = new Couleur("jaune");
			Couleur vert = new Couleur("vert");
			Couleur rose = new Couleur("rose");
			Couleur bordeaux = new Couleur("bordeaux");

			List<Couleur> listCouleurs = new ArrayList<Couleur>();
			listCouleurs.add(rouge);
			listCouleurs.add(orange);
			listCouleurs.add(bleu);
			listCouleurs.add(bleuCiel);
			listCouleurs.add(jaune);
			listCouleurs.add(vert);
			listCouleurs.add(rose);
			listCouleurs.add(bordeaux);

			plateau.ajouteExtremite(3, 2, rouge);
			plateau.ajouteExtremite(3, 4, rouge);
			plateau.ajouteExtremite(2, 2, orange);
			plateau.ajouteExtremite(8, 8, orange);
			plateau.ajouteExtremite(1, 1, bleu);
			plateau.ajouteExtremite(3, 1, bleu);
			plateau.ajouteExtremite(0, 3, bleuCiel);
			plateau.ajouteExtremite(5, 3, bleuCiel);
			plateau.ajouteExtremite(4, 5, jaune);
			plateau.ajouteExtremite(6, 5, jaune);
			plateau.ajouteExtremite(4, 1, vert);
			plateau.ajouteExtremite(3, 6, vert);
			plateau.ajouteExtremite(0, 4, rose);
			plateau.ajouteExtremite(3, 5, rose);
			plateau.ajouteExtremite(2, 6, bordeaux);
			plateau.ajouteExtremite(2, 8, bordeaux);

			new Affichage(plateau, dimensionFin, controleur, listCouleurs, -1);
		}
	}
}
