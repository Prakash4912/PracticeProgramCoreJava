package test;

public class Thursday1 {
	
	public void rec_area()
	{
		int l = 34;
		int b = 56;
		int area = l*b;
		System.out.println("Area of rectangle is "+area);
	}

	
	public void rec_peri()
	{
		int l =44;
		int b = 12;
		int per = 2*l+b;
		System.out.println("Perimeter of rectanhgle is "+per);
	}
	public static void main(String[] args) {
		
		Thursday1 t1 = new Thursday1();
		t1.rec_area();
		t1.rec_peri();
	}
}
