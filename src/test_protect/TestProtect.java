package test_protect;

public class TestProtect {
	public static void main(String[] args){  
		Rat r = new Rat();
		r.crowl();
    }  
}

//������������ࣨ���ࣩ����ͬһ���У������������У�ֻ�б���ʵ�����Է�����ӻ���̳ж�����protected������
//���������в��ܷ��ʻ���ʵ�������󣩣������ã���protected������
//����������Ҳ�޷�������������ʵ����������ͬ��������ֵܣ����̳е�protected���εķ�����
/**
���ࣨ���ࣩ��protected��Ա��������Ա��������Ա�������Ա����ڿɼ������Ҷ�����ɼ���
����������ࣨ���ࣩ����ͬһ���У���ô�������У�ֻ�б���ʵ�����Է�����ӻ���̳ж�����protected���������������в��ܷ��ʻ���ʵ�������󣩣������ã���protected������
�����Ƿ���һ�����ڣ������п��Է�������ʵ�������󣩼̳еĸ���protected���εķ��������Ӹ������Ȩ���ص㣺���������������ࣩ
����������ࣨ���ࣩ����ͬһ����,����ֻ�����Լ����ࣨ���з��ʸ���̳ж�����protected��Ա���޷����ʱ������ʵ����������ͬ��������ֵܣ����̳е�protected���εķ�����
����������ࣨ���ࣩ����ͬһ���У������в�����ʹ������ʵ�����ã�������û�У����������еģ��Լ��ģ�protected���εĳ�Ա�����Ͼ�û������ͬһ���ںͼ̳л��protected��Ա�Ĺ�ϵ��

*/
class Rat extends A.Animal {
	public  void crowl(){  
		this.crowl("zhi zhi"); //û�����⣬�̳���Animal�е�protected��������crowl(String)  
		A.Animal ani=new A.Animal();
		//ani.crowl("animail jiaojiao"); //wrong, The method crowl(String) from the type Animal is not visible
		//Cat cat=new B.Cat();
		//cat.crowl("miao miao"); //wrong, The method crowl(String) from the type Animal is not visible
    }  
	
}