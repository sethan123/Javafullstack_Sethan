package module1_Methods;

public class returning_value_odd_or_even {

	static boolean check(int num)
	{
		if(num%2==0)
		return true;
		else
			return false;
	}
		
	public static void main(String[] args) {

		System.out.println(check(15));
		System.out.println(check(20));

	}

}
