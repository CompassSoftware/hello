import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		
		Hello.main(null);
		
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
		
		String s = baos.toString();
		if (! "Hello, world.\n".equals(s))
			fail("Not yet implemented");
	}

}
