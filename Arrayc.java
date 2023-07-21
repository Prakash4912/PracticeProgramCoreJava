package test;

public class Arrayc {
	;public void display(char c[],int a)
	{
		for (char t:c)
		{
			System.out.println(t);
			
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		char ch[]= {'a','b','c','d','e'};
		Arrayc a = new Arrayc();
		a.display(ch,22);
	}

}
