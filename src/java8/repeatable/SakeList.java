package java8.repeatable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * 適当な自作アノテーション。
 * Sakeの配列を持っていて、これで繰り返しsakeアノテーションが使える。
 * @author komikcomik
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SakeList {
	Sake[] value();
}

