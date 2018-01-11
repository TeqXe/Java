package day02.serializable;

class People implements Cloneable{
	/** 姓名 **/  
    private String name;  
      
    /** 电子邮件 **/  
    private Email email;  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public Email getEmail() {  
        return email;  
    }  
  
    public void setEmail(Email email) {  
        this.email = email;  
    }  
      
    public People(String name,Email email){  
        this.name  = name;  
        this.email = email;  
    }  
      
    public People(String name){  
        this.name = name;  
    }  
  
    protected People clone() {  
    	People person = null;  
        try {  
            person = (People) super.clone();  
            person.setEmail(new Email(person.getEmail().getObject(),person.getEmail().getContent()));  
        } catch (CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
          
        return person;  
    }
}

class Email {
	String email;
	People p;

	Email(String email) {
		this.email = email;
	}
	/*Email(String var1,String var2) {
		this.email = var1 +var2;
	}*/

	Email(People p, String content) {
		this.p = p;
		this.email = content;
	}

	public String getContent() {
		return email;
	}

	public void setContent(String s) {
		this.email = s;
	}

	public People getObject() {
		return this.p;
	}
}

public class Serializable_demo {  
    public static void main(String[] args) {  
        //写封邮件  
        Email email = new Email("请于今天12:30到二会议室参加会议...");  
          
        People person1 =  new People("张三",email);  
          
        People person2 =  person1.clone();  
        person2.setName("李四");  
        People person3 =  person1.clone();  
        person3.setName("王五");  
        
        //想要的效果，张三12点到会议室，李四王五12点半到会议室 结果...
        /**
         * 张三的邮件内容是：请与今天12:00到二会议室参加会议...
         * 李四的邮件内容是：请与今天12:00到二会议室参加会议...
         * 王五的邮件内容是：请与今天12:00到二会议室参加会议...
         * 
         * 其实出现问题的关键就在于clone()方法上，我们知道该clone()方法是使用Object类的clone()方法，但是该方法存在一个缺陷，它并不会将对象的所有属性全部拷贝过来，而是有选择性的拷贝，基本规则如下：
         * 1、 基本类型
         *  如果变量是基本数据类型，则拷贝其值，比如int、float等。
         * 2、 对象
         *  如果变量是一个实例对象，则拷贝其地址引用，也就是说此时新对象与原来对象是公用该实例变量。
         * 3、字符串
         *  若变量为String字符串，则拷贝其地址引用。但是在修改时，它会从字符串池中重新生成一个新的字符串，原有紫都城对象保持不变。
         */
        person1.getEmail().setContent("请与今天12:00到二会议室参加会议..."); 
          
        System.out.println(person1.getName() + "的邮件内容是：" + person1.getEmail().getContent());  
        System.out.println(person2.getName() + "的邮件内容是：" + person2.getEmail().getContent());  
        System.out.println(person3.getName() + "的邮件内容是：" + person3.getEmail().getContent());  
    }  
}  
