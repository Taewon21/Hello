package Main;

import java.util.Scanner;

public class day04_���� {

	public static void main(String[] args) {
		int year , code ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����⵵:");
		year = sc.nextInt();
		System.out.println("�����ڵ�:");
		code = sc.nextInt();
		
		System.out.print("����� ���̴� "+ (2021-year + 1 ) + " ���̰�");
		
		switch (code) {
		case 1 : case 3 :
			System.out.println("�����Դϴ�");
			
			break;
		case 2 : case 4 :
			System.out.println("�����Դϴ�");
		default:System.out.println("�ܰ����Դϴ�");
			break;
		}

	}

}
