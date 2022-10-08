package exception;

public class arrayindexoutofbound {
public static void main(String[] args) {
	try {
		int a[]=new int[10];
		a[11]=9;
			
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("arrayindexoutofbound");
	}
	
}
}
