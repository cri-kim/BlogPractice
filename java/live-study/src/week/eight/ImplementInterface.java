package week.eight;

interface Delivery {
	void setDelivery(String member);
}

public class ImplementInterface implements DefineInterface, Delivery{
//�������̽��� ��ӹ����� ������ �־��� �߻� �޼ҵ���� �������־���Ѵ�.
	
	private int price;
	public ImplementInterface() {
		//�츮�� ġŲ �⺻ ������ 8000�� �̴�.
		price = 8000;
	}

	@Override
	public void order(String chickenType) {
		switch (chickenType) {
		case "hot":
			//�ſ�ҽ��� 1000���� �� �޴´�.
			price+=1000;
			break;
		case "black":
			//���ҽ��� 1500���̴�.
			price+=1500;
			break;
		default:
			//�������� �⺻�����̴�.
			break;
		}
	}

	@Override
	public int getPrice() {
		//������ ��ȯ�Ѵ�.
		return price;
	}
	
	public void takeOut() {
		//����ũ�ƿ��� ġŲ�� ���� ��ŭ �������ش�.
		price -= CHICHEN_MOO_PRICE;
	}
	
	@Override
	public void setDelivery(String member) {
		//��� ��ü�� ���� ������ �߰��Ѵ�.
		switch(member) {
			case "baemin":
				price += 2000;
				break;
			case "coupang":
				price += 3000;
				break;
			case "baemin-1":
				price += 3000;
				break;
			case "yogiyo":
				price += 1900;
				break;
			default:
				price +=1500;
		}
	}
}
