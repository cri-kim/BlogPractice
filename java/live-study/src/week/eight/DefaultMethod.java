package week.eight;

public class DefaultMethod implements Car{
	int price;
	public DefaultMethod() {
		price = 20000000;
	}
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void addOption(String option) {
		if(!option.isEmpty()) {
			price += 200000;
		}
	}
	
	//default 메소드도 오버라이드 가능
	@Override
	public double discount(int percent) {
		//우리가게는 기본에서 10만원 더 깎아줄거야
		return Car.super.discount(percent) - 100000;
	}

}

interface Car {
	public int getPrice();
	public void addOption(String option);
	//default로 선언하여 메소드 구현
	default double discount(int percent) {
		return getPrice() * (1- (percent * 0.01));
	}
	
	public static int bagagi(int hoguLevel) {
		//shout();
		return hoguLevel * 20000;
	}
//	private void shout() {
//		System.out.println("호구야!");
//	}
}