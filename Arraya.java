package test;

public class Arraya {
	public static void main(String[] args) {
		
		int arr[] = {22,22,22,33,44,55,66,};
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		System.out.println(arr[6]);
		System.out.println();
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
           System.out.println();
           for(int t:arr)
           {
          System.out.println(t);
           }
	}

}
