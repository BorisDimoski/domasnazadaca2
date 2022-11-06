package proizvod;

public class Proizvod {
public String ime;
public String tezina;
public int cena;
public Proizvod() {
	ime="Chokolado";
	tezina="100";
	cena=55;
	
}
	public static void main(String[] args) {
		Proizvod choco= new Proizvod();
		System.out.println("Cenata na "+choco.ime+"to so tezhina od "+choco.tezina+"g iznesuva "+choco.cena+" denari.");
	}

}
