package ma.projet.metiers;

// La classe Plombier hérite de la classe abstraite Personne
public class Plombier extends Personne {

    // Constructeur qui initialise le nom du plombier
    public Plombier(String nom) {
        super(nom); 
    }

    // Redéfinition de la méthode affiche() pour afficher le métier du plombier
    @Override
    public void affiche() {
        System.out.println("Je suis " + nom + " le Plombier.");
    }
}
