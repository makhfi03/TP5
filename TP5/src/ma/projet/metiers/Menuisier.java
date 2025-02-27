package ma.projet.metiers;

// La classe Menuisier hérite de la classe abstraite Personne
public class Menuisier extends Personne {

    // Constructeur qui initialise le nom du menuisier
    public Menuisier(String nom) {
        super(nom); // Appelle le constructeur de la classe mère (Personne)
    }

    // Redéfinition de la méthode affiche() pour afficher le métier du menuisier
    @Override
    public void affiche() {
        System.out.println("Je suis " + nom + " le Menuisier.");
    }
}
