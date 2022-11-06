package student;


public class Student {
public String firstName;
public String lastName;
public int index;

public Student (){
}

public Student (String firstName, String lastName, int index){
this.firstName = firstName;
this.lastName = lastName;
this.index = index;
}

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.firstName="Goce";
		obj1.lastName="Stojanoski";
		obj1.index=5567;
		Student obj2 = new Student("Pece","Mitrev",1234);
		System.out.println(obj1.firstName+" "+obj1.lastName+" "+obj1.index);
		System.out.println(obj2.firstName+" "+obj2.lastName+" "+obj2.index);

	}

}
