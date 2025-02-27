package ma.projet.metiers;

// Classe abstraite qui représente une personne
public abstract class Personne {
    protected String nom; 

    // Constructeur qui initialise le nom de la personne
    public Personne(String nom) {
        this.nom = nom;
    }

    // Méthode abstraite qui doit être implémentée par les sous-classes
    public abstract void affiche();
}
