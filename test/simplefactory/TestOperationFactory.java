package simplefactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOperationFactory {

	@Test
	public void test(){
		
		//Set Up
		Operation oper;
		
		
		//Test SuperClass Operation
		oper = new Operation();
		org.junit.Assert.assertEquals("failure -- Not Operation Class!", Operation.class, oper.getClass());
		try {
			org.junit.Assert.assertEquals(" SuperClass Result Error!", 0d, oper.GetResult(), 0);
		} catch (Exception e1) {}
		
		
		//Test Operation Add
		oper = OperationFactory.createOperation("+");
		org.junit.Assert.assertEquals("failure -- Not OperationAdd Class!", OperationAdd.class, oper.getClass());
		
		oper.set_numberA(5d);
		oper.set_numberB(5d);
		try {
			org.junit.Assert.assertEquals(" NumberA + NumberB Result Error!", 10d, oper.GetResult(), 0);
		} catch (Exception e) {
			
		}
		
		//Test Operation Sub
		oper = OperationFactory.createOperation("-");
		org.junit.Assert.assertEquals("failure -- Not OperationSub Class!", OperationSub.class, oper.getClass());
		
		oper.set_numberA(8d);
		oper.set_numberB(2d);
		try {
			org.junit.Assert.assertEquals(" NumberA - NumberB Result Error!", 6d, oper.GetResult(), 0);
		} catch (Exception e) {
			
		}
		
		//Test Operation Multiple
		oper = OperationFactory.createOperation("*");
		org.junit.Assert.assertEquals("failure -- Not OperationMul Class!", OperationMul.class, oper.getClass());
		oper.set_numberA(3.2d);
		oper.set_numberB(2d);
		try {
			org.junit.Assert.assertEquals(" NumberA * NumberB Result Error!", 6.4d, oper.GetResult(), 0);
		} catch (Exception e) {
			
		}		
		
		//Test Operation Div
		oper = OperationFactory.createOperation("/");
		org.junit.Assert.assertEquals("failure -- Not OperationDiv Class!", OperationDiv.class, oper.getClass());
		
		oper.set_numberA(3.2d);
		oper.set_numberB(2d);
		try {
			org.junit.Assert.assertEquals(" NumberA / NumberB Result Error!", 1.6d, oper.GetResult(), 0);
		} catch (Exception e) {
			
		}
		
		oper.set_numberA(3.2d);
		oper.set_numberB(0d);
		try {
			oper.GetResult();
		} catch (Exception e) {
			org.junit.Assert.assertEquals(" NumberA / NumberB Exception Message Error!", "除數不能為0", (String)e.getMessage());
		}		
		
		//Tear Down
		
	}
	
}
