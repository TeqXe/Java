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
        	System.out.println("name��" + getName() +";age��" + getAge());
        }
    }
    public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.display();
	}
    
} */
/**
 *    �����Ӧ�ó����У����ǿ��Կ����ڲ���InnerClass���Զ���Χ��OuterClass�����Խ����޷�ķ��ʣ���������private���εġ�������Ϊ�������ڴ���ĳ����Χ����ڲ������ʱ��
 * ��ʱ�ڲ������ض��Ჶ��һ��ָ���Ǹ���Χ���������ã�ֻҪ�����ڷ�����Χ��ĳ�Աʱ���ͻ������������ѡ����Χ��ĳ�Ա��
 *    ��ʵ�����Ӧ�ó��������ǻ�����������������ڲ��ࣺ�����ڲ���������Ҫָ�������������ͣ�OuterClasName.InnerClassName��
 * ͬʱ���������Ҫ����ĳ���ڲ�����󣬱���Ҫ�����ⲿ��Ķ���ͨ��.new�������ڲ��ࣺOuterClass.InnerClass innerClass = outerClass.new InnerClass();��
 *    ͬʱ���������Ҫ���ɶ��ⲿ���������ã�����ʹ��OuterClassName.this���������ܹ�����һ����ȷ�����ⲿ��������ˡ���Ȼ���ʵ�ڱ����ھ�֪���ˣ�û���κ�����ʱ�ĳɱ���
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

//��Java���ڲ�����Ҫ��Ϊ��Ա�ڲ��ࡢ�ֲ��ڲ��ࡢ�����ڲ��ࡢ��̬�ڲ��ࡣ
//----------------------------------------------------------------------------------------------------------------------
//1����Ա�ڲ���
/**
 * ��Ա�ڲ���Ҳ������ͨ���ڲ��࣬������Χ���һ����Ա���������ǿ��������Ƶķ�����Χ������� ��Ա���Ժͷ�����������private�ģ�������Χ��Ҫ�����ڲ���ĳ�Ա���Ժͷ�������Ҫͨ���ڲ���ʵ�������ʡ�
 * �ڳ�Ա�ڲ�����Ҫע�����㣬��һ����Ա�ڲ����в��ܴ����κ�static�ı����ͷ������ڶ�����Ա�ڲ�������������Χ��ģ�����ֻ���ȴ�������Χ����ܹ������ڲ��ࡣ
 */

/*public class OuterClass{
	private String str="��ʼֵ";

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
			str="�ڲ�����Ըı���Χ��ĳ�Ա����";
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

//2���ֲ��ڲ���
//�����ڷ�����
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

//��������������
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


























