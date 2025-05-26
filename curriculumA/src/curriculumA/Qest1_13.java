package curriculumA;

public class Qest1_13 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		byte myByte=20;
		short myShort=10;
		int myInt=11110;
		long myLong=10000000000L;
		float myFloat=3.14f;
		double myDouble=10.5;
		char myChar='a';
		String myString="ハロー";
		boolean isjavaFun=true;
		
		System.out.println("11110" +"\t\t"+myInt);
		// 11110
		System.out.println("20" +"\t\t"+myByte);
		// 20
		System.out.println(myChar+" "+myString+" "+isjavaFun);
		// a ハロー true
		System.out.println("1"+"1"+"1"+"3"+"0");
		// 11130
		System.out.println(myLong*1);
		// 10000000000
		System.out.println(myDouble/100);
		// 0.105
		System.out.println(myShort-100);
		// -90
		//問題4
		
		int num1=23; 
		int num = Integer.parseInt("20"); // 文字列を整数に変換
		System.out.println("ハローJAVA"+(num+num1));
		//問題5
		
		String greeting ="初めまして";
		String name ="鈴木一郎";
		System.out.println(greeting+name+"です");
		// 名前
		int age =24;
		age+=24;
		System.out.println("年齢は"+age+"歳です");
		// 年齢
		double height =168.5;
		height+=168.5;
		System.out.println("身長は"+height+"㎝です");
		// 身長
		double  weight =64.2;
		weight+=64.2;
		System.out.println("体重は"+weight+"㎏です");
		// 体重
		String likeEat ="オムライス";
		System.out.println("好きな食べ物は"+likeEat+"です");
		// 好きな食べ物
		//問題9
		
		double height1 =height/100; //㎝→ｍに変更
		double bmi =weight/(height1*height1); // BMI計算
		System.out.printf("BMIは %.1f です\n",bmi);
		//問題7
		
		System.out.println(age >=25);
		// 25歳以上であればtrue
		//問題10
		
		String ageStr=String.valueOf(age);
		String heightStr=String.valueOf(height);
		String weightStr=String.valueOf(weight);
		// 文字列型に変換
		System.out.println("年齢は"+ageStr+"身長は"+heightStr+"体重は"+weightStr);
		//問題11
		
		int height2=(int) Double.parseDouble("337.0");
		int weight1=(int) Double.parseDouble("128.4");
		// 整数型に変換
		System.out.println("身長は"+height2+"体重は"+weight1);
		//問題12
		
		boolean result=(age>=25 || height >=160);
		// 年齢が25もしくは身長が160㎝以上であればtrue
		System.out.println(result);
		//問題13
	}
}

