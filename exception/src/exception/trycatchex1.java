package exception;

public class trycatchex1 {
	public static void main(String[] args) {
		
	
	int num1,num2;
	try { 
		num1=0;
		num2=62/num1;
		System.out.println("try block message");
	}catch (ArithmeticException e ) {
		System.out.println("error:don't divide a number by zero");
	}System.out.println("im out of try ctch block in java");
}

}
