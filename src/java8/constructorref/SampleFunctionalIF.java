package java8.constructorref;

/**
 * 適当な関数型IF(総称型引数あり）
 * @author komikcomik
 *
 */
@FunctionalInterface
public interface SampleFunctionalIF<T> {

	String methodA(T object);

}