package exception;

public class multicatchex2 {
	public static void main(String[] args) {
		int array[]= {20,10,30};
		int num1=15,num2=0;
		int sum=0;
		try {
			sum=num1/num2;
			System.out.println("the result is :"+sum);
			for (int i=0;i<10;i++) {
				System.out.println("The value of array are"+array[i]);
			}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("erroe 1:"+e);
			}catch(ArithmeticException e) {
				System.out.println("erre 2:+e");
			}
		}
	}
	

