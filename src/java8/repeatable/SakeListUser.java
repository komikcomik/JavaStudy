package java8.repeatable;

import java.lang.annotation.Annotation;

@Sake(name = "翠露")
@Sake(name = "一吟")
@Sake(name = "龍泉八重桜")
/**
 * repeatableの勉強。
 * @author komikcomik
 *
 */
public class SakeListUser {

	public static void main(String[] args) {
		/* 最初に試したやり方 */
		Annotation[] anoList = SakeListUser.class.getAnnotationsByType(Sake.class);
		for (int i = 0; i < anoList.length; i++) {
			System.out.println(anoList[i]);
		}

		/* 教えていただいたやり方 */
		// Annotation[] ではなく Sake[] で取れる
		Sake[] Sakes = SakeListUser.class.getAnnotationsByType(Sake.class);
		for (int i = 0; i < Sakes.length; i++) {
		    // Sake#name() はメソッドとして呼べる
		    System.out.println(Sakes[i].name());
		}

	}

}
