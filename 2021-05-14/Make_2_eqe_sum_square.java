package SDE;

public class Make_2_eqe_sum_square {

	public static void missing_repeated(int arr[]) {
		
		int n = arr.length;
		int sum = (n*(n+1))/2;
		int square = (n*(n+1)*(2*n+1))/6;
		
		System.out.println(sum);
		System.out.println(square);
		for(int i = 0; i < arr.length; i++) {
			
			sum -= arr[i];
			square -= arr[i]*arr[i];
		
		}

		System.out.println(sum);
		System.out.println(square);

		int missing = (sum + square/sum)/2;
		System.out.println("missing "+missing);
		
		int repeating = missing - sum;
		System.out.println("repeating "+repeating);
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,4};
		missing_repeated(arr);
	}
}
