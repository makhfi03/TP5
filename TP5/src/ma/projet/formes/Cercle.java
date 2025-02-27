package ma.projet.formes;

// Une classe Cercle qui hérite de la classe abstraite Forme
public class Cercle extends Forme {
	private double rayon; 

	// Constructeur qui initialise le rayon du cercle
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	// L'implémentation de la méthode getSurface() pour calculer l'aire du cercle
	@Override
	public double getSurface() {
		return Math.PI * rayon * rayon; // Surface
	}

	// toString() pour afficher les détails du cercle
	@Override
	public String toString() {
		return "Cercle (rayon " + rayon + " cm)";
	}
}
