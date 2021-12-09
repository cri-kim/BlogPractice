package week.eight;

public interface DefineInterface {
	public static final String CHICKEN_BRAND="KYOCHON";
	
	int CHICHEN_MOO_PRICE = 500; //public static final 생략
	
	public abstract void order(String chickenType);
	
	int getPrice(); //public abstract 생략
	
}
