package day01;

public class American extends People {

	public American() {
		super();
		// TODO Auto-generated constructor stub
	}

	public American(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void say() {
		// TODO Auto-generated method stub
		System.out.println("I am a American");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	
	
}
