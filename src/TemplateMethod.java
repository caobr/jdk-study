/**
模板方法模式 在父类定义一个操作中的算法骨架，而将算法的一些因具体情况而定的步骤延迟到子类中实现，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 
 优点：
	提高代码复用性：将相同部分的代码放在抽象的父类中，而将不同的代码放入不同的子类中。
	实现了反向控制：通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为，实现了反向控制 ，并符合“开闭原则”（对修改关闭，对扩展开发）。

 缺点：
	对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象。
	父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，它提高了代码阅读的难度。

 适用场景
	算法的整体步骤很固定，但其中个别部分易变时，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现。
	需要通过子类来决定父类算法中某个步骤是否执行，实现子类对父类的反向控制。

 模式结构：
	抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
		模板方法：一个模板方法是定义在抽象类中的、把基本操作方法组合在一起形成一个总算法或一个总行为的方法。
				  这个模板方法定义在抽象类中，并由子类不加以修改地完全继承下来。模板方法是一个具体方法，它给出了一个顶层逻辑框架，
				  而逻辑的组成步骤在抽象类中可以是具体方法，也可以是抽象方法。
				  由于模板方法是具体方法，因此模板方法模式中的抽象层只能是抽象类，而不是接口。
		基本方法：是实现算法各个步骤的方法，是模板方法的组成部分。 
	具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。 
*/
public class TemplateMethod{
	  public static void main(String[] args) {
        //炒手撕包菜
        AbstractClass baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
		System.out.println("==========华丽的分割线===========");
        //炒蒜蓉菜心
        AbstractClass caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}

/*抽象类*/
abstract class AbstractClass {
	//模板方法
	//为防止恶意操作，一般模板方法都加上 final 关键词。
    public final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.heatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    //第二步：热油是一样的，所以直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    public abstract void pourVegetable();

    //第四步：倒调味料是不一样
    public abstract void pourSauce();


    //第五步：翻炒是一样的，所以直接实现
    public void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }
}

/*具体实现类*/
class ConcreteClass_BaoCai extends AbstractClass {
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
/*具体实现类*/
class ConcreteClass_CaiXin extends AbstractClass {
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }
    
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}