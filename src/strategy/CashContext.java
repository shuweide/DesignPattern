package strategy;
/**
 * 大話設計模式 Chapter2 策略模式 練習
 * @author shuwei
 *
 */
class CashContext {
	
	CashSuper cs = null;
	
	public CashContext(String type){
		switch(type){
			case "正常收費":
				CashNormal cs0 = new CashNormal();
				cs = cs0;
				break;
			case "滿300送100":
				CashReturn cs1 = new CashReturn("300", "100");
				cs = cs1;
				break;
			case "打8折":
				CashRebate cs2 = new CashRebate("0.8");
				cs = cs2;
				break;
					
		}
	}
	
	public double GetResult(double money){
		return cs.acceptCash(money);
	}
	
}
