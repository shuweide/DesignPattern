package decorator;

/**
 * 大話設計模式 Chapter 6 - 裝飾模式 練習
 * @author shuwei
 *
 */

//實現Decorator 
class Finery extends Person {
	
	protected Person component;
	
	//打扮
	public void Decorate(Person component){
		this.component = component;
	}
	
	@Override
	public void Show(){
		if(this.component != null){
			this.component.Show();
		}
	}
	
}
