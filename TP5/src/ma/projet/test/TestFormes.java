package ma.projet.test;

import ma.projet.formes.Carre;
import ma.projet.formes.Cercle;
import ma.projet.formes.Forme;

public class TestFormes {
    public static void main(String[] argv) {
        // Création d'un tableau de formes (polymorphisme)
        Forme[] figures = new Forme[3];

        // Initialisation du tableau avec différentes formes
        figures[0] = new Carre(2);   // Création d'un carré de côté 2 cm
        figures[1] = new Cercle(3);  // Création d'un cercle de rayon 3 cm
        figures[2] = new Carre(5.2); // Création d'un carré de côté 5.2 cm

        // Parcours du tableau et affichage des informations sur chaque forme
        for (Forme figure : figures) {
            // toString() pour obtenir les détails de la forme
            // getSurface() pour calculer la surface de la forme
            System.out.println(figure + " : surface = " + figure.getSurface() + " cm²");
        }
    }
}
