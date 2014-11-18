package decorator;

/**
 * 大話設計模式 Chapter 6 - 裝飾模式 練習
 * @author shuwei
 *
 */

//實現ConcreteComponent

class Person {
	
	public Person(){
		
	}
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void Show(){
		System.out.print("裝扮的" + name);
	}
	
}
