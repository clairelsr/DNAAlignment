
public class alignement {
	public int indiceg;
	public int taille;
	public float score;
	
	alignement() {
		this.taille = 0;
		this.score = 0;
	}
	alignement (int indiceg, int taille, float score) {
		this.indiceg = indiceg;
		this.taille = taille;
		this.score = score;
	}
	
	public static alignement bestalignement (alignement a, alignement b) {
		if (a.score>=b.score) {return a;}
		else return b;
	}
	
	public boolean egal(alignement a) {
		return a.indiceg==this.indiceg&&a.score==this.score&&a.taille==this.taille;
	}
	
}
