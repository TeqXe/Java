package day02.AbstractClass;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.eat();
		dog.eat();
		/**
		 * 1���ӿڵ����з�������Ȩ�޶�Ӧ��Ϊpublic ȷ�е�˵ֻ��Ϊpublic ������ʽ����Ϊprotected��private ���Ǳ���ᱨ��
		 * 2���ӿڿ��Զ��塰��Ա�����������Զ����Ϊpublic static final  ͨ������ֱ�ӷ��� Implementation.name
		 * 3���ӿ��в�����ʵ�ֵķ���
		 * 4��ʵ�ֽӿڵķǳ��������Ҫʵ�ָýӿڵ����з�������������Բ���ʵ��
		 * 5������ʹ��new������ʵ����һ���ӿڣ�����������һ���ӿڱ�����
		 * 		�ñ����������ã�refer to)һ��ʵ�ָýӿڵ���Ķ��󡣿���ʹ�� instanceof ���һ�������Ƿ�ʵ����ĳ���ض��Ľӿڡ����磺if(anObject instanceof Comparable){}
		 * 6����ʵ�ֶ�ӿڵ�ʱ��Ҫ���ⷽ�������ظ���
		 */
		System.out.println(new ArrayList() instanceof List);//true
	}
}
