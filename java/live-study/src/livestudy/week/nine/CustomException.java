package livestudy.week.nine;

public class CustomException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	CustomException(String msg){
		super(msg);
	}
	CustomException(String msg, int num){
		super(msg);
		System.out.println(num);
	}

}
