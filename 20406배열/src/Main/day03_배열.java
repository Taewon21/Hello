package Main;

public class day03_배열 {

	public static void main(String[] args) {

		String[] str = new String[3];
		str[0] = "hello";
		str[1] = "java";
		str[2] = "World";

		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);

		System.out.println("참조형 변수 연습");
		int[] a = new int[3];
		int[] b = new int[] { 11, 22, 33 };

		a = b;
		a[0] = 99;
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);

	}

}
