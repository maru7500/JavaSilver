package Test;

public class Test {
	int x = 3;
	static int y = 10;

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		Test obj = new Test();
		obj.printIt();
		obj.printIt(x);
	}

	Test() {
		x = x + 5;
	}

	static {
		y += y;
	}

	void printIt() {
		System.out.println(++y);
	}

	void printIt(int y) {
		System.out.println(++y);
	}
}
