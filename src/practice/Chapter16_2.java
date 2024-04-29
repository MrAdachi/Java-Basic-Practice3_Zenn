package practice;

// スーパーインターフェース1
interface Interface16_2A {
	void method1();
}

//スーパーインターフェース2
interface Interface16_2B {
	void method2();
}

//サブインターフェース3
interface Interface16_2C extends Interface16_2A, Interface16_2B {
	void method3();
}

// インターフェースを実装したクラスの宣言
class InterClass implements Interface16_2C {
	public void method1() {
		System.out.println("Interface16_2A");
	} // スーパーインターフェースAのメソッド実装
	public void method2() {
		System.out.println("Interface16_2B");
	} // スーパーインターフェースBのメソッド実装
	public void method3() {
		System.out.println("Interface16_2C");
	} // スーパーインターフェースCのメソッド実装
}

// 実行クラス
public class Chapter16_2 {
	public static void main(String[] args) {
		InterClass ic = new InterClass();
		
		ic.method1();
		ic.method2();
		ic.method3();
	}
}
