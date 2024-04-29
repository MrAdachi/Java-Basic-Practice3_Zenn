package practice;

//設計図クラス
class SetNumber {
	private int num1;
	private int num2;
	
	// int型の引数を持つコンストラクタ①
	SetNumber(int i){
		this.num1 = 100;
		this.num2 = i;
	}
	
	// 引数を持たないコンストラクタ②
	SetNumber(){
		this.num1 = 100;
		this.num2 = 1;
	}
	
	public void getNumber() {
		System.out.println(num1);
		System.out.println(num2);
	}
}


// 実行クラス
public class Chapter13_1 {
	public static void main(String[] args) {
		// 引数を渡しているのでコンストラクタ①が呼び出される
		SetNumber numA = new SetNumber(1000);
		
		// 引数を渡していないのでコンストラクタ②が呼び出される
		SetNumber numB = new SetNumber();
		
		numA.getNumber();
		numB.getNumber();
	}
}
