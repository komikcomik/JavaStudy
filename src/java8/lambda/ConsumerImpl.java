package java8.lambda;

import java.util.function.Consumer;

/**
 * ConsumerIFを実装してみたクラス。
 * @author komikcomik
 *
 */
public class ConsumerImpl implements Consumer<Object> {

	@Override
	public void accept(Object t) {
		System.out.println("Consumer実装したよ:" + t);
	}

}
