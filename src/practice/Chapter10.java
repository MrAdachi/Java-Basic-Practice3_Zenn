package practice;

public class Chapter10 {
	public static void main(String[] args) {
		String str1 = "helloworld"; // 100(address)
		String str2 = "hello"; // 200(address)
		str2 = str2 + "world"; // 300(address)
		String str3 = new String("helloworld"); // 400(address)
		String str4 = "helloworld"; // 100(address)
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("----------------------");
		
		// アドレス値の比較
		if(str1 == str2) {
			System.out.println("str1 == str2");
		}
		
		if(str1 == str3) {
			System.out.println("str1 == str3");
		}
		
		if(str1 == str4) {
			System.out.println("str1 == str4");
		}
		
		System.out.println("----------------------");
		
		// 文字列自体の比較
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2)");
		}
		
		if(str1.equals(str3)) {
			System.out.println("str1.equals(str3)");
		}
		
		if(str1.equals(str4)) {
			System.out.println("str1.equals(str4)");
		}
	}
}
