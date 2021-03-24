package Sample8_6;

class Exp extends Exception{
	private int num;
	public void setNum(int num) {this.num = num;}
	public int getNum(){return this.num;}
}

public class Sample {
	public static void main(String[] args) {
		try {
			int num = -10;
			checkNum(num);
		}catch(Exp t) {
			System.out.println("不正な値です。：" + t.getNum());
		}
	}

	public static void checkNum(int num) throws Exp{
		if (num >= 0) {
			System.out.println("OK");
		}else{
			Exp x = new Exp();
			x.setNum(num);
			throw x;
		}
	}
}
