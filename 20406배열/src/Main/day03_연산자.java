package Main;

import java.util.Scanner;

public class day03_������ {

	public static void main(String[] args) {
		 		
		int a ,b ; 
		a = 1;
		b = 2;
		System.out.println(a!=b);
		
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("�����Է�");
		int num =  sc.nextInt();
		if(num % 2 == 0)
			System.out.println(num + ": ¦��");
		else
			System.out.println(num+":Ȧ��");
		
		}
	}

}
