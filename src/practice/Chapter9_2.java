package practice;

// 実行クラス
public class Chapter9_2 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		int total = 0;
		int[] number = {1, 2, 3, 4, 5};
		
		for(int score : number) {
			total += score;
		}
		System.out.println("合計 = " + total);
	}
}
