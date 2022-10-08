package exception;

public class throwex2test {
	public static void main(String[] args) {
		try {
		throwex2 obj=new throwex2();
		obj.mymethod(1);
	}catch(Exception ex) {
		System.out.println(ex);
	}
	}
}
