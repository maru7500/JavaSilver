package Test5_12;

class Maru{
	int x;
	void setX(int x) {this.x = x;}
	int getX() {return x;}
}

class Yama{
	Maru f;
	void setMaru(Maru f) {this.f = f;}
	Maru getMaru() {return f;}
}

public class Test {
	public static void main(String[] args) {
		Maru f1 = new Maru();
		Yama f2 = new Yama();
		int a = 10;
		f1.setX(a);
		f2.setMaru(f1);
		f2.getMaru().setX(100);
		System.out.println(f2.getMaru().getX());
	}

}
