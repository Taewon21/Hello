package Main;

public class Day07_��ǰ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		item2 computer  = new item2("LG", "DFAD" ,  10000 , 10);
		computer.printTotal();
		item2 speaker  = new item2("BOSS", "ZXTGAW" ,  50000 , 20);
		speaker.printTotal();
		//������ �ȸ� total�� �پ��� �ض�
		speaker.sell( 5);
		speaker.printTotal();
	}

}
