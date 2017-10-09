package java8.staticIfAndDefaultIf;

/**
 * StaticIFを実装した2クラスを呼び出す人。
 * @author komikcomik
 *
 */
public class StaticIFCaller {

	public static void main(String[] args) {
		StaticIF staticIF = new StaticIFImpl();
		staticIF.hello(); // StaticIFImplで実装したのが出る。
		staticIF.helloDefault(); // StaticIFのdafaultメソッド分が出る。
		StaticIF.helloStatic(); // StaticIFのstaticメソッド分が出る。

		StaticIF staticIF2 = new StaticIFImplDefaultOverride();
		staticIF2.hello(); // StaticIFImplDefaultOverrideで実装したのが出る
		staticIF2.helloDefault(); // StaticIFの内容がoverrideされてStaticIFImplDefaultOverrideで実装したのが出てる。

	}
}
