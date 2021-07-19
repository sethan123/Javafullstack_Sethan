package module1_Methods;

public class deci_to_bin {

	public static void main(String[] args) {
		int num=25;
		String bin="";
		while(num>0)
		{
			int rem=num%2;
			bin =rem+bin;
			num=num/2;
			
		}
		System.out.println(bin);
	}

}
