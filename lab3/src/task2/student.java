package task2;

import java.util.Random;

public class student {
	
	// ������
	String name;
	int age;
	char s;
	double weight;
		
	public student() {};
	public student(String name, int age, char s, double weight) {
		this.name = name;
		this.age = age;
		this.s = s;
		this.weight = weight;
	};
	
	// getters and setters
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
		public char getS() {
			return s;
		}
		public void setS(char s) {
			this.s = s;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
// methods
	public void show() {
		System.out.println("name: = " + name);
		System.out.println("age: = " + age);
		System.out.println("s: = " + s);
		System.out.println("weight: = " + weight);
	}
	public void go_to_college()
	{
		System.out.print("I go to college");
	}
	public void povzroslet_on_1_year() {
		System.out.println("���� ������� �������� �� 1: = ");
		this.age += 1;
	}
	public void eating()
	{
		System.out.println("�� ������� � ������ 1.5 ��");
		this.weight += 1.5;
	}
	public void run()
	{
		System.out.println("�� ������� � ������� 1 ��");
		this.weight -= 1;
	}
	public int give_mark()
	{
		Random random = new Random();
		return random.nextInt(10) + 0;
	}
	public int year()
	{
		return 2022-age;
	}
}
