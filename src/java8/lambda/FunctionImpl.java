package java8.lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

/**
 * 標準関数型インターフェースの１つFunctionを実装してみたクラス。
 * ただの劣化SimpleDateFormat・・・
 * @author komikcomik
 *
 */
public class FunctionImpl implements Function<String, Date>{

	@Override
	public Date apply(String t) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d = null;
		try {
			d = sdf.parse(t);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return d;
	}

}
