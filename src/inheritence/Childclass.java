package inheritence;

public class Childclass extends Parentclass {
	int x=10;
	int y=20;

	public static void main(String[] args) {
		Childclass cc=new Childclass();
		}
	public Childclass(){
		super();
		System.out.println("constructor in child class");
		}
	public void login(){
		super.login();
		System.out.println("setup prog in  child class");
		}
	public void teardown(){
		System.out.println(("logout prog in child class"));
	}

}
