import java.util.Scanner;
class Leapyear {
	public static void main(String args[]) {
	Scanner z = new Scanner(System.in);
	int userinput = z.nextInt();
	System.out.println("Enter the Input to check a year is Leap of not ");
	if(userinput % 4 == 0) System.out.println(userinput+" is a Leapyear");
	else System.out.println(userinput+" is not a Leapyear");
	}
}