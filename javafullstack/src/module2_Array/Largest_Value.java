package module2_Array;

public class Largest_Value {

	public static void main(String[] args) {
		int[] arr = {12,333,55,56,46,45,6,546,45,3};
		int large=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > large)
			
				large = arr[i];
			
			
		}
		System.out.println(large);	
	}

}
