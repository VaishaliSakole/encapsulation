package person;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
attribues a=new attribues("vaishali",20,"pune");
String name=a.getName();
a.setName("vaishnavi");
System.out.println("name="+name);

double age=a.getAge();
a.setAge(20);
System.out.println("age="+age);


String country=a.getCountry();
a.setCountry("india");
System.out.println("country="+country);


	}

}
