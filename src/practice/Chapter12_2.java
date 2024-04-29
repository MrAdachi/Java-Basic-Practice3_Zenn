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
	
	public void increase2(int i) {
		super.increase(i); // スーパークラスのメソッドを呼び出す
	}
}

// 実行クラス
public class Chapter12_2 {
	public static void main(String[] args) {
		// サブクラスのインスタンス化
		SubExClass sub = new SubExClass();
		sub.increase(5);
		sub.increase2(5); // スーパークラスのメソッドを呼び出すメソッドの呼び出し
	}
}
