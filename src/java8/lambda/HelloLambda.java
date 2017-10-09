package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * ラムダ式のお勉強
 * @author komikcomik
 *
 */
public class HelloLambda {

	public static void main(String[] args) {
		/* 例1。引数なしの簡単なやつをとりあえず動かしてみる */
		Runnable runner = () -> {
			System.out.println("初ラムダ式。今の所何が凄いのか分かってない。");
		};

		Thread t = new Thread(runner);
		t.start();

		/* 例2。引数ありの場合 */
		List<String> l = new ArrayList<>();
		l.add("hello");
		l.add("world");

		// ラムダっぽくしてみたぞ
		l.forEach(s -> {
			System.out.println("loop:" + s);
		});

		/* 上記捕捉：いきなりforEachメソッドの引数の所にラムダ式が出てきていて、最初書いておきながら？になりましたが、
		 * forEachメソッドの引数はConsumerっていう標準の@FunctionalInterfaceで、このConsumerの実装を記述してあげてると思えば良さそう。
		 */

		/* 例3。Consumerを実装した、自前のFunctionalInterface（関数型インターフェース）を使用した場合。もはやラムダではないが */
		l.forEach(new ConsumerImpl());

	}

}
