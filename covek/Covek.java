package covek;

public class Covek {
	public String ime;
	public String prezime;
	public String maticen;
	public Covek() {
		
	}
	public static void main(String[] args) {
		Covek human=new Covek();
		human.ime="Petar";
		human.prezime="Perov";
		human.maticen="5236623623632";
		System.out.println("Imeto na covekot e: "+human.ime);
		System.out.println("Prezimeto na covekot e: "+human.prezime);
		System.out.println("Covekot ima maticen broj: "+human.maticen);

	}

}
