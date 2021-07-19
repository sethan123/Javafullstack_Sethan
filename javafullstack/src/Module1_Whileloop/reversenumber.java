package Module1_Whileloop;

public class reversenumber {

	public static void main(String[] args) {
		int num=123456789;
		int rev=0;
		
		while(num>0)
		{
			int last =num%10;
			rev = rev*10 +last;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}
