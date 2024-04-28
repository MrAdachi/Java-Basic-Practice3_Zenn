package practice;

// 設計図クラス
class Test4_1 {
	// private修飾子のインスタンス変数
	private int A;
	
	// public修飾子のコンストラクタ
	public Test4_1(int B) {
		A = B;
	}
	
	// public修飾子のメソッド
	public int getB() {
		return A;
	}
}

// 実行クラス
public class Chapter4_1 {
	public static void main(String[] args) {
		// インスタンス化
		Test4_1 t = new Test4_1(10);
		// System.out.println(t.A); コンパイルエラー
		System.out.println(t.getB());
	}
}
