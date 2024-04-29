package practice;

// スーパークラス
class SuperClass13_2 {
	private int val;
	
	// コンストラクタ
	public SuperClass13_2(int a) {
		val = a;
	}
	
	public void getVal() {
		System.out.println(val);
	}
}

// サブクラス
class SubClass13_2 extends SuperClass13_2 {
	// コンストラクタ
	public SubClass13_2() {
		super(10); // ← superの指定が無い場合は、super()が自動で実行される。
	}
}

public class Chapter13_2 {
	public static void main(String[] args) {
		SubClass13_2 sub = new SubClass13_2();
		sub.getVal();
	}
}
