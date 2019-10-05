package arrayprograms;

public class SumOfArray {
	static int arr[] = {1,2,3,4};
	
	public static void sum(){
		int sum=0,i;
		for(i=0;i<arr.length;i++){
			sum+=arr[i];
			return sum;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("sum of the two numbers are  "+sum());
		
		
}


}
