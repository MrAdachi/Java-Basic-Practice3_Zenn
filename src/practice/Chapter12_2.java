package practice;

// スーパークラス
class ExClass {
	public void increase(int i) { // 引数を10倍にするメソッド
		int x = i * 10;
		System.out.println(x);
	}
}

// サブクラス
class SubExClass extends ExClass {
	@Override
	public void increase(int i) {
		int x = i * 1000;
		System.out.println(x);
	}
}

// 実行クラス
public class Chapter12_2 {
	public static void main(String[] args) {
		// サブクラスのインスタンス化
		SubExClass sub = new SubExClass();
		sub.increase(5);
	}
}
