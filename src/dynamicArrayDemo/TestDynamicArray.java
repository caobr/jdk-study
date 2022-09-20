package dynamicArrayDemo; /**
	��̬����
*/
import java.util.Arrays;
 

public class TestDynamicArray{
	public static void main(String args[]){ 
		CatManager cm = new CatManager(2);
		
		//��name��Ϊ����
		cm.add(new Cat("С��",2)); 
		cm.add(new Cat("С��",5));
		
		//������ݣ�������ʼ���� �Զ�����
		Cat blue = new Cat("С��",1);
		cm.add(blue);
		//��ӡ��������
		cm.print();
		
		//����
		blue.setAge(11);
		cm.update(blue);
		System.out.println("���º�����");
		cm.print();
		
		
		//ɾ��һ��Ԫ��
		cm.delete("С��");
		System.out.println("ɾ��������");
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
			//����ռ�
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
				System.out.println("�ҵ���ȵ�");
				for(int j = i; j<count; j++){
					cats[j] = cats[j+1];
				}
				System.out.println("����Ϊ"+count);
				count--;
				System.out.println("����Ϊ"+count);
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
		System.out.println("ֻ��è��"+s);
	}
}