package java8.staticIfAndDefaultIf;

/**
 * StaticIFとデフォルトメソッドのテスト用（Java8お勉強中）
 * @author komikcomik
 *
 */
public interface StaticIF {

	/** デフォルトメソッドです */
	public default void helloDefault() {
		System.out.println("hello Default");
	}

	/** 普通のメソッドです */
	public void hello();

	/** Staticメソッドです */
	public static void helloStatic() {
		System.out.println("hello static");
	}

}