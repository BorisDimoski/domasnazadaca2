package avtomobil;

public class Avtomobil {
	public String marka;
	public String model;
	public int kilometri;
	public Avtomobil() {
		
	}
	public Avtomobil(String brand,String models,int km)
	{
	 marka = brand;
	 model = models;
	 kilometri = km;
	}
	public static void main(String[] args) {
		Avtomobil eden = new Avtomobil();
		Avtomobil dva = new Avtomobil("BMW","m5 e34",886);
		eden.marka="Audi";
		eden.model="TT";
		eden.kilometri=1350;
		System.out.println(eden.marka+" "+eden.model+" "+eden.kilometri);
		System.out.println(dva.marka+" "+dva.model+" "+dva.kilometri);
	}

}
