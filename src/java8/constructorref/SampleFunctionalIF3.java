package java8.constructorref;

/**
 * 適当な関数型IF(総称型引数あり、独自Beanが戻り値）
 * @author komikcomik
 *
 */
@FunctionalInterface
public interface SampleFunctionalIF3 {

	SampleBean methodA(String A, String B);

}
