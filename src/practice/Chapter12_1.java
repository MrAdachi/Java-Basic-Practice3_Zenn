package practice;

// スーパークラス
class Curry {
	void exShow() {
		System.out.println("カレーの作り方");
	}
}

// サブクラス
class CheeseCurry extends Curry {
	void exCheeseShow() {
		System.out.println("チーズカレーの作り方");
	}
}

// 実行クラス
public class Chapter12_1 {
	public static void main(String[] args) {
		CheeseCurry ins1 = new CheeseCurry(); // CheeseCurryクラスのインスタンス生成
		
		ins1.exShow(); // スーパークラスのメソッド呼び出し
		ins1.exCheeseShow(); // サブクラスのメソッド呼び出し
	}
}
