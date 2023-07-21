package test;

public class Trianglepara {
	public void Triangle(int height, int breadth)
	{
		int area = height* breadth/2;
		System.out.println(height);
		System.out.println(breadth);
		System.out.println("Area of rectangle is "+area);
		
	}
	public static void main(String[] args) {
		Trianglepara t = new Trianglepara();
				t.Triangle(22, 44);
	}


}
