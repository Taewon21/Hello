package Main;

import java.util.Scanner;

public class Day07_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[5];
		int sum = 0;
		double avg ;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i <5 ; i++) {
			System.out.print("�����Է� :");
			score[i] = sc.nextInt();
			sum =sum + score[i];
		}
		System.out.println("�հ� : " +sum);
		avg = sum/5;
		System.out.println("���" + avg);
	}

}
