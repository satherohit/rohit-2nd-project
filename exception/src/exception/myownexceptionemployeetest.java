package exception;

public class myownexceptionemployeetest {
static void employeeAge(int age)throws myownexception{
	if (age<0) {
		throw new myownexception ("age can't be lass than zero");
	}else {
		System.out.println("input is invalid");
	}
}public static void main(String[] args) {
	try {
		employeeAge(-2);
	}catch(myownexception e) {
		e.printStackTrace();
	}
}
}
