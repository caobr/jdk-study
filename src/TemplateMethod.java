/**
ģ�巽��ģʽ �ڸ��ඨ��һ�������е��㷨�Ǽܣ������㷨��һЩ�������������Ĳ����ӳٵ�������ʵ�֣�ʹ��������Բ��ı���㷨�ṹ��������ض�����㷨��ĳЩ�ض����衣
 
 �ŵ㣺
	��ߴ��븴���ԣ�����ͬ���ֵĴ�����ڳ���ĸ����У�������ͬ�Ĵ�����벻ͬ�������С�
	ʵ���˷�����ƣ�ͨ��һ���������������Ĳ�����ͨ��������ľ���ʵ����չ��ͬ����Ϊ��ʵ���˷������ �������ϡ�����ԭ�򡱣����޸Ĺرգ�����չ��������

 ȱ�㣺
	��ÿ����ͬ��ʵ�ֶ���Ҫ����һ�����࣬��ᵼ����ĸ������ӣ�ϵͳ�����Ӵ����Ҳ���ӳ���
	�����еĳ��󷽷�������ʵ�֣�����ִ�еĽ����Ӱ�츸��Ľ�����⵼��һ�ַ���Ŀ��ƽṹ��������˴����Ķ����Ѷȡ�

 ���ó���
	�㷨�����岽��̶ܹ��������и��𲿷��ױ�ʱ����ʱ�����ʹ��ģ�巽��ģʽ�������ױ�Ĳ��ֳ��������������ʵ�֡�
	��Ҫͨ�����������������㷨��ĳ�������Ƿ�ִ�У�ʵ������Ը���ķ�����ơ�

 ģʽ�ṹ��
	�����ࣨAbstract Class�����������һ���㷨�������͹Ǽܡ�����һ��ģ�巽�������ɸ������������ɡ�
		ģ�巽����һ��ģ�巽���Ƕ����ڳ������еġ��ѻ����������������һ���γ�һ�����㷨��һ������Ϊ�ķ�����
				  ���ģ�巽�������ڳ������У��������಻�����޸ĵ���ȫ�̳�������ģ�巽����һ�����巽������������һ�������߼���ܣ�
				  ���߼�����ɲ����ڳ������п����Ǿ��巽����Ҳ�����ǳ��󷽷���
				  ����ģ�巽���Ǿ��巽�������ģ�巽��ģʽ�еĳ����ֻ���ǳ����࣬�����ǽӿڡ�
		������������ʵ���㷨��������ķ�������ģ�巽������ɲ��֡� 
	�������ࣨConcrete Class����ʵ�ֳ�������������ĳ��󷽷��͹��ӷ�����������һ�������߼�����ɲ��衣 
*/
public class TemplateMethod{
	  public static void main(String[] args) {
        //����˺����
        AbstractClass baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
		System.out.println("==========�����ķָ���===========");
        //�����ز���
        AbstractClass caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}

/*������*/
abstract class AbstractClass {
	//ģ�巽��
	//Ϊ��ֹ���������һ��ģ�巽�������� final �ؼ��ʡ�
    public final void cookProcess() {
        //��һ��������
        this.pourOil();
        //�ڶ���������
        this.heatOil();
        //�����������߲�
        this.pourVegetable();
        //���Ĳ�������ζ��
        this.pourSauce();
        //���岽������
        this.fry();
    }

    public void pourOil() {
        System.out.println("����");
    }

    //�ڶ�����������һ���ģ�����ֱ��ʵ��
    public void heatOil() {
        System.out.println("����");
    }

    //�����������߲��ǲ�һ���ģ�һ���°��ˣ�һ�����²��ģ�
    public abstract void pourVegetable();

    //���Ĳ�������ζ���ǲ�һ��
    public abstract void pourSauce();


    //���岽��������һ���ģ�����ֱ��ʵ��
    public void fry(){
        System.out.println("�������������찡");
    }
}

/*����ʵ����*/
class ConcreteClass_BaoCai extends AbstractClass {
    public void pourVegetable() {
        System.out.println("�¹����߲��ǰ���");
    }

    public void pourSauce() {
        System.out.println("�¹��Ľ���������");
    }
}
/*����ʵ����*/
class ConcreteClass_CaiXin extends AbstractClass {
    public void pourVegetable() {
        System.out.println("�¹����߲��ǲ���");
    }
    
    public void pourSauce() {
        System.out.println("�¹��Ľ���������");
    }
}