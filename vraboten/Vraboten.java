package vraboten;

public class Vraboten {
	public String ime;
	public String prezime;
	public int plata;
	public Vraboten()
	{
		this.ime="Aleksandar";
		this.prezime="Spirkoski";
		this.plata=15000;
	}
	public static void main(String[] args)
	{
		Vraboten vrab=new Vraboten();
		System.out.println("Imeto na vraboteniot e "+ vrab.ime+".");
		System.out.println("Prezimeto na vraboteniot e "+ vrab.prezime+".");
		System.out.println("Negovata plata iznesuva "+ vrab.plata +" denari.");
	}
}
