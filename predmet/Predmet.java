package predmet;

public class Predmet {
public String imep;
public String profesor;
public int krediti;
public int semestar;
public Predmet() {
	
}
public Predmet(String imep) {
	this.imep=imep;
}
public Predmet(String imepred, String prof, int credits) {
	imep=imepred;
	profesor=prof;
	krediti=credits;
}
public static void main(String[] args)
{	//prv objekt so default konstruktor i dodeluvanje na vrednosti
	Predmet prv = new Predmet();
	prv.imep="Matematika";
	prv.profesor="Zoran";
	prv.krediti=6;
	//vtor objekt so dinamicen konstruktor so vrednost za ime na predmet 
	Predmet vtor = new Predmet("Makedonski");
	//vtor objekt so dinamicen konstruktor so vrednost za ime na predmet, ime na profesor i krediti
	Predmet tret = new Predmet("Angliski","Hristijan",6);
	System.out.println ("Prv predmet:");
	System.out.println(prv.imep + " " + prv.profesor + " " + prv.krediti);
	System.out.println ("Vtor predmet:");
	System.out.println(vtor.imep + " " + vtor.profesor + " " + vtor.krediti);
	System.out.println ("Tret predmet:");
	System.out.println(tret.imep + " " + tret.profesor + " " + tret.krediti);
}
}
