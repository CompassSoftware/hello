import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		// Redirect System.out to a sring
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		
		// Prep done, call function of interest
		Hello.main(null);
		
		// Restore the stdout stream
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
		
		// Check for desired result
		String s = baos.toString();
		if (! "Hello, Jay.\n".equals(s))
			fail("Not yet implemented");
	}

}
