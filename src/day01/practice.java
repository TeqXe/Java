package day01;

public class practice {

	public static void main(String[] args) {
		System.out.println("12.5����������ֵ��" + Math.round(12.5));//13
		System.out.println("-12.5����������ֵ��" + Math.round(-12.5));//-12
		

		People people = new American("1324", 34);
		people.say();
	}
}
 class Person {  
    private String name;  
    private int age;  
    private String sex;  
  
    protected String getName() {  
        return name;  
    }  
  
    protected void setName(String name) {  
        this.name = name;  
    }  
  
    public String toString(){  
        return "this name is " + name;  
    }  
      
    /** ʡ������setter��getter���� **/  
}  
  
 class Husband extends Person{  
    public  String toString(){  
        setName("chenssy");    //���ø����setName();  
        return  toString();    //���ø����toString()����  
    }  
  
    public static void main(String[] args) {  
        Husband husband = new Husband();  
          
        System.out.println(husband.toString());  
    }  
}  