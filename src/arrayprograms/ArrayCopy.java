package arrayprograms;

public class ArrayCopy {

	public static void main(String[] args) {
		int a1[] = new int[]{1,2,3,4,5,6};
		int a2[]= new int[a1.length];
		for(int i=0;i<=a1.length;i++){
			a2[i]=a1[i];
		}
		for(int i=0;i<=a1.length;i++){
			System.out.println("origingal array is "+a1[i]);
		}
		for(int i=0;i<=a2.length;i++){
			System.out.println("copied array is "+a2[i]);
		}
			
			

	}

}
