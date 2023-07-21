package test;

public class VariableDemo {

	
	
	int a = 12;         //instance variable can be used in complete class
	static int d = 22;   //static variable
	
	public void add()
	{
		int b =33;     //local variable 
		int c= a+b;
		System.out.println(c);    // can be used only with method
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(d);
	}
	public static void main(String[] args) {
		VariableDemo v = new VariableDemo();
		v.add();
		v.display();
	}

}
