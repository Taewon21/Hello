package Main;

public class item2 {
	// ������
	item2(String name) {
		this.name = name;

	}

	item2(String name, String code, int price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}

	item2(String name, String code, int price, int count) {
		this.name = name;
		this.code = code;
		this.price = price;
		this.count = count;
		total = total + count;
	}

	// �Ӽ�
	String name;
	String code;
	static String company = "COUPANG";
	static int total = 0;
	int price;
	int count;

	// �޼ҵ�
	void printitem() {
		System.out.println(name + ":" + code + "" + price);
	}

	void printitemCount() {
		System.out.println(name + ":" + code + "" + price + "���" + count);
	}

	void sell(int num) {
		if (num > count) {
			System.out.println(name + " �� ��� �����մϴ�.");
		} else {
			System.out.println(name +  num + " �� �ǸſϷ� ");
			count = count - num;
			System.out.println(name + " ��� " + count);
			total = total - num;
		}
	}

	void additem(int num) {
		System.out.println(name + " " + num + "���� ���� �߰�");
		count = count + num;
		printitemCount();
	}

	void printTotal() {
		System.out.println("���� �� ������ " + total + "�Դϴ�");
	}
}
