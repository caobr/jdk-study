package extendsDemo;

/**
	 
*/
public class TestExtends{
	public static void main(String[] args){
		//����ʲô����͵���ʲô����ķ��� LittleCat
		LittleCat lc1 = new LittleCat();
		lc1.eat("������");
		lc1.eatFather("������Father");
		Cat lc2 = new LittleCat();
		lc1.eat("������");
		//����ʲô����͵���ʲô����ķ��� LittleCat
		Cat cat = new Cat();
		cat.eat("������");
 
	}
} 

class LittleCat extends Cat{ 
	void eatFather(String s){
		super.eat(s);
	}
	void eat(String s){
		System.out.println("СèҪ���̣������ҳ�"+s);
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
		System.out.println("һ��Ժü��ٷ�"+s);
	}
}