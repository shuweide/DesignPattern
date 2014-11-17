package simplefactory;

public class OperationDiv extends Operation {
	@Override
	public double GetResult() throws Exception{
		double result = 0;
		if( get_numberB() == 0)
			throw new Exception("除數不能為0");
		result = get_numberA() / get_numberB();
		return result;
	}
}
