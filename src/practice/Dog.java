package practice;

public class Dog {
	String breed;
	int age;
	public Dog(String name,int age) {
		breed=name;
		this.age=age;
	}
	public void show() {
		System.out.print(breed+" "+age);
	}
}
