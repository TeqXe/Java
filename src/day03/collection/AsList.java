package day03.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
	
	public static void main(String[] args) {
		int[] ints = {1,2,3,4,5};
		List list = Arrays.asList(ints);
		System.out.println(list.size());//list.size()=1  此处将ints数组当成了泛型  成为了一个参数
		System.out.println(list.get(0).equals(ints));//true
		//Solutions:将int改为包装类Integer
		Integer[] integers = {1,2,3,4,5};
		List list2 = Arrays.asList(integers);
		System.out.println(list2.size());
		System.out.println(list2);
		new ArrayList<>().toString();
	}

}
