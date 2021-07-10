package trywith.resources.improvement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;

public class Java7OrderARM {
	
	public static void main(String...strings) {
		try (BufferedReader br = new BufferedReader(new FileReader("/home/sundeep/java-9-features/read-file-operation.txt")); java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(FileSystems.getDefault().getPath("/home/sundeep/java-9-features/write-file-operation.txt"), Charset.defaultCharset())) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
