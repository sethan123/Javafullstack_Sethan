package module1_Methods;

public class deci_to_oct {

	public static void main(String[] args) {
		int num=25;
		String bin="";
		while(num>0)
		{
			int rem=num%8;
			bin =rem+bin;
			num=num/8;
			
		}
		System.out.println(bin);
	}


}
