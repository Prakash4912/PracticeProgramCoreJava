package test;

public class Nestedloop {
	public void check(int age, int weight)
	{
		if (age>18)
		{
			System.out.println("u are eligible to donate blood");
			if(weight>55)
			{
				System.out.println("u can donate now");
			}
			else
			{
				System.out.println("u cant't donate bcz of low weight");
			}
		}
		else
		{
			System.out.println("u r not eligible to donatw blood ");
		}
	}
	
		public static void main(String[]args)
		{
			Nestedloop n = new Nestedloop();
			n.check(21,77);
			n.check(25, 50);
		n.check(17, 55);
	}

}
