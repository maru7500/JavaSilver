package practice;

public class fizzbuzz {

	public static void main(String[] args) {
		int A = 19;
		if(A % 3 == 0 && A % 5 ==0){
			System.out.println("3と5の倍数です");
		}else if(A % 5 == 0){
			System.out.println("5の倍数です");
		}else if(A % 3 == 0){
			System.out.println("3の倍数です");
		}else {
			System.out.println("3の倍数でも５の倍数でもありません");
		}
	}
}