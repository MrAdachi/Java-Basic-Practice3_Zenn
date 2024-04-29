package practice;

public class Chapter17_1 {
	public static void main(String[] args) {
		short x1 = 10;
		int y1 = x1;
		System.out.println(y1);
		
		System.out.println("-------------------------");
		
		int x2 = 20;
		Chapter17_1.method2(x2);
		
		System.out.println("-------------------------");
		
		double x3 = Chapter17_1.method3();
		System.out.println(x3);
		
		System.out.println("-------------------------");
		
		double x4 = 40.5;
		int y4 = (int)x4;
		System.out.println(y4);
		
		System.out.println("-------------------------");
		
		double x5 = 50.5;
		Chapter17_1.method5((int)x5);
		
		System.out.println("-------------------------");
		
		int x6 = Chapter17_1.method6();
		System.out.println(x6);
	}
	
	public static void method2(double x) {
		System.out.println(x);
	}
	
	public static int method3() {
		int x = 30;
		return x;
	}
	
	public static void method5(int x) {
		System.out.println(x);
	}
	
	public static int method6() {
		double x = 60.5;
		return (int)x;
	}
}
