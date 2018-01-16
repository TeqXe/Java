package day03.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Test {

	
	public static void main(String[] args) {
		long start_01 = System.currentTimeMillis();
		List<Student> list1 = new ArrayList<Student>(1000000);
		for(int i = 0;i<1000000;i++){
			list1.add(new Student(i, "stu_"+i));
		}
		long end_01 = System.currentTimeMillis();
		
		long start_02 = System.currentTimeMillis();
		List<Student> list2 = new ArrayList<Student>();
		for(int i = 0;i<1000000;i++){
			list2.add(new Student(i, "stu_"+i));
		}
		long end_02 = System.currentTimeMillis();
		System.out.println("给予初始大小："+(end_01-start_01)+"   "+list1.size());
		System.out.println("不给予初始大小:"+(end_02-start_02)+"   "+list2.size());
	}
}

class Student{
	private int idCard;
	private String name;
	
	public Student(int idCard, String name) {
		super();
		this.idCard = idCard;
		this.name = name;
	}
	public int getIdCard() {
		return idCard;
	}
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
