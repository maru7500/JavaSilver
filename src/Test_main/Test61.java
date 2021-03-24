package Test_main;

class Maru{
	Maru(String s, int i){}
}

class Takeshi extends Maru{
	double d;
	Takeshi(String s, int i, double d){
		super(s,i);
		this.d = d;
		System.out.println(s + "hello" + i);
	}
}

public class Test61 {

	public static void main(String[] args) {
		new Takeshi("hey!! ", 5, 10.0);
	}

}
