package thisSuper;

public class PS2 extends PS3 {
	int a;
	public PS2(int a) {  //parameterised construcutor
		// TODO Auto-generated constructor stub
		super(a);// we are passing 'a', need to use super keyword for referring parent class PS3 constructor
				 // the function is in PS3  so reffer it so it will invoke parentclass constructor
				// PS3 also have parameterised constructor need to activate that also. So use Super
				// super should be first inside a constructor
		this.a=a;
	}
	public int increment() {
		a=a+1;
		return a;
	}
	public int decrement() {
		a=a-1;
		return a;
	}
	

}
