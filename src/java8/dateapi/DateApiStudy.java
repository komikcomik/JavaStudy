package java8.dateapi;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * java.timeパッケージの日付APIのお勉強
 * @author komikcomik
 *
 */
public class DateApiStudy {

	public static void main(String[] args) {

		/* とりあえず現在時刻を取得してみる */
		System.out.println("---------------------検証1 現在時刻を使って適当に表示-----------------------");
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("とりあえず出力　【" + zonedDateTime + "】"); // 何も考えずに出力

		/* 使いそうな年月日時分秒ミリ秒とか */
		System.out.println("年　【" + zonedDateTime.getYear() + "】");
		System.out.println("月　【" + zonedDateTime.getMonthValue() + "】"); // getMonth()はOCTOBERとかが返ってくるので注意
		System.out.println("日　【" + zonedDateTime.getDayOfMonth() + "】");
		System.out.println("時　【" + zonedDateTime.getHour() + "】");
		System.out.println("分　【" + zonedDateTime.getMinute() + "】");
		System.out.println("秒　【" + zonedDateTime.getSecond() + "】");
		System.out.println("ミリ秒以下　【" + zonedDateTime.getNano() + "】");
		System.out.println("ミリ秒だけ　【" + zonedDateTime.getLong(ChronoField.MILLI_OF_SECOND) + "】");
		System.out.println("UTC分の＋時間みたいなのを出したい場合　【" + zonedDateTime.getOffset() + "】");

		/* 指定した時間を作る */
		System.out.println("---------------------検証2 指定した時間を作る-----------------------");
		ZonedDateTime shiteiTime = ZonedDateTime.of(2017, 10, 19, 16, 58, 59, 123456789, ZoneId.systemDefault());
		System.out.println("とりあえず出力２　【" + shiteiTime + "】"); // 何も考えずに出力

		/* 定番のStringに変換 */
		System.out.println("---------------------検証3-----------------------");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.nnnnnnnnn");
		System.out.println("ミリ秒まで整形して出す　【" + shiteiTime.format(dtf1) + "】");
		System.out.println("ナノ秒まで整形して出す　【" + shiteiTime.format(dtf2) + "】");

		/* StringからLocalDateTimeオブジェクトに変換 */
		System.out.println("---------------------検証4 StringからLocalDateTimeへ変換-----------------------");
		String dateStr = "2017/10/19 16:58:59.123456789";
		LocalDateTime ldt = LocalDateTime.parse(dateStr, dtf2);
		if (ldt.equals(shiteiTime.toLocalDateTime())) {
			System.out.println("StringからLocalDateTimeへ変換したものと一致=" + ldt);
		} else {
			System.out.println("StringからLocalDateTimeへ変換したものと不一致");
		}

		/* StringからZonedDateTimeオブジェクトに変換 */
		System.out.println("---------------------検証5 StringからZonedDateTimeへ変換-----------------------");
		String dateStrWithTimeZone = "2017/10/19 16:58:59.123456789 JST";
		DateTimeFormatter dtfWithTimeZone = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.nnnnnnnnn zzz");
		ZonedDateTime zdt = ZonedDateTime.parse(dateStrWithTimeZone, dtfWithTimeZone);
		if (zdt.equals(shiteiTime)) {
			System.out.println("StringからZonedDateTimeへ変換したものと一致=" + zdt);
		} else {
			System.out.println("StringからZonedDateTimeへ変換したものと不一致");
		}

		/* java.util.Dateへ変換 */
		System.out.println("---------------------検証5 java.util.Dateへ変換-----------------------");
		Date date = Date.from(shiteiTime.toInstant());
		System.out.println(date);

		/* 月末とか計算する */
		System.out.println("---------------------検証6 YearMonthで月末を計算-----------------------");
		YearMonth ym = YearMonth.from(ldt);
		System.out.println("月末=" + ym.atEndOfMonth());
		ym = YearMonth.from(ldt.minusMonths(1));
		System.out.println("先月末=" + ym.atEndOfMonth());
		ym = YearMonth.from(ldt.plusMonths(1));
		System.out.println("来月末=" + ym.atEndOfMonth());

		System.out.println("---------------------検証7 TemporalAdjustersで月初と月末を計算-----------------------");
		System.out.println(ldt.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(ldt.with(TemporalAdjusters.lastDayOfMonth()));
	}
}