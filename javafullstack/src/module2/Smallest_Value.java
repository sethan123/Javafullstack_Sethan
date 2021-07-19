package module2;

public class Smallest_Value {

	public static void main(String[] args) {
		int arr[]= {1,23,33,45,46,57,553,564,445,434,453,523,523,623,6,};
		
		int small =arr[0];
		
		for(int i=1 ; i<arr.length; i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println(small);

	}

}
