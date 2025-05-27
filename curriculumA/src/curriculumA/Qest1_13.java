package curriculumA;

public class Qest1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問題1
		byte b; //バイト型
		short s; //短整数型
		int i; //整数型
		long l; //長整数型
		float f; //単精度浮動小数点数型
		double d; //倍精度浮動小数点数型
		char c; //文字型
		String st; //文字列型
		boolean bo; //ブーリアン型

		//問題2 初期値
		byte b1 = 0;
		short s1 = 0;
		int i1 = 0;
		long l1 = 0L;
		float f1 = 0.0f;
		double d1 = 0.0;
		char c1 = '\u0000';
		String st1 = null;
		boolean bo1 = false;

		//問題3
		byte myByte = 20;
		short myShort = 10;
		int myInt = 11110;
		long myLong = 10000000000L;
		float myFloat = 3.14f;
		double myDouble = 10.5;
		char myChar = 'a';
		String myString = "ハロー";
		boolean isjavaFun = true;

		//問題4
		System.out.println("11110" + "\t\t" + myInt);
		// 11110
		System.out.println("20" + "\t\t" + myByte);
		// 20
		System.out.println(myChar + " " + myString + " " + isjavaFun);
		// a ハロー true
		System.out.println("1" + "1" + "1" + "3" + "0");
		// 11130
		System.out.println(myLong * 1);
		// 10000000000
		System.out.println(myDouble / 100);
		// 0.105
		System.out.println(myShort - 100);
		// -90

		//問題5
		int num1 = 23;
		int num = Integer.parseInt("20"); // 文字列を整数に変換
		System.out.println("ハローJAVA" + (num + num1));

		//問題6
		String greeting = "初めまして";
		String name = "山田太郎";
		System.out.println(greeting + name + "です");
		// 名前
		int age = 18;
		System.out.println("年齢は" + age + "歳です");
		// 年齢
		double height = 170.5;
		System.out.println("身長は" + height + "㎝です");
		// 身長
		double weight = 62.2;
		System.out.println("体重は" + weight + "㎏です");
		// 体重
		String likeEat = "寿司";
		System.out.println("好きな食べ物は" + likeEat + "です");
		// 好きな食べ物

		//問題7
		double height1 = height / 100; //㎝→ｍに変更
		double bmi = weight / (height1 * height1); // BMI計算
		System.out.printf("BMIは %.1f です\n", bmi);

		//問題8
		String greeting1 = "初めまして";
		String name1 = "鈴木一郎";
		System.out.println(greeting1 + name1 + "です");
		// 名前
		int age1 = 24;
		System.out.println("年齢は" + age1 + "歳です");
		// 年齢
		double height2 = 168.5;
		System.out.println("身長は" + height2 + "㎝です");
		// 身長
		double weight1 = 64.2;
		System.out.println("体重は" + weight1 + "㎏です");
		// 体重
		String likeEat1 = "オムライス";
		System.out.println("好きな食べ物は" + likeEat1 + "です");
		// 好きな食べ物
		double height3 = height2 / 100; //㎝→ｍに変更
		double bmi1 = weight1 / (height3 * height3); // BMI計算
		System.out.printf("BMIは %.1f です\n", bmi1);

		//問題9
		String greeting2 = "初めまして";
		String name2 = "鈴木一郎";
		System.out.println(greeting2 + name2 + "です");
		// 名前
		int age2 = 24;
		age2 += 24;
		System.out.println("年齢は" + age2 + "歳です");
		// 年齢
		double height4 = 168.5;
		height4 += 168.5;
		System.out.println("身長は" + height4 + "㎝です");
		// 身長
		double weight2 = 64.2;
		weight2 += 64.2;
		System.out.println("体重は" + weight2 + "㎏です");
		// 体重
		String likeEat2 = "オムライス";
		System.out.println("好きな食べ物は" + likeEat2 + "です");
		// 好きな食べ物
		double height5 = height4 / 100; //㎝→ｍに変更
		double bmi2 = weight2 / (height5 * height5); // BMI計算
		System.out.printf("BMIは %.1f です\n", bmi2);

		//問題10
		System.out.println(age1 >= 25);
		// 25歳以上であればtrue

		//問題11
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);
		// 文字列型に変換
		System.out.println("年齢は" + ageStr + "身長は" + heightStr + "体重は" + weightStr);

		//問題12
		int age3 = (int) Double.parseDouble(ageStr);
		int height6 = (int) Double.parseDouble(heightStr);
		// 整数型に変換
		System.out.println("年齢は" + age3 + "身長は" + height6);

		//問題13
		boolean result = (age >= 25 || height >= 160);
		// 年齢が25もしくは身長が160㎝以上であればtrue
		System.out.println(result);
	}
}
