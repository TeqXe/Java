package day03.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
	
	public static void main(String[] args) {
		int[] ints = {1,2,3,4,5};
		List list = Arrays.asList(ints);
		System.out.println(list.size());//list.size()=1  �˴���ints���鵱���˷���  ��Ϊ��һ������
		System.out.println(list.get(0).equals(ints));//true
		//Solutions:��int��Ϊ��װ��Integer
		Integer[] integers = {1,2,3,4,5};
		List list2 = Arrays.asList(integers);
		System.out.println(list2.size());
		System.out.println(list2);
		new ArrayList<>().toString();
	}

}
