package exception;

public class nestedtrycatch {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("inside block1");
				int b=45/0;
				System.out.println(b);
			}catch(ArithmeticException e1) {
				System.out.println("Excption:e1");
			}
			try {
				System.out.println("inside block2");
				int b=45/0;
				System.out.println(b);
				
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Exception:e2");
		}System.out.println("just other statments");
	}catch(ArithmeticException e3) {
		System.out.println("Arithmetic EXception");
		System.out.println("inside parent try catch block");
	}catch(ArrayIndexOutOfBoundsException e4) {
		System.out.println("ArrayIndexOutOfBoundsException");
		System.out.println("inside parent try catch block");
		
	}catch(Exception e5) {
		System.out.println("Exception");
		System.out.println("Inside parent try catch block");
	}
	System.out.println("Next statement..");
}
	}
