package trywith.resources.improvement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InJava7And9ARM {

	public static void main(String... strings) throws IOException {
		ARM_Before_Java9();
		ARM_Java9();
	}

	static void ARM_Before_Java9() throws IOException{
		BufferedReader reader1 = new BufferedReader(new FileReader("/home/sundeep/java-9-features/read-file-operation.txt"));
		try (BufferedReader reader2 = reader1) {
			System.out.println(reader2.readLine());
		}
	}

	static void ARM_Java9() throws IOException{
		BufferedReader reader1 = new BufferedReader(new FileReader("/home/sundeep/java-9-features/read-file-operation.txt"));
		try (reader1) {
			System.out.println(reader1.readLine());
		}
	}

}
