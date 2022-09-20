package extendsDemo;

/**
	 
*/
public class TestExtends{
	public static void main(String[] args){
		//创建什么对象就调用什么对象的方法 LittleCat
		LittleCat lc1 = new LittleCat();
		lc1.eat("艾肯拿");
		lc1.eatFather("艾肯拿Father");
		Cat lc2 = new LittleCat();
		lc1.eat("艾肯拿");
		//创建什么对象就调用什么对象的方法 LittleCat
		Cat cat = new Cat();
		cat.eat("艾肯拿");
 
	}
} 

class LittleCat extends Cat{ 
	void eatFather(String s){
		super.eat(s);
	}
	void eat(String s){
		System.out.println("小猫要喝奶，不能乱吃"+s);
	}
}

class Cat{
	protected Cat(){}
	protected Cat(String name,int age){
		this.name = name;
		this.age = age;
	}
	private int age;
	private String name;
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	void eat(String s){
		System.out.println("一天吃好几顿饭"+s);
	}
}