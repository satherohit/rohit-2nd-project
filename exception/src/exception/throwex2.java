package exception;

import java.io.IOException;

public class throwex2 {
void mymethod(int num)throws IOException,
ClassNotFoundException{
	if(num==1)
throw new IOException("Exception message1");
	else
		throw new ClassNotFoundException("Exception message2");
}
}
