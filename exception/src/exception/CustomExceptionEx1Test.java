package exception;

public class CustomExceptionEx1Test {
	public static void main(String[] args) {
		try {
			throw new CustomExceptionEx1("Custom");
		}catch(CustomExceptionEx1 exp) {
			System.out.println("this is my catch box");
			System.out.println(exp);
		}
	}

}
