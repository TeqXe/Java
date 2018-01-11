package day02.serializable;

class People implements Cloneable{
	/** ���� **/  
    private String name;  
      
    /** �����ʼ� **/  
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
        //д���ʼ�  
        Email email = new Email("���ڽ���12:30���������Ҳμӻ���...");  
          
        People person1 =  new People("����",email);  
          
        People person2 =  person1.clone();  
        person2.setName("����");  
        People person3 =  person1.clone();  
        person3.setName("����");  
        
        //��Ҫ��Ч��������12�㵽�����ң���������12��뵽������ ���...
        /**
         * �������ʼ������ǣ��������12:00���������Ҳμӻ���...
         * ���ĵ��ʼ������ǣ��������12:00���������Ҳμӻ���...
         * ������ʼ������ǣ��������12:00���������Ҳμӻ���...
         * 
         * ��ʵ��������Ĺؼ�������clone()�����ϣ�����֪����clone()������ʹ��Object���clone()���������Ǹ÷�������һ��ȱ�ݣ��������Ὣ�������������ȫ������������������ѡ���ԵĿ����������������£�
         * 1�� ��������
         *  ��������ǻ����������ͣ��򿽱���ֵ������int��float�ȡ�
         * 2�� ����
         *  ���������һ��ʵ�������򿽱����ַ���ã�Ҳ����˵��ʱ�¶�����ԭ�������ǹ��ø�ʵ��������
         * 3���ַ���
         *  ������ΪString�ַ������򿽱����ַ���á��������޸�ʱ��������ַ���������������һ���µ��ַ�����ԭ���϶��Ƕ��󱣳ֲ��䡣
         */
        person1.getEmail().setContent("�������12:00���������Ҳμӻ���..."); 
          
        System.out.println(person1.getName() + "���ʼ������ǣ�" + person1.getEmail().getContent());  
        System.out.println(person2.getName() + "���ʼ������ǣ�" + person2.getEmail().getContent());  
        System.out.println(person3.getName() + "���ʼ������ǣ�" + person3.getEmail().getContent());  
    }  
}  
