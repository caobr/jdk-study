package test_protect;

public class TestProtect {
	public static void main(String[] args){  
		Rat r = new Rat();
		r.crowl();
    }  
}

//由于子类与基类（父类）不在同一包中，所以在子类中，只有本类实例可以访问其从基类继承而来的protected方法。
//而在子类中不能访问基类实例（对象）（所调用）的protected方法。
//而在子类中也无法访问其他子类实例（即便相同父类的亲兄弟）所继承的protected修饰的方法。
/**
基类（父类）的protected成员（包括成员变量个成员方法）对本包内可见，并且对子类可见；
若子类与基类（父类）不在同一包中，那么在子类中，只有本类实例可以访问其从基类继承而来的protected方法，而在子类中不能访问基类实例（对象）（所调用）的protected方法。
不论是否在一个包内，父类中可以访问子类实例（对象）继承的父类protected修饰的方法。（子父类访问权限特点：父类访问域大于子类）
若子类与基类（父类）不在同一包中,子类只能在自己的类（域）中访问父类继承而来的protected成员，无法访问别的子类实例（即便相同父类的亲兄弟）所继承的protected修饰的方法。
若子类与基类（父类）不在同一包中，父类中不可以使用子类实例调用（父类中没有）子类中特有的（自己的）protected修饰的成员。（毕竟没有满足同一包内和继承获得protected成员的关系）

*/
class Rat extends A.Animal {
	public  void crowl(){  
		this.crowl("zhi zhi"); //没有问题，继承了Animal中的protected方法——crowl(String)  
		A.Animal ani=new A.Animal();
		//ani.crowl("animail jiaojiao"); //wrong, The method crowl(String) from the type Animal is not visible
		//Cat cat=new B.Cat();
		//cat.crowl("miao miao"); //wrong, The method crowl(String) from the type Animal is not visible
    }  
	
}