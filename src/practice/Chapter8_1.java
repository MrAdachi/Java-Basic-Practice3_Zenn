package practice;

// 実行クラス
public class Chapter8_1 {
	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 10;
		
		if(var1 > var2) {
			System.out.println(var1 + "は" + var2 + "よりも大きい");
		} else if (var1 < var2){
			System.out.println(var1 + "は" + var2 + "よりも小さい");
		} else {
			System.out.println(var1 + "は" + var2 + "と等しい");
		}
	}
}
