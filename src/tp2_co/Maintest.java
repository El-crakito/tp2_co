package tp2_co;

public class Maintest {
	private static void testPokemon() {
		System.out.println("\n test initialisation");
		Pokemon0 p1 = new Pokemon0("Tyranocif");
		Pokemon0 p2 = new Pokemon0("Minautope");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
	}

	private static void testPokemonTypes() {
		System.out.println("\n test type");
		PokemonEau eau = new PokemonEau("Milobelus");
		PokemonFeu feu = new PokemonFeu("gruikui");
		eau.log(eau.toString());
		feu.log(feu.toString());
		eau.attaquer(feu);
		feu.attaquer(eau);
		eau.log(eau.toString());
		feu.log(feu.toString());
	}
	
	
	public static void main (String []args) {
		testPokemon();
		testPokemonTypes();

}
}
