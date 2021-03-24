package practice;

public class number {

	public static void main(String[] args) {
		for(int n = 0; n <= 100 ; n++) {
			if(n % 5 == 0) {
				System.out.println("yeah!!");
			}else if(n % 3 == 0) {
				System.out.println("nooooo!!!");
			}else {
				System.out.println(n);
			}
		}
	}
}
