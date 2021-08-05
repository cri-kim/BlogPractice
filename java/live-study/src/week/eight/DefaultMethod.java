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
	
	//default �޼ҵ嵵 �������̵� ����
	@Override
	public double discount(int percent) {
		//�츮���Դ� �⺻���� 10���� �� ����ٰž�
		return Car.super.discount(percent) - 100000;
	}

}

interface Car {
	public int getPrice();
	public void addOption(String option);
	//default�� �����Ͽ� �޼ҵ� ����
	default double discount(int percent) {
		return getPrice() * (1- (percent * 0.01));
	}
	
	public static int bagagi(int hoguLevel) {
		//shout();
		return hoguLevel * 20000;
	}
//	private void shout() {
//		System.out.println("ȣ����!");
//	}
}