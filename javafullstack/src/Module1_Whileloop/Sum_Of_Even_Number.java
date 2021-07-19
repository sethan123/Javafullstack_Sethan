package Module1_Whileloop;

public class Sum_Of_Even_Number {

	public static void main(String[] args) {
		int num =10;
		int i=1;
		int sum=0;
		while (i<=num)
		{
			if(i%2==0)
			{
			sum=i+sum;
			}
			i++;	
		}
		
		System.out.println(sum);
		
	}

	}

