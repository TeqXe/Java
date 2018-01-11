package day02.serializable;

public class Shalow_Deep_Copy {

	/**
	 *浅拷贝：使用一个已知实例对新创建实例的成员变量逐个赋值，这个方式被称为浅拷贝。
	 *
	 *深拷贝：当一个类的拷贝构造方法，不仅要复制对象的所有非引用成员变量值，还要为引用类型的成员变量创建新的实例，并且初始化为形式参数实例值。这个方式称为深拷贝
	 */
	
	Person p1 = new Person("张三","男",25);
	Person P2 = p1;
	Person p3 = new Person(p1);
	//再说上述例子中,p2 只是对象p1 的一个浅复制  p3 则是p1的一个深复制
	
	Asian a1 = new Asian("yellow",new Person("李四","mam",23));
	Asian a2 = new Asian(a1);
	//a1 a2 引用同一个对象
	
}

class Person{
	private String name;
    private String sex;
    private int age;
    
    public Person(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    public Person(Person p){                   //拷贝构造方法，复制对象
        this.name = p.name;
        this.sex = p.sex;
        this.age = p.age;
    }
}

class Asian {
    private String skin;
    Person person;
    
    public Asian(String skin,Person person){
        this.skin = skin;
        this.person = person;                    //引用赋值
    }

    public Asian(Asian asian){                 //拷贝构造方法，复制对象
        this(asian.skin,asian.person);           
    }
}
