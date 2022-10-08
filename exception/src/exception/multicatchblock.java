package exception;

public class multicatchblock {
public static void main(String[] args) {
	try {
		int a[]=new int[7];
		a[4]=30/0;
		System.out.println("First print statement in try block");
	}catch (ArithmeticException e){
		System.out.println("Warning :ArithmeticException");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Warning : some other exception");
	}catch(Exception e) {
		System.out.println("warning:Some Other exception");
	}System.out.println("out of try-catch block");
}
}
