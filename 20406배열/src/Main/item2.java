package Main;

public class item2 {
	// 생성자
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

	// 속성
	String name;
	String code;
	static String company = "COUPANG";
	static int total = 0;
	int price;
	int count;

	// 메소드
	void printitem() {
		System.out.println(name + ":" + code + "" + price);
	}

	void printitemCount() {
		System.out.println(name + ":" + code + "" + price + "재고" + count);
	}

	void sell(int num) {
		if (num > count) {
			System.out.println(name + " 의 재고가 부족합니다.");
		} else {
			System.out.println(name +  num + " 개 판매완료 ");
			count = count - num;
			System.out.println(name + " 재고량 " + count);
			total = total - num;
		}
	}

	void additem(int num) {
		System.out.println(name + " " + num + "개의 수량 추가");
		count = count + num;
		printitemCount();
	}

	void printTotal() {
		System.out.println("현재 총 물량은 " + total + "입니다");
	}
}
