package practice;

// 抽象クラス（スーパークラス）
abstract class AbstractSuper {
	abstract void abMethod(); // 抽象メソッド
	public void method() {}; // 具象メソッド
}

// 具象クラス（サブクラス）
class AbstractSub extends AbstractSuper {
	void abMethod() {
		System.out.println("抽象メソッドのオーバーライド");
	} // 抽象メソッドはオーバーライド必須
}

public class Chapter15 {
	public static void main(String[] args) {
		AbstractSub sub = new AbstractSub();
		sub.abMethod();
	}
}
