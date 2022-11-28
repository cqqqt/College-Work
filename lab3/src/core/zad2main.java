package core;

import com.class_array_calculate.array_calculate;
import task2.student;


public class zad2main {
	public static void main(String[] args) {
		
		// 1 
		System.out.println("task 1");
		int array1[] = new int[] {1,2,3};
		int array2[] = new int[] {1,2,10};
		
		array_calculate obj0 = new array_calculate(array1, array2);
		for (int i = 0; i < 13; i++)
			System.out.println("******** " + obj0.calculate() + " *********");
	
		// 2
		System.out.println("\ntask 2");
		student person1 = new student("Nikita", 17, 'M', 60.7);
		
		// Покушал
		person1.eating();
		System.out.println("Вы ваш вес = " + person1.getWeight());
		System.out.println("Вы получили отмету = " + person1.give_mark());
		person1.go_to_college();
		System.out.println();
		person1.run();
		// После того как побегал
		System.out.println("Вы ваш вес = " + person1.getWeight());
		System.out.println("\nAll data: ");
		person1.show();
	}
}
