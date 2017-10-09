package java8.staticIfAndDefaultIf;

/**
 * StaticIFの実装クラス。
 * こっちはdefaultメソッドをオーバーライドしました。
 * @author komikcomik
 *
 */
public class StaticIFImplDefaultOverride implements StaticIF {
	@Override
	public void hello() {
		System.out.println("hello in ImplDefaultOverride");
	}

	public void helloDefault() {
		System.out.println("override default");

	}
}