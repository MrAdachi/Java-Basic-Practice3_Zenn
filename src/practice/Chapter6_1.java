package practice;

// 実行クラス
public class Chapter6_1 {
	public static void main(String[] args) {
		String a = new String("abc");
		String b = a;
		String c = new String("abc");
		String d = new String("abc");
		String e = "abc";
		String f = "abc";
		
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(e == f);
	}
}
