import java.util.Scanner;
class ReverseNum {
	public static void main(String args[]) {
	Scanner z = new Scanner(System.in);
	System.out.println("enter the input");
	int num = z.nextInt();
	int dummy = num;
	int a,b;
	int reversenum = 0;
	while(num != 0)
	{
		a = num%10;
		num = num/10;
		reversenum = ((reversenum*10) + a);		
	}	
	System.out.println(reversenum);
	}
}