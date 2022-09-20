package paramsDemo;

public class Tes{
	public static void main(String[] args){
		int i = 10;
		changeNum(i);
		System.out.println(i); //10
		
		String str = "周二";
		changeString(str);
		System.out.println(str); // 
		Dog dg = new Dog();
		Dog dog = new Dog("小白",5);
		System.out.println(dog.getName());
		changeDog(dog);
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
	}
	
	static void changeNum(int num){
		num = 20;
		System.out.println(num); //20
	}
	
	static void changeString(String newStr){
		newStr = "还以为是周三";
		System.out.println(newStr); // 
	}
	static void changeDog(Dog d){
		d.setAge(11);
		d.setName("变成了小灰灰");
		System.out.println(d.getName());
	}
	
}


class Dog{
	{System.out.println("构造代码块");}
	public Dog(){}
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	private int age = 6;
	private String name = "黑仔";
	
	
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
		System.out.println("只吃狗粮"+s);
	}
	
	static{System.out.println("静态代码块");}  //静态代码块在类实例时最先调用
}