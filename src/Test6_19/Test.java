package Test6_19;

class Maru{
	Maru(){
		System.out.println("hey");
	}
	public void takeshi(int main) {
		System.out.println("numMain :" + main);
	}
}

class Yama extends Maru{
	public void takeshi(int sub) {
		System.out.println("numSub :" + sub);
	}	
}

public class Test {

	public static void main(String[] args) {
		Yama a = new Yama();
		a.takeshi(5);
	}

}
