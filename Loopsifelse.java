package test;

public class Loopsifelse {
	public void check(int age) {
		
		if(age>=18)
		{
			System.out.println("u can vote");
		}
		else {
			System.out.println("u cant't vote");
		}
	}
		public static void main(String[]args) {
			Loopsifelse l = new Loopsifelse();
			l.check(34);
			l.check(18);
		}
	}


