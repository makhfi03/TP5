package ma.projet.test2;

import ma.projet.metiers.Menuisier;
import ma.projet.metiers.Plombier;
import ma.projet.metiers.Personne;

public class TestMetiers {
    public static void main(String[] argv) {
        // Création d'un tableau de personnes (polymorphisme)
        Personne[] personnes = new Personne[3];

        // Initialisation du tableau avec des objets de différentes classes
        personnes[0] = new Menuisier("Paul");   // Création d'un menuisier nommé Paul
        personnes[1] = new Plombier("Jean");    // Création d'un plombier nommé Jean
        personnes[2] = new Menuisier("Adrien"); // Création d'un menuisier nommé Adrien

        // Parcours du tableau et affichage des informations sur chaque personne
        for (Personne personne : personnes) {
            personne.affiche(); // Appelle la méthode affiche() redéfinie dans chaque sous-classe
        }
    }
}
