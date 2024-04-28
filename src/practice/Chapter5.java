package practice;

// 実行クラス
public class Chapter5 {
	int a = 10; // クラスに属するメンバ変数(a)
	
	public static void main(String[] args) {
		int b = 100; // メソッドに属するローカル変数(b)
		Chapter5 num = new Chapter5();
		num.show();
	}
	
	void show() {
		int c = 1000; // メソッドに属するローカル変数(c)
		
		System.out.println("変数aは" + a + "です。");
		// System.out.println("変数bは" + b + "です。");
		System.out.println("変数cは" + c + "です。");
	}
}
