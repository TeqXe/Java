package day02.serializable;

public class Shalow_Deep_Copy {

	/**
	 *ǳ������ʹ��һ����֪ʵ�����´���ʵ���ĳ�Ա���������ֵ�������ʽ����Ϊǳ������
	 *
	 *�������һ����Ŀ������췽��������Ҫ���ƶ�������з����ó�Ա����ֵ����ҪΪ�������͵ĳ�Ա���������µ�ʵ�������ҳ�ʼ��Ϊ��ʽ����ʵ��ֵ�������ʽ��Ϊ���
	 */
	
	Person p1 = new Person("����","��",25);
	Person P2 = p1;
	Person p3 = new Person(p1);
	//��˵����������,p2 ֻ�Ƕ���p1 ��һ��ǳ����  p3 ����p1��һ�����
	
	Asian a1 = new Asian("yellow",new Person("����","mam",23));
	Asian a2 = new Asian(a1);
	//a1 a2 ����ͬһ������
	
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
    
    public Person(Person p){                   //�������췽�������ƶ���
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
        this.person = person;                    //���ø�ֵ
    }

    public Asian(Asian asian){                 //�������췽�������ƶ���
        this(asian.skin,asian.person);           
    }
}
