package arrayprograms;

public class Reverse {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		System.out.println("elemnts in forward direction");
		for(int i=0;i<=arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("elements in reverse order");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}

	}

}
