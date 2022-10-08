package exception;

public class arithmeticexceptionx {
public static void main(String[] args) {
	try {
		int num1=30,num2=0;
		int output=num1/num2;
		System.out.println("result="+output);
	}catch(ArithmeticException e) {
		System.out.println("arithmeic exception:you can't divide by zero");
	}
}
}
