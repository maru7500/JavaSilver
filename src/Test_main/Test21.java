package Test_main;

public class Test21 {

	public static void main(String[] args) {
		int a = 100;
		int b = ++a;
		System.out.println("a:"+ a);
		System.out.println("b:"+b);
		System.out.println("------------");
		int c = b++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("------------");
		int d = ++c;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println((a < b) ? (b < c) : (c < d) ? b : c);

	}

}
