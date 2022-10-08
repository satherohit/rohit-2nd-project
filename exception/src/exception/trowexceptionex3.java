package exception;

public class trowexceptionex3 {
	static int sum(int num1,int num2) {
		if (num1==0) {
			throw new ArithmeticException("first paarmeter is not valid");
		}else {
			System.out.println("both parameter are corrcect!!");
			return num1+num2;
		}
		
	}
	public static void main(String[] args) {
		int res=sum(0,12);
		System.out.println(res);
		System.out.println("continue next statement");
	}

}
