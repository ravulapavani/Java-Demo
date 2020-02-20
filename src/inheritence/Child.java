package inheritence;

public class Child {
	int x=10;
	int y=20;

	public static void main(String[] args) {
		Childclass cc=new Childclass();
		cc.login();
	}
	public Child(){
		this(30);
		System.out.println("constructer in current class");
	}
	public Child(int x){
		System.out.println("the value of x is"+x);
		System.out.println(("parametrised constructer in current cla"));
	}
	public void login(){
		System.out.println("setup prog in child class");
		this.teardown();
		}
	public void teardown(){
		System.out.println(("logout prog in parent class"));
	}
}
