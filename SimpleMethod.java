package test;

public class SimpleMethod {
	
	public void simple()
	{
		
		int P = 77;
        

       int R = 88; 

        int T = 10; 
        int SI = P*R*T/100;

        System.out.println("Simple interest"+SI);
	}
	
	public static void main(String[] args) {
		SimpleMethod sm = new SimpleMethod();
		sm.simple();
	}

}
