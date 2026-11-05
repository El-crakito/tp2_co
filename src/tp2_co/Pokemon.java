package tp2_co;
import java.util.Random;

public abstract class Pokemon {
	private String nom ; 
	private int niveau ; 
	private final static int nivMax=50;
	private TypePokemon type;
	protected int hp ; 
	private int atk ;
	private static java.util.Random random = new Random();
	

	
	
	public Pokemon(String nom  , TypePokemon type) {
		this.nom=nom;
		this.type=type;
		this.niveau=random.nextInt(1,11);
		this.hp=2*niveau;
		this.atk=(niveau/2)+1;
		
		}
	public String getNom() {return this.nom; }
	public int getNiveau()  {return this.niveau;}
	public int getHp() {return this.hp;}
	public int getAtk() {return this.atk;}
	public TypePokemon getType() {return this.type;}
	
	public boolean IsKO() {
		if (this.hp<=0) {return true ;}
		else {
			return false;
		}
	}
	public abstract void attaquer(Pokemon p);
	public abstract void subir(Pokemon p);
	public void soigner() {
		this.hp=2*this.niveau;
	}
	
	public void log(String s) {
		System.out.println("[Pokemon "+this.nom+"]" + s);
	}
	
	public String toString() {
		
		return (" je m'apelle  : "+ this.nom + "!" + 
				" je suis de type : " +this.type +
				" Je suis de niveau : "+this.niveau + 
				" posséde : "+this.hp +"hp " +
				" et ma puissance d'attaque est :  "+this.atk+"atk");
	}
}
