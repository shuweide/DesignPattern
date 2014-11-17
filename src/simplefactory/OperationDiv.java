package simplefactory;
/**
 * 大話設計模式 Chapter1 簡單工廠模式 練習
 * @author shuwei
 *
 */
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
