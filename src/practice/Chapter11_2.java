package practice;

// 設計図クラス
class InstanceStatic11_2{
	// インスタンス変数
	int InstanceVal = 20;
	
	// static変数
	static int StaticVal = 100;
	
	// インスタンスメソッド
	void instanceMethod() {
		System.out.println(InstanceVal);
	}
	
	// staticメソッド
	static void staticMethod() {
		System.out.println(StaticVal);
	}
	
	// インスタンスメソッド → インスタンス変数(問題なし)
	int A() {
		return InstanceVal;
	}
	
	// インスタンスメソッド → static変数(問題なし)
	int B() {
		return StaticVal;
	}
	
	// staticメソッド → static変数(問題なし)
	static int C() {
		return StaticVal;
	}
	
	// staticメソッド → インスタンス変数(コンパイルエラー)
	//	static int D() {
	//		return InstanceVal;
	//	}
	
	// staticメソッド → インスタンス変数(インスタンス化すれば問題なし)
	static int D() {
		InstanceStatic11_2 y = new InstanceStatic11_2();
		return y.InstanceVal;
	}
}

// 実行クラス
public class Chapter11_2 {
	public static void main(String[] args) {
		InstanceStatic11_2 t = new InstanceStatic11_2();
		
		System.out.println(t.InstanceVal);
		System.out.println(InstanceStatic11_2.StaticVal);
		
		t.instanceMethod();
		InstanceStatic11_2.staticMethod();
		
		System.out.println(t.A());
		System.out.println(t.B());
		System.out.println(InstanceStatic11_2.C());
		System.out.println(InstanceStatic11_2.D());
	}
}
