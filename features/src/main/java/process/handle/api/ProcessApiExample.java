package process.handle.api;

import java.util.Optional;

public class ProcessApiExample {

	public static void main(String... strings) {
		long pid = ProcessHandle.current().pid();

		ProcessHandle currentProcess = ProcessHandle.current();
		System.out.println("PID: " + currentProcess.pid());

		Optional<ProcessHandle> processHandle = ProcessHandle.of(pid);
		boolean isAlive = processHandle.isPresent() && processHandle.get().isAlive();
		System.out.println(isAlive);
	}
}
