package test;

public class Arrayd {
	public static double[] add()
	{
		double d[] = {1.2,3.2,3.4,3.4,3.2};
		return d;
	}

	
	
	public static void main(String[] args) {
		double res[] = add();
				for(double t :res)
				{
					System.out.println(t);
				}
	}

}
