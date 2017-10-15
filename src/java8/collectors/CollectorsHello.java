package java8.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectorsのお勉強
 * @author komikcomik
 *
 */
public class CollectorsHello {

	public static void main(String[] args) {

		// 文字列のストリームを結合してStringにしている、その際に区切り文字と先頭文字、末尾文字を付与している
		Stream<String> s = Stream.of("1", "2", "3", "4", "5", "6", "7");
		String ss = s.collect(Collectors.joining("-", "先頭", "末尾"));
		System.out.println(ss);

	}

}