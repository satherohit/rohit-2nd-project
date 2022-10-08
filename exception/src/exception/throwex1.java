package exception;

public class throwex1 {
	static void throwMethod()throws NullPointerException{
		System.out.println("Inside throwMethod");
		throw new NullPointerException("demo");
		
	}
	public static void main(String[] args) {
		try {
			throwMethod();
		}catch(NullPointerException exp) {
			System.out.println("the exception get caught"+exp);
		}
	}

}
