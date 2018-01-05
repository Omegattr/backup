package person2;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

/*
		Person2 taro = new Person2();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
*/

//Person プロジェクト
		Person2 p = new Person2();

		Person2 taro = new Person2();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person2 jiro = new Person2("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		//15ページ
        //コンストラクト③
		Person2 saburo = new Person2();
		saburo.name="saburo";
		saburo.age=0;
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		//コンストラクト④
		Person2 nanasi = new Person2("名前なし", 25);
		System.out.println(nanasi.name);
		System.out.println(nanasi.age);

		//コンストラクト⑤
		Person2 hanako = new Person2(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);


	}

}
