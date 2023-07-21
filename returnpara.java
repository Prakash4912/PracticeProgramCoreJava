package test;

public class returnpara {
public static double cal_area(double l,int b)
{
	return l*b;
}
public static void main(String[] args) {
	System.out.println(cal_area(3.3,2));
	double res= cal_area(2.2,4);              // is method se bhi print kar sakte ho
	System.out.println("area is "+res);
}
}
