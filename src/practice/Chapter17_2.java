package practice;

abstract class Ab1 {
	int x = 10;
	int y = 20;
	
	public abstract void method1();
	
	public void method2() {
		System.out.println(y);
	}
}

class Sub17_2 extends Ab1 {
	public void method1() {
		System.out.println(x);
	}
}

public class Chapter17_2 {
	public static void main(String[] args) {
		Ab1 a = new Sub17_2();
		a.method1();
		a.method2();
		
		System.out.println("----------------------");
		Sub17_2 sub = (Sub17_2)a;
		sub.method1();
		sub.method2();
	}
}
