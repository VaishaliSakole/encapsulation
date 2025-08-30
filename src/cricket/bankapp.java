package cricket;

public class bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsul e=new encapsul(18,"virat",1000,2,"batter");
	e.setJersey(18);
	int a=e.getJersey();
	System.out.println(a);
	e.setName("virat");
	String b=e.getName();
	System.out.println(b);
    e.setRun(9238);
    int c=e.getRun();
    System.out.println(c);
    e.setWicket(293);
    int d=e.getWicket();
    System.out.println(d);
    e.setSpecilazation("batter");
    String f=e.getSpecilazation();
    System.out.println(f);
	}
	}


