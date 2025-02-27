package ma.projet.formes;

// Une classe Carre qui hérite de la classe abstraite Forme
public class Carre extends Forme {
    private double cote;

    // Constructeur qui initialise la longueur du côté
    public Carre(double cote) {
        this.cote = cote;
    }

    // Implémentation de la méthode getSurface() pour calculer l'aire du carré
    @Override
    public double getSurface() {
        return cote * cote; // Surface
    }

    // toString() pour afficher les détails du carré
    @Override
    public String toString() {
        return "Carré (côté " + cote + " cm)";
    }
}
