package exception;

public class finallyblock {
	public static void main(String[] args) {
		try {
			System.out.println("the value:");
			for (int i=1;i<=3;i++) {
				System.out.println(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("the finally block always executes");
		}
	}

}
