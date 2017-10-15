package java8.constructorref;

/**
 * SampleBeanExtをextendsしてデフォルトコンストラクタを作っただけのBean。
 * @author komikcomik
 *
 */
public class SampleBeanExt extends SampleBean {

	SampleBeanExt(String param1, String param2) {
		this.setVal1(param1);
		this.setVal2(param2);
		System.out.println("SampleBeanExtのコンストラクタが呼ばれました");
	}
}
