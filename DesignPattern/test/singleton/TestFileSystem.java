package singleton;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestFileSystem {

	@Test
	public void returnSingleInstance() {
		
		FileSystem fs1 = FileSystem.getInstance();
		assertNotNull(fs1);
		
		FileSystem fs2 = FileSystem.getInstance();
		assertNotNull(fs2);
		
		assertEquals(fs1, fs2);
		
	}

}
