package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCashContext {

	@Test
	public void test() {
		
		//SetUp
		double totalPrices = 0d;
		
		//Test
		CashContext csuper;
		
		//正常收費
		csuper = new CashContext("正常收費");
		org.junit.Assert.assertEquals("faliure--正常收費總計錯誤"+csuper.toString(), 1000d, csuper.GetResult(1000d), 0);
		
		//滿300送100
		csuper = new CashContext("滿300送100");
		org.junit.Assert.assertEquals("faliure--滿300送100總計錯誤"+csuper.toString(), 700d, csuper.GetResult(1000d), 0);
		
		//打8折
		csuper = new CashContext("打8折");
		org.junit.Assert.assertEquals("faliure--打8折總計錯誤"+csuper.toString(), 800d, csuper.GetResult(1000d), 0);
		
		
		//Tear Down
		
		
	}

}
