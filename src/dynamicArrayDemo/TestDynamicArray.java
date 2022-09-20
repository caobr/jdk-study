package dynamicArrayDemo; /**
	动态数组
*/
import java.util.Arrays;
 

public class TestDynamicArray{
	public static void main(String args[]){ 
		CatManager cm = new CatManager(2);
		
		//将name作为主键
		cm.add(new Cat("小白",2)); 
		cm.add(new Cat("小黑",5));
		
		//添加数据，超过初始长度 自动扩容
		Cat blue = new Cat("小蓝",1);
		cm.add(blue);
		//打印数组数据
		cm.print();
		
		//更新
		blue.setAge(11);
		cm.update(blue);
		System.out.println("更新后数据");
		cm.print();
		
		
		//删除一个元素
		cm.delete("小黑");
		System.out.println("删除后数据");
		cm.print();
	}
}


class CatManager{
	private int count = 0;
	private Cat cats[] = null;
	
	public CatManager(){}
	public CatManager(int length){
		 cats = new Cat[length];
	}
	
	public void add(Cat c){
		//System.out.println("count" + count + "length" +cats.length);
		if(count >= cats.length){
			//扩充空间
			int newLen = cats.length *2; 
			cats = Arrays.copyOf(cats, newLen); 
		}
		cats[count] = c;
		count++;
		//System.out.println("count" + count + "length" +cats.length);
	}
	
	public void update(Cat c){
		for(int i = 0; i<count; i++){
			if(cats[i].getName().equals(c.getName())){
				cats[i].setAge(c.getAge());
			}
		}
		
	}
	
	public void delete(String name){
		for(int i = 0; i<count; i++){
			System.out.println("//////////////////"+i);
		
			if(cats[i].getName().equals(name)){
				System.out.println("找到相等的");
				for(int j = i; j<count; j++){
					cats[j] = cats[j+1];
				}
				System.out.println("长度为"+count);
				count--;
				System.out.println("长度为"+count);
				break;
			}
		}
		
		
	} 
	public void print(){
		for(int i = 0;i< count;i++){
			System.out.println(cats[i].getName() + cats[i].getAge());
		}
	}
}



class Cat{
	public Cat(){}
	public Cat(String name,int age){
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
		System.out.println("只吃猫粮"+s);
	}
}