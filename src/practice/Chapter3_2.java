package practice;

// 設計図クラス
class Curry2 {
	String name = "カレー";
	
	public String taste() {
		return "スパイシーでおいしい";
	}
}

// 実行クラス
public class Chapter3_2 {
	public static void main(String[] args) {
		// Curryクラスのインスタンス化
		Curry2 curry = new Curry2();
		
		// Curryクラスのフィールド値を参照
		System.out.println(curry.name);
		
		// Curryクラスのメソッドを実行
		System.out.println(curry.taste());
	}
}
