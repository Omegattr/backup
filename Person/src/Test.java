/**
 *
 */

/**
 * @author testuser
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako= new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		// phoneNumber 追加
		// address 追加
		Person tomoki = new Person();
		tomoki.name = "吉田智樹";
		tomoki.address = "東京都港区";
		tomoki.phoneNumber = "090123415";
		System.out.println(tomoki.name);
		System.out.println(tomoki.address);
		System.out.println(tomoki.phoneNumber);

		Person momoko = new Person();
		momoko.age = 22;
		momoko.phoneNumber="12314125";
		momoko.address = "大阪府梅田";
		System.out.println(momoko.address);
		System.out.println(momoko.age);
		System.out.println(momoko.phoneNumber);

        // name 指定してください
		Person tanaka =new Person();
		tanaka.name="田中俊樹";
		tanaka.run();

		hanako.run();
		taro.talk();
		jiro.walk();

 // Robot
		Robot aibo =new Robot();
		aibo.name="アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo =new Robot();
		aibo.name="アシモ";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot pepper =new Robot();
		aibo.name="ペッパー";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot doraemon =new Robot();
		aibo.name="ドラえもん";
		aibo.talk();
		aibo.walk();
		aibo.run();

//コンストラクタ
		Person p=new Person();


	}

}
