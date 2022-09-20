/**
   单例模式：只类加载时在内存中创建且仅创建一次对象的设计模式，防止频繁创建对象导致内存开销飙升。
   比如一些工具类数据库连接等，只需要创建一次，所有需要调用的地方共享这一单例对象。
   
   懒汉：在程序调用时先判断是否创建（判空），若已创建直接返回该对象，否则先创建对象。
   饿汉：类加载时就创建好对象，不需要等到被调用时才创建。程序调用时直接返回该单例对象，
   实现方法：1、构造方法私有化(private)。2、声明一个私有化类对象。3、提供公共方法getInstance()返回实例对象供外部使用。
*/
public class TestSingleton{
	public static void main(String[] args){
		//dog、dog1、dog2是同一个对象，内存地址都相同
		Dog dog = Dog.getInstance("妮妮",5); 
		System.out.println(dog); 
		Dog dog1 =Dog.getInstance("歌是",15);
		System.out.println(dog1);
		Dog dog2 = Dog.getInstance("人",25);
		System.out.println(dog2);
	}
	 
}


class Dog{
	private Dog(){}
	private Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	private static Dog dog;
	/*懒汉式*/
	public static Dog getInstance(String name,int age){
		 if(dog == null){
			dog = new Dog(name,age);
		}
		System.out.println(dog);
		return dog;
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
		System.out.println("只吃狗粮"+s);
	}
}