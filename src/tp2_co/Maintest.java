package tp2_co;

public class Maintest {
	
	public static void main (String []args) {
		System.out.println("\n test initialisation");
		Pokemon0 p1 = new Pokemon0("Tyranocif");
		Pokemon0 p2 = new Pokemon0("Minautope");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
}
}
