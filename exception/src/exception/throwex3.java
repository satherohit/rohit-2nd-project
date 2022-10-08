package exception;

public class throwex3 {
static void checkEligibility(int stage ,int stuweight) {
	if(stage<12&&stuweight<40) {
		throw new ArithmeticException("student not eligible for resistration");
	}
}
public static void main(String[] args) {
	System.out.println("welcome to resistraton process");
	checkEligibility(10,39);
	System.out.println("have a nice day");
}
}
