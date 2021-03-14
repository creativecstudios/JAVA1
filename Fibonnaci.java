import java.util.Scanner;
class Fibonnaci {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the input for Fibonnaci Series");
	int num = scanner.nextInt();

	//for 3 output is 0,0,1
	//for 5 output is 0,0,1,2,3
	int a = 1;
	int b = -1;
	int c;
	for(int i = 0; i<num; i++) {
		c = a+b;
		b = a;
		a = c;
		System.out.print(c + " " );
	}
	}
}