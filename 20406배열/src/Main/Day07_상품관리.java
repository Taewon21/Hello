package Main;

import java.util.Scanner;

public class Day07_상품관리 {

	public static void main(String[] args) {

		item2 camera = new item2("canon ");
		camera.code = " A-54 ";
		camera.price = 600000;
		camera.printitem();

		item2 earphone = new item2("에어팟", " A-125 ", 190000);
		earphone.printitem();

		item2 computer = new item2("SamSung notebook", " AVCS-23 ", 1200000, 100);
		computer.printitem();
		Scanner sc = new Scanner(System.in);
		System.out.print("수량 입력 :");
		int num = sc.nextInt();
		computer.sell(num);
		computer.additem(100);

	}

}
