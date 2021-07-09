package Main;

import java.util.Scanner;

public class day03_연산자 {

	public static void main(String[] args) {
		 		
		int a ,b ; 
		a = 1;
		b = 2;
		System.out.println(a!=b);
		
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("숫자입력");
		int num =  sc.nextInt();
		if(num % 2 == 0)
			System.out.println(num + ": 짝수");
		else
			System.out.println(num+":홀수");
		
		}
	}

}
