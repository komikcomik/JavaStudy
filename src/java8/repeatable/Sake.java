package java8.repeatable;

import java.lang.annotation.Repeatable;

/**
 * 適当な自作アノテーション。
 * SakeListってところで繰り返し登場するよって宣言する意味で@Repeatableをつけている。
 * @author komikcomik
 *
 */
@Repeatable(SakeList.class)
public @interface Sake {
	String name();

}
