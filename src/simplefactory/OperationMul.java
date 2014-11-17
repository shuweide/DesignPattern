package simplefactory;
/**
 * 大話設計模式 Chapter1 簡單工廠模式 練習
 * @author shuwei
 *
 */
class OperationMul extends Operation {
	@Override
	public double GetResult(){
		double result = 0;
		result = get_numberA() * get_numberB();
		return result;
	}
}
