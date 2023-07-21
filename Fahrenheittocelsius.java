package test;

public class Fahrenheittocelsius {
	public void Far (double fahrenheit)
	{
		double celsius = (((fahrenheit-32)*5)/9);
		System.out.println(fahrenheit);
		System.out.println("fahrenheit to celsius is "+celsius);
	}
 public static void main(String[] args) {
	 Fahrenheittocelsius f = new Fahrenheittocelsius();
	 f.Far(22);
}
}




