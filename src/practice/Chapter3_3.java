package practice;

// 実行クラス
public class Chapter3_3 {
	void status(String name, String country) {
		System.out.println("名前は" + name);
		System.out.println("国は" + country);
	}
	
	void status(String name) {
		System.out.println("名前は" + name);
		System.out.println("国は" + "日本");
	}
	
	public static void main(String[] args) {
		Chapter3_3 ins1 = new Chapter3_3();
		ins1.status("田中太郎");
	}
}
