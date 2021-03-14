import java.util.Scanner;
class Leapyear {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int userinput = scanner.nextInt();
	System.out.println("Enter the Input to check a year is Leap of not ");
	if((userinput % 4 == 0) || (userinput % 100 != 0) || (userinput % 400 == 0)) System.out.println(userinput+" is a Leapyear");
	else System.out.println(userinput+" is not a Leapyear");
	}
}