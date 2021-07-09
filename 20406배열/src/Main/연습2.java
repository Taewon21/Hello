package Main;

public class ¿¬½À2 {

	public static void main(String[] args) {
		 for(int i = 5 ; i>= 0 ; i--) {
			for(int j =1 ; j<= i ; j++) 
				System.out.print("*" + "\t");
			System.out.println();
			
		}
		int i = 1 , sum =0 ;
		System.out.print("1-2+3-4+5-6+7-8+9-10=");
		while (i<= 10) {
			if(i % 2 ==0 ) sum-=1;
			else sum += i;
			i++;	
		}
	
		System.out.println(sum);
		
		for(i =1 ; i <= 10 ; i++ ) {
			if(i==5)continue ;
			System.out.print(i + "\t");
		}
	}
	

}
