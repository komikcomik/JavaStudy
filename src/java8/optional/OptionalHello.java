package java8.optional;

import java.util.Optional;

/**
 * オプショナルのお勉強
 * @author komikcomik
 *
 */
public class OptionalHello {
	public static void main(String[] args) {
		String nullです = null;
		String nullじゃないよ = "abc";

		if (Optional.ofNullable(nullです).equals(Optional.empty())) {
			System.out.println("nullでした");
		} else {
			System.out.println("nullじゃなかったよ");
		}

		if (Optional.ofNullable(nullじゃないよ).equals(Optional.empty())) {
			System.out.println("nullでした２");
		} else {
			System.out.println("nullじゃなかったよ２");
		}

		Optional.ofNullable(nullです).ifPresent(s -> System.out.println(s));
		Optional.ofNullable(nullじゃないよ).ifPresent(s -> System.out.println(s));

	}

}
