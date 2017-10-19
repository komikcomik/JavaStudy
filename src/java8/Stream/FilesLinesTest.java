package java8.Stream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

/**
 * Streamを使ったファイル読み込みのお勉強
 * @author komikcomik
 *
 */
public class FilesLinesTest {

	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault();
		Path inputPath = fs.getPath("resouces/test.txt");

		/* ファイルの読み込み */
		try (Stream<String> stream = Files.lines(inputPath, StandardCharsets.UTF_8)) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		/* ファイルの書き込み */
		Path outputPath = fs.getPath("resouces/output.txt");
		try (BufferedWriter bw = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
			bw.write("あああああ\n");
			bw.write("いいいいい\n");
			bw.write("ううううう\n");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
