import java.util.Scanner;
class Fibonnaci {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the input for Fibonnaci Series");
	int num = scanner.nextInt();

	//for 3 output is 0,0,1
	//for 5 output is 0,0,1,2,3
	int dummy1 = 1;
	int dummy2 = -1;
	int relult;
	for(int i = 0; i<num; i++) {
		result = dummy1+dummy2;
		dummy2 = dummy1;
		dummy1 = result;
		System.out.print(result + " " );
	}
	}
}