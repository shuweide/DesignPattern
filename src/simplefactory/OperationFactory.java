package simplefactory;
/**
 * 大話設計模式 Chapter1 簡單工廠模式 練習
 * @author shuwei
 *
 */
public class OperationFactory {

	public static Operation createOperation(String operate){
		Operation oper = null;
		switch (operate){
			case "+":
				oper = new OperationAdd();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OperationDiv();
				break;
		}
		return oper;
	}
}
