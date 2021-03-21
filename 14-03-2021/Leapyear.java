import java.util.Scanner;
class Leapyear {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Input to check a year is Leap of not ");
	int userinput = scanner.nextInt();

	//2020 2100 is a leap year
	//1000 is a not leap year
	//2017 is not a leap year

	if((userinput % 4 == 0 && userinput % 100 != 0) || (userinput % 400 == 0)) {
		System.out.println(userinput+" is a Leapyear");
	}
	else {
	System.out.println(userinput+" is not a Leapyear");
	}
	}
}