package Test8_3;

public class Test {

	public static void main(String[] args) {
		String[] num = {"まる","やま","たけし","だよ"};
		for (int i = 0; i < ４;++i) {
			try {
				System.out.print(num[i]);
				System.out.println(":" + (i + 1) + "回目");
			}catch(ArrayIndexOutOfBoundsException aaa) {
				System.out.println("例外発生");
			}finally {

				System.out.println("hey");
			}
		}
		System.out.println("end");
	}

}
