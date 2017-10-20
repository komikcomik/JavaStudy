package java9.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Java9で追加されたStreamのAPIとかのお勉強
 * @author komikcomik
 *
 */
public class StreamJava9Sample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "C", "DD", "E", "FGH");
		List<String> list2 = Arrays.asList("A", "B", "C", "DD", "E", "FGH");

		/* dropwhileとtakeWhileやるよ */
		System.out.println("とりあえず何も考えずに出す");
		list.stream().forEach(System.out::print);

		System.out.println("\n2文字以上のものはスキップしてから出す");
		list.stream().dropWhile(str -> str.length() >= 2).forEach(System.out::print);

		System.out.println("\nlist2は最初が1文字から始まってからこいつに適用しても結果として何も変わらない");
		list2.stream().dropWhile(str -> str.length() >= 2).forEach(System.out::print);

		System.out.println("\ntakeWhileも似たような感じ");
		list.stream().takeWhile(str -> str.length() >= 2).forEach(System.out::print);

		/* Stream.ofNullableやるよ */
		List<String> list3 = Arrays.asList("A", "B", null, "DD", "E", "FGH");
		System.out.println("\n文字サイズ出します");
		// Stream.ofNullableしない例
		try {
			list3.stream().forEach(str -> System.out.println(str.length()));
		} catch (NullPointerException nullpo) {
			System.out.println("想定通りぬるぽ！");
		}

		// Stream.ofNullableする例（なお、Stream.ofNullable(str)をStream.ofNullable(str.length())とかやったら
		// ぬるぽで落ちます。あくまでofNullableの引数がNULLだったら飛ばすってだけなので。
		list3.stream().flatMap(str -> Stream.ofNullable(str)).forEach(str -> System.out.println(str.length()));
	}

}
