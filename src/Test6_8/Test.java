package Test6_8;

class Maru {
	private int x;

	Maru(int i) {
		x = i;
		System.out.println("Maru" + x);
	}

	Maru() {
	}
}

public class Test extends Maru {

	public static void main(String[] args) {
		
		new Test(3);
		new Test();
	}

	Test(int i){
		super(i);
	}

	Test(){
		this(5);
		System.out.println("default");
	}

}
