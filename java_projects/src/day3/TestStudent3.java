package day3;

public class Student {
	int id;
	String name;
}
class TestStudent3
{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.id=100;
		s1.name="sathya";
		s2.id=200;
		s2.name="uma";
    	System.out.println(s1.id +" "+s1.name);
    	System.out.println(s2.id +" "+s2.name);
    	
		

	}

}
