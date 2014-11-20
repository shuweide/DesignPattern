package proxy;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestProxy {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}	
	
	
	@Test
	public void test() {
	
		
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("李嬌嬌");
		String expectStr = "";
		Proxy daili = new Proxy(jiaojiao);
		
		daili.GiveDolls();
		expectStr = expectStr + "李嬌嬌 送你洋娃娃\r\n";
		org.junit.Assert.assertEquals("faliure--送禮顯示錯誤",expectStr, outContent.toString());
		
		daili.GiveFlowers();
		expectStr = expectStr + "李嬌嬌 送你鮮花\r\n";
		org.junit.Assert.assertEquals("faliure--送禮顯示錯誤",expectStr, outContent.toString());
		
		daili.GiveChocolate();
		expectStr = expectStr + "李嬌嬌 送你巧克力\r\n";
		org.junit.Assert.assertEquals("faliure--送禮顯示錯誤",expectStr, outContent.toString());
		
		
	}

}
