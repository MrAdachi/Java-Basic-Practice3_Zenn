package practice;

// 実行クラス
public class Chapter9_1 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 5) {
			System.out.println(i);
			i ++; // 増減値
		}
		
		System.out.println("---------------");
		
		int j = 6;
		
		do {
			System.out.println(j);
			j ++; // 増減値
		} while(j < 5);
	}
}
