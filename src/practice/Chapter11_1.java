package practice;

class InstanceStatic {
    //インスタンス変数の宣言と初期化
    int instanceVal = 10;
    
    //static変数の宣言と初期化
    static int staticVal = 100;
    
    //インスタンスメソッドの宣言
    void instanceMethod(){
      System.out.println(instanceVal);
    }
    
    //staticメソッドの宣言
    static void staticMethod(){
      System.out.println(staticVal);
    }
}

public class Chapter11_1 {
	public static void main(String[] args) {
		// InstanceStaticクラスのstatic変数を呼び出し
		System.out.println(InstanceStatic.staticVal);
		
		// InstanceStaticクラスのstaticメソッドを呼び出し
		InstanceStatic.staticMethod();
		
		// InstanceStaticクラスをインスタンス化しx1に代入
		InstanceStatic x1 = new InstanceStatic();
		
		// x1のインスタンス変数を呼び出し
		System.out.println(x1.instanceVal);
		
		// x1のインスタンスメソッドを呼び出し
		x1.instanceMethod();
		
		x1.instanceVal = 100;
		
		// InstanceStaticクラスをインスタンス化しx2に代入
		InstanceStatic x2 = new InstanceStatic();
		
		// x2のインスタンス変数を呼び出し
		/* instanceValはインスタンスごとに生成されているため、
		 　x1で上書きしたinstanceValの値は、x2には反映されていない。
		*/ 
		System.out.println(x2.instanceVal);
		
		System.out.println(x1.instanceVal);
	}
}
