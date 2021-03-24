package Silver;

public class SilverClass {
	int x = 3;
	static int y = 2;

	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		SilverClass obj = new SilverClass();
		obj.printIt(x);
		obj.printIt(y);

//		System.out.println("hey" + 1.0 + 5);
//		System.out.println("hey" + 1.0/5);
//		System.out.println("hey" + 1/5);


	}

	SilverClass() {
		x = x+1;
	}

	static {
		y += y;
	}

	void printIt() {
		System.out.println(++y);
	}

	void printIt(int x) {
		System.out.println(x++);
	}
}

 