package day03.collection;

import java.util.ArrayList;
import java.util.List;

public class SubList {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		//通过List的构造函数，以list1为参数得到list2
		List<Integer> list2 = new ArrayList<Integer>(list1);
		
		//通过subList得到list3
		List<Integer> list3 =list1.subList(0, list1.size()-2);
		
		//修改list3
		list3.add(5);
		System.out.println("list1 == list2:" + list1.equals(list2));//false
		System.out.println("list1 == list3:" + list1.equals(list3));//true
		/*
		 * subList返回的SubList同样也是AbstractList的子类，同时它的方法如get、set、add、remove等都是在原列表上面做操作，
		 * 它并没有像subString一样生成一个新的对象。所以subList返回的只是原列表的一个视图，它所有的操作最终都会作用在原列表上。
		 */
		System.out.println("----------------------");
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println("list3:"+list3);
		/*
		 * list1:[1, 2, 5, 3, 4]
		 * list2:[1, 2, 3, 4]
		 * list3:[1, 2, 5]
		 * list3的add操作 ，向 list1的相同位置插入了这个item
		 */
		
		
		/**
		 *  List<Integer> list1 = new ArrayList<Integer>();  
	        list1.add(1);  
	        list1.add(2);  
	          
	        //通过subList生成一个与list1一样的列表 list3  
	        List<Integer> list3 = list1.subList(0, list1.size());  
	        //修改list3  
	        list1.add(3);  
	          
	        System.out.println("list1'size：" + list1.size());  
	        System.out.println("list3'size：" + list3.size());  
	        
	        ConcurrentModificationException
	        -------------------------------------------------------------
	        ---------subList生成子列表后，不要试图去操作原列表----------------
	        -------------------------------------------------------------
		 */
	}

}
