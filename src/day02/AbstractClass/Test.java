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
		 * 1、接口的所有方法访问权限都应设为public 确切的说只能为public 可以显式得设为protected，private 但是编译会报错
		 * 2、接口可以定义“成员变量”，且自动会变为public static final  通过类名直接访问 Implementation.name
		 * 3、接口中不存在实现的方法
		 * 4、实现接口的非抽象类必须要实现该接口的所有方法。抽象类可以不用实现
		 * 5、不能使用new操作符实例化一个接口，但可以声明一个接口变量，
		 * 		该变量必须引用（refer to)一个实现该接口的类的对象。可以使用 instanceof 检查一个对象是否实现了某个特定的接口。例如：if(anObject instanceof Comparable){}
		 * 6、在实现多接口的时候要避免方法名的重复。
		 */
		System.out.println(new ArrayList() instanceof List);//true
	}
}
