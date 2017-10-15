package java8.methodref;

import java.util.ArrayList;
import java.util.List;

/**
 * メソッド参照のお勉強。
 * 関数型IFの変数にメソッドを代入することが出来る。
 * 関数型IFの(唯一の）抽象メソッド呼ばれたらこの代入（指定した）メソッド実行してね言ってるイメージだと思います。
 * @author komikcomik
 *
 */
public class MethodRef {

	public static void main(String[] args) {
		/* 引数なしの場合 */
		// SampleFunctionalIFの抽象IFであるmethodAが呼ばれたら代わりにこのクラスのメソッドhelloを実行してねといっているイメージ
		System.out.println("-----例1-----");
		SampleFunctionalIF if1 = MethodRef::hello;
		System.out.println(if1.methodA());

		/* 引数１個の場合 */
		// この辺はリストに適当に値詰めてるだけ
		System.out.println("-----例2-----");
		List<String> l = new ArrayList<>();
		l.add("hoge");
		l.add("hogehoge");
		l.forEach(System.out::println); // 関数型IFであるListの抽象メソッドの実装をSystem.out.println(s)と指定しているイメージ
		l.forEach(MethodRef::echo); // 1つ上と似たような感じだけど自作メソッドも当然代入できる


		/* 引数２個の場合 */
		System.out.println("-----例3-----");
		SampleFunctionalIF2 if2 = MethodRef::join;
		System.out.println(if2.methodA("Hello", "World"));

	}

	public static String hello() {
		System.out.println("helloメソッド呼ばれたよ");
		return "hello";

	}

	public static String join(String A, String B) {
		return A + B;

	}

	public static void echo(String s) {
		System.out.println(s);
	}
}
