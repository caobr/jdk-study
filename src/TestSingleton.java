/**
   ����ģʽ��ֻ�����ʱ���ڴ��д����ҽ�����һ�ζ�������ģʽ����ֹƵ�������������ڴ濪�������
   ����һЩ���������ݿ����ӵȣ�ֻ��Ҫ����һ�Σ�������Ҫ���õĵط�������һ��������
   
   �������ڳ������ʱ���ж��Ƿ񴴽����пգ������Ѵ���ֱ�ӷ��ظö��󣬷����ȴ�������
   �����������ʱ�ʹ����ö��󣬲���Ҫ�ȵ�������ʱ�Ŵ������������ʱֱ�ӷ��ظõ�������
   ʵ�ַ�����1�����췽��˽�л�(private)��2������һ��˽�л������3���ṩ��������getInstance()����ʵ�������ⲿʹ�á�
*/
public class TestSingleton{
	public static void main(String[] args){
		//dog��dog1��dog2��ͬһ�������ڴ��ַ����ͬ
		Dog dog = Dog.getInstance("����",5); 
		System.out.println(dog); 
		Dog dog1 =Dog.getInstance("����",15);
		System.out.println(dog1);
		Dog dog2 = Dog.getInstance("��",25);
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
	/*����ʽ*/
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
		System.out.println("ֻ�Թ���"+s);
	}
}