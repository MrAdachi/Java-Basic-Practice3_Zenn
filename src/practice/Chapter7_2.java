package practice;

public class Chapter7_2 {
	public static void main(String[] args) {
		String[][] s = {{"1-1","1-2"},{"2-1","2-2"},{"3-1","3-2"}};
		
		s[2][1] = "A";
		
		System.out.println(s[2][1]);
		System.out.println("行方向の要素数：" + s[0].length);
		System.out.println("列方向の要素数：" + s.length);
	}
}
