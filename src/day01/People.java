package day01;

public class People {
	public String name;
	private int age;
	public People() {
		
	}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void say() {
		System.out.println("I am a human!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
