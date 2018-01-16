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
		//ͨ��List�Ĺ��캯������list1Ϊ�����õ�list2
		List<Integer> list2 = new ArrayList<Integer>(list1);
		
		//ͨ��subList�õ�list3
		List<Integer> list3 =list1.subList(0, list1.size()-2);
		
		//�޸�list3
		list3.add(5);
		System.out.println("list1 == list2:" + list1.equals(list2));//false
		System.out.println("list1 == list3:" + list1.equals(list3));//true
		/*
		 * subList���ص�SubListͬ��Ҳ��AbstractList�����࣬ͬʱ���ķ�����get��set��add��remove�ȶ�����ԭ�б�������������
		 * ����û����subStringһ������һ���µĶ�������subList���ص�ֻ��ԭ�б��һ����ͼ�������еĲ������ն���������ԭ�б��ϡ�
		 */
		System.out.println("----------------------");
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println("list3:"+list3);
		/*
		 * list1:[1, 2, 5, 3, 4]
		 * list2:[1, 2, 3, 4]
		 * list3:[1, 2, 5]
		 * list3��add���� ���� list1����ͬλ�ò��������item
		 */
		
		
		/**
		 *  List<Integer> list1 = new ArrayList<Integer>();  
	        list1.add(1);  
	        list1.add(2);  
	          
	        //ͨ��subList����һ����list1һ�����б� list3  
	        List<Integer> list3 = list1.subList(0, list1.size());  
	        //�޸�list3  
	        list1.add(3);  
	          
	        System.out.println("list1'size��" + list1.size());  
	        System.out.println("list3'size��" + list3.size());  
	        
	        ConcurrentModificationException
	        -------------------------------------------------------------
	        ---------subList�������б�󣬲�Ҫ��ͼȥ����ԭ�б�----------------
	        -------------------------------------------------------------
		 */
	}

}
