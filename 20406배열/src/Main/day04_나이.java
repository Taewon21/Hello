package Main;

import java.util.Scanner;

public class day04_나이 {

	public static void main(String[] args) {
		int year , code ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도:");
		year = sc.nextInt();
		System.out.println("성별코드:");
		code = sc.nextInt();
		
		System.out.print("당신의 나이는 "+ (2021-year + 1 ) + " 세이고");
		
		switch (code) {
		case 1 : case 3 :
			System.out.println("남자입니다");
			
			break;
		case 2 : case 4 :
			System.out.println("여자입니다");
		default:System.out.println("외계인입니다");
			break;
		}

	}

}
