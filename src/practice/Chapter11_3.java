package practice;

// 設計図クラス
class Student {
	public static String race;
	public String name;
	public int age;
	public void Self(String mess) {
		System.out.println("名前は" + name);
		System.out.println("年齢は" + age);
		System.out.println("自己紹介 : " + mess);
		System.out.println("国籍 : " + race);
		System.out.println("-------------------------");
	}
}

// 実行クラス
public class Chapter11_3 {
	public static void main(String[] args) {
		Student.race = "日本人";
		
		Student tanaka = new Student();
		Student suzuki = new Student();
		
		tanaka.name = "田中";
		tanaka.age = 29;
		
		suzuki.name = "鈴木";
		suzuki.age = 25;
		
		tanaka.Self("田中です");
		suzuki.Self("鈴木です");
	}
}
