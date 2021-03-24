package Test8_15;

import java.io.IOException;

public class Test extends Vehicle {
	int speed = 0;
	int year = 2000;
	int price = 0;

	public static void main(String[] args) {
//		Test a = new Test();
		System.out.println("my car status");
//		System.out.println(a.speed);
	}
	int getPrice() {
		return price;
	}
	int getYear() throws NullPointerException{
		return year;
	}
//	int getSpeed() throws IOException{ 
//	checked例外はスーパークラスの方にもthrows定義しないとコンパイルエラーになるのかな
//	以下のようにunchecked例外なら問題なし
	int getSpeed() throws NullPointerException{
		return speed;
	}
}

class Vehicle{
	int getPrice() throws IOException{
		return 50000;
	}
	int getYear() {
		return 2010;
	}
	int getSpeed() {
//	int getSpeed() throws IOException{
		return 60;
	}
}