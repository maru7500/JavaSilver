package Test8_3;

class Maru{
	void loop() throws ArrayIndexOutOfBoundsException{
		int[] Yama = {20,40,60};
		for(int i = 0; i < 3; i++) {
			System.out.println(Yama[i] + ":" + (i + 1) + "回目");
		}
	}

}


public class Test2 {

	public static void main(String[] args) {
		try {
			Maru obj = new Maru();
			obj.loop();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外だ");
		}finally {
			System.out.println("hey");
		}
	}

}
