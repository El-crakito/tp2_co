package tp2_co;
import java.util.Random;

public class Pokemon0 {
	private String nom ; 
	private int niveau ; 
	private int hp ; 
	private int atk ;
	private static java.util.Random random = new Random();
	

	
	
	public Pokemon0(String nom ) {
		this.nom=nom;
		this.niveau=random.nextInt(1,11);
		this.hp=2*niveau;
		this.atk=(niveau/2)+1;
		
		}
	public String getNom() {return this.nom; }
	public int getNiveau()  {return this.niveau;}
	public int getHp() {return this.hp;}
	public int getAtk() {return this.atk;}
	
	public boolean IsKO() {
		if (this.hp<=0) {return true ;}
		else {
			return false;
		}
	}
	public void attaquer(Pokemon0 p) {
		p.hp=p.hp-this.atk;
		if(p.IsKO()) {
			this.log(" Je suis KO");
		}
		
	}
	public void soigner() {
		this.hp=2*this.niveau;
	}
	
	public void log(String s) {
		System.out.println("[Pokemon "+this.nom+"]" + s);
	}
	
	public String toString() {
		
		return (" je m'apelle  : "+ this.nom + "!"
				+ " Je suis de niveau : "+this.niveau + 
				" posséde : "+this.hp +"hp "
				+ " et ma puissance d'attaque est :  "+this.atk+"atk");
	}
}
