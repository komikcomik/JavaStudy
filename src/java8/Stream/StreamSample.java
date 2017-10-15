package java8.Stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Streamのお勉強。Intのストリーム。
 * @author komikcomik
 *
 */
public class StreamSample {
	public static void main(String[] args) {

		// ストリームを作って、中で一連の処理をやってもらうみたいな感じ
		IntStream is = IntStream.of(1000, 123, 456, 1001, 10000, 919, 561, 2000);
		// 1000以上のデータを抽出して、ソートする、その後標準出力
		is.filter(i -> i >= 1000).sorted().forEach(i -> System.out.println(i));

		// 1文字でないデータを除去→ソート→標準出力
		Stream<String> strStream = Stream.of("A", "b", "C", "d", "AAA", "BBB", "E");
		strStream.filter(s -> s.length() == 1).sorted().forEach(s -> System.out.println(s));
	}
}
