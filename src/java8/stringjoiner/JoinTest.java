package java8.stringjoiner;

import java.util.StringJoiner;

/**
 * Stringのjoinメソッドと、StringJoinerの勉強
 * @author komikcomik
 *
 */
public class JoinTest {

	public static void main(String[] args) {

		String[] strs = {"a","b","c"};
		String joinStr = String.join(",", strs);
		System.out.println(joinStr);

		StringJoiner sj = new StringJoiner(",");
		joinStr = sj.add("X").add("Y").add("Z").toString();
		System.out.println(joinStr);
	}

}
