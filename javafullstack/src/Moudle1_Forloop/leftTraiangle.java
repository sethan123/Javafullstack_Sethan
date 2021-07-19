package Moudle1_Forloop;

public class leftTraiangle {

	public static void main(String[] args) {
		int n=5;
		
		for (int i= n-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=0; j<=i; j++)  
			{
				System.out.print("*" + "");
			}System.out.println();
		}
		
}
}