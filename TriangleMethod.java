package test;

public class TriangleMethod {

	public void tri_area()
	{
		int height = 99;
	    int breadth = 89;
	   int Area = height*breadth/2;
	   System.out.println("area of triangle is "+Area);
	}
	public static void main(String[] args) {
		TriangleMethod tm = new TriangleMethod();
		tm.tri_area();
		
	}
}
