package ma.projet.formes;

// Classe abstraite qui représente une forme géométrique
public abstract class Forme {
    
    // Méthode abstraite pour calculer la surface de la forme
    public abstract double getSurface();

    // Méthode abstraite pour retourner une description de la forme
    @Override
    public abstract String toString();
}
