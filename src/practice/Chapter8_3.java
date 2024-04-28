package practice;

// 実行クラス
public class Chapter8_3 {
	public static void main(String[] args) {
		int var = 3;
		
		switch(var) {
		case 0:
			System.out.println("varは0です");
			break;
			
		case 1:
			System.out.println("varは1です");
			break;
		
		case 2:
			System.out.println("varは2です");
			break;
			
		case 3:
			System.out.println("varは3です");
			break;
		
		// breakの記述なし → 下のcase文も実行される
		case 4:
			System.out.println("varは4です");
			
		case 5:
			System.out.println("varは5です");
			break;
			
		default:
			System.out.println("varは5より大きいです");
		}
	}
}
