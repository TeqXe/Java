package day02.InnerClass;

/*public class OuterClass {  
    private String name ;  
    private int age;  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
      
    class InnerClass{  
        public InnerClass(){  
            name = "chenssy";  
            age = 23;  
        }  
        public void display(){
        	System.out.println("name：" + getName() +";age：" + getAge());
        }
    }
    public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.display();
	}
    
} */
/**
 *    在这个应用程序中，我们可以看到内部了InnerClass可以对外围类OuterClass的属性进行无缝的访问，尽管它是private修饰的。这是因为当我们在创建某个外围类的内部类对象时，
 * 此时内部类对象必定会捕获一个指向那个外围类对象的引用，只要我们在访问外围类的成员时，就会用这个引用来选择外围类的成员。
 *    其实在这个应用程序中我们还看到了如何来引用内部类：引用内部类我们需要指明这个对象的类型：OuterClasName.InnerClassName。
 * 同时如果我们需要创建某个内部类对象，必须要利用外部类的对象通过.new来创建内部类：OuterClass.InnerClass innerClass = outerClass.new InnerClass();。
 *    同时如果我们需要生成对外部类对象的引用，可以使用OuterClassName.this，这样就能够产生一个正确引用外部类的引用了。当然这点实在编译期就知晓了，没有任何运行时的成本。
 */

/*public class OuterClass{
	public void display(){
		System.out.println("OuterClass...");
	}
	private class InnerClass{
		public OuterClass getOuterClass(){
			return OuterClass.this;
		}
	}
	public static void main(String[] args) {
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.getOuterClass().display();
	}
}*/

//在Java中内部类主要分为成员内部类、局部内部类、匿名内部类、静态内部类。
//----------------------------------------------------------------------------------------------------------------------
//1、成员内部类
/**
 * 成员内部类也是最普通的内部类，它是外围类的一个成员，所以他是可以无限制的访问外围类的所有 成员属性和方法，尽管是private的，但是外围类要访问内部类的成员属性和方法则需要通过内部类实例来访问。
 * 在成员内部类中要注意两点，第一：成员内部类中不能存在任何static的变量和方法；第二：成员内部类是依附于外围类的，所以只有先创建了外围类才能够创建内部类。
 */

/*public class OuterClass{
	private String str="初始值";

	public OuterClass() {
		super();
	}
	
	public void outerDisplay(){
		System.out.println("Outer display....");
	}
	
	public InnerClass getInnerClass(){
		return new InnerClass();
	}
	
	private class InnerClass{
		public void innerDisplay(){
			System.out.println("str:"+str);
			str="内部类可以改变外围类的成员变量";
			System.out.println("str:"+str);
		}
	}
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
//		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		OuterClass.InnerClass innerClass = outerClass.getInnerClass();
		innerClass.innerDisplay();
	}
}*/

//2、局部内部类
//定义在方法中
/*public class Parcel5 {
	public Destionation destionation(String str) {
		class PDestionation implements Destionation {
			private String label;

			private PDestionation(String whereTo) {
				label = whereTo;
			}

			public String readLabel() {
				return label;
			}
		}
		return new PDestionation(str);
	}

	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destionation d = parcel5.destionation("chenssy");
	}
}*/

//定义在作用域内
/*public class Parcel6 {  
    private void internalTracking(boolean b){  
        if(b){  
            class TrackingSlip{  
                private String id;  
                TrackingSlip(String s) {  
                    id = s;  
                }  
                String getSlip(){  
                    return id;  
                }  
            }  
            TrackingSlip ts = new TrackingSlip("chenssy");  
            String string = ts.getSlip();  
        }  
    }  
      
    public void track(){  
        internalTracking(true);  
    }  
      
    public static void main(String[] args) {  
        Parcel6 parcel6 = new Parcel6();  
        parcel6.track();  
    }  
}*/


























