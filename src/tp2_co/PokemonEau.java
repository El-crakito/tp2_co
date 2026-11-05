package tp2_co;

public class PokemonEau  extends Pokemon{
	
	public PokemonEau (String s) {
		super(s , TypePokemon.Eau);
	}
	public void attaquer(Pokemon p) {
		p.subir(this);
		if(p.IsKO()) {
			p.log("Ahhhhh je suis tombé au combat ");
		}
		else {
			p.log("J'ai résisté à ton attaque avec : " +p.hp + "hp restant ");
			
		}
		
	}
	public  void subir(Pokemon p) {
		if(p.getType()==TypePokemon.Plante) {
			this.hp-=p.getAtk()*2;
		}
		else if (p.getType()==TypePokemon.Feu || p.getType()==TypePokemon.Eau){ 
			if(p.getAtk()==1) {this.hp-=1;}
			else {
			this.hp-=p.getAtk()/2;
			}
			
		}
	if(this.hp<0) {
		this.hp=0;
		
	}
		
	}

}
