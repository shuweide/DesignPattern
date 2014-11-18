package decorator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDecorator {

	
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
	public void test1() {
		
		Person xc = new Person("小菜");
		
		//測試第一種裝扮
		
		Sneakers sk = new Sneakers();
		BigTrouser bt = new BigTrouser();
		TShirts ts = new TShirts();
		
		sk.Decorate(xc);
		bt.Decorate(sk);
		ts.Decorate(bt);
		ts.Show();
		
		org.junit.Assert.assertEquals("faliure--裝扮顯示錯誤","大T恤 垮褲 破球鞋 裝扮的小菜", outContent.toString());
		
	}

	@Test
	public void test2() {
		
		Person xc = new Person("阿呆");
		
		//測試第二種裝扮
		
		Sneakers sk = new Sneakers();
		Suit st = new Suit();
		TShirts ts = new TShirts();
		
		sk.Decorate(xc);
		st.Decorate(sk);
		ts.Decorate(st);
		ts.Show();
		
		org.junit.Assert.assertEquals("faliure--裝扮顯示錯誤","大T恤 西裝 破球鞋 裝扮的阿呆", outContent.toString());
		
	}
	
}
