package Main;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza();
		p1.setSize(12);
		p1.setType("슈퍼슈프림");
		
		Pizza p2 = new Pizza();
		p2.setSize(24);
		p2.setType("포테이토");
		
		Pizza p3 = new Pizza();
		p3.setSize(12);
		p3.setType("불고기");
		
		p1.toprint();
		p2.toprint();
		p3.toprint();
		System.out.println("수정1차");
	}

}
