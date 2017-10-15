package java8.constructorref;

/**
 * コンストラクタ参照のお勉強。
 * @author komikcomik
 *
 */
public class ConstructorRef {
	public static void main(String[] args) {

		// 引数有（String)の場合
		// 関数型IFで規定された抽象メソッドmethodAが呼ばれたタイミングでnew String("xyz")が呼ばれている
		System.out.println("-----例1-----");
		SampleFunctionalIF<String> sample = String::new;
		System.out.println(sample.methodA("xyz"));

		// 引数なし（String)の場合
		// 関数型IFで規定された抽象メソッドmethodAが呼ばれたタイミングでnew String()が呼ばれている
		// 空文字になってるからサイズは０
		System.out.println("-----例2-----");
		SampleFunctionalIF2 sample2 = String::new;
		String s2 = sample2.methodA();
		System.out.println(s2.length());

		// 引数２個の場合
		// 関数型IFで規定された抽象メソッドmethodAが呼ばれたタイミングで
		// new SampleBeanExt("hello","world")が呼ばれている
		System.out.println("-----例3-----");
		SampleFunctionalIF3 sample3 = SampleBeanExt::new;
		SampleBean bean = sample3.methodA("hello", "world");
		System.out.println("1:" + bean.getVal1());
		System.out.println("2:" + bean.getVal2());
	}
}
