package proxy;
/**
 * 大話設計模式 Chapter 7 - 代理模式 練習
 * @author shuwei
 *
 */
class Proxy implements IGiveGift {

	
	Pursuit gg;
	public Proxy(SchoolGirl mm){
		gg = new Pursuit(mm);
	}
	
	@Override
	public void GiveDolls() {
		gg.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		gg.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		gg.GiveChocolate();
	}

}
