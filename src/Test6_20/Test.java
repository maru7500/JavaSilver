package Test6_20;

class Maru{
	public static void say() {
		System.out.println("Maruuuuuuuuuu");
	}
}

public class Test extends Maru {
	public static void say() {
		System.out.println("Testtttttttttt");
	}
	
	public static void main(String[] args) {
		Maru[] aaa = {new Maru(), new Test()};
//		staticにポリモフィズムは採用されず、変数宣言時に指定されたクラス側のメソッドが呼び出される。
//		今回の場合、Maruクラスのメソッドが２回呼び出される形になる
		for(Maru a : aaa) {
			a.say();
		}
		new Test().say();
	}
}
