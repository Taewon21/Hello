package Main;

public class Day07_상품관리2 {

	public static void main(String[] args) {
		item2 phone = new item2("NOTE21" , "HZI4444" ,1200000 , 150);
		phone.printitem();
		
		
		item2 mouse = new item2("Logitech");
		mouse.printitemCount();
		System.out.println(mouse.company);
		phone.company = "SAMSUNG" ;
		System.out.println(phone.company);
		
		System.out.println(phone.company);
		
	}

}
