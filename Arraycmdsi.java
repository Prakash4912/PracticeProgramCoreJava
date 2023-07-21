package test;

public class Arraycmdsi {
	public static void main(String[] args) {
		double P= Double.parseDouble(args[0]);
		double R = Double.parseDouble(args[0]);
		double T= Double.parseDouble(args[0]);
		
		double SI = P*R*T/100;
		
		System.out.println("Simple interest"+SI);
	}

}
