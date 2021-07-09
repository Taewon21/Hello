package Main;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		int  score[] = new int[5];
		int sum = 0;
		double avg ;
		Scanner sc = new Scanner(System.in);
		for( int i=0 ; i<5 ; i++) {
			System.out.print("성적 입력 :");
			score[i] = sc.nextInt();
			sum = sum + score[i];
		  }
		
			System.out.println("합계 : " + sum );
			avg = sum/5.0 ;
			System.out.printf("평균:%1f" , avg);
			
		

	}

}
