package practice;

// インターフェース
interface Interface {
	public static final int x = 10;
	public abstract void method();
}

// 実装クラス
class InterfaceClass implements Interface {
	public void method() {
		System.out.println(x);
	};
}

// 実行クラス
public class Chapter16_1 {
	public static void main(String[] args) {
		InterfaceClass ifc = new InterfaceClass();
		ifc.method();
	}
}
