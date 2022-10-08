package exception;

public class numberformatex {
	public static void main(String[] args) {
		try {
			String a="abc";
			int num=Integer.parseInt(a);
				System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("Number format exception occured");
	}

}
}