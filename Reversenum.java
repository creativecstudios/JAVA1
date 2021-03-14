import java.util.Scanner;
class ReverseNum {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the input");
	int num = scanner.nextInt();
	
	// input = 1234
	// output = 4321
	int reversenum = 0;
	while(num != 0)
	{
		int dummy = num%10;
		num = num/10;
		reversenum = ((reversenum*10) + dummy);		
	}	
	System.out.println(reversenum);
	}
}