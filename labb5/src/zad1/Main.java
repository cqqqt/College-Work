package zad1;
import zad3.*;
import zad2.*;
import java.util.*;

import Exception.Except;

public class Main {
	public static void printAll(Map<Integer, Product> products)
	{
		for(Map.Entry<Integer, Product> item : products.entrySet()){ 
			System.out.printf("Ключ: "+item.getKey()+"  Значение: "+item.getValue().GetName()+" \n");
		}
	}
	public static void printKeys(Map<Integer, Product> products)
	{
		System.out.println("Набор ключей: " + products.keySet());
	}
	public static void printValues(Map<Integer, Product> products)
	{
		System.out.print("Набор значений: [");
		for(Map.Entry<Integer, Product> item : products.entrySet()){ 
			System.out.printf(item.getValue().GetName()+",");
		}
		System.out.print("]\n\n");
	}
	
	public static void otchislenie(ArrayList<Student> students) throws Except
	{

		   Iterator<Student> iterator = students.iterator();
	       while(iterator.hasNext()){
	           Student st = iterator.next();
		       if (st.averageMark().compareTo(3) < 0) 
		       {
		           iterator.remove();
		           System.out.println("- "+st.getSurname()+" отчислен");
		       }
		   		else 
		   		{
		   			System.out.println("+ "+st.getSurname()+" перешел на следующий курс");
		   			st.setCourse(st.getCourse()+1);
		   		}
	       }
	}
	public static void printStudents(ArrayList<Student> students, int course)
	{
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).getCourse()==course) 
			{
				System.out.printf("\nИмя: "+students.get(i).getName()+"\nФамилия: "+students.get(i).getSurname()+" \nКурс: "+students.get(i).getCourse()+"\nГруппа: "+students.get(i).getGroup()+"\n"+"\n");
			}
		}
	}
	
	public static void printKeysPet(Map<String, Pet> pets)
	{
		System.out.println("Набор ключей: " + pets.keySet());
		for(Map.Entry<String, Pet> item : pets.entrySet()){ 
			System.out.printf(item.getValue().GetName()+",");
		}
	}
	
	public static void main(String[] args) throws Except
	{
		//1
		try {
		Map<Integer, Product> hash = new HashMap<>();
		hash.put(493, new Product("Плюшевый медведь"));
	    hash.put(683, new Product("Единорог"));
	    hash.put(289, new Product("Пазлы черепашки-ниндзя"));
	    hash.put(821, new Product("Водный пистолет"));
	    printAll(hash);
	    printKeys(hash);
	    printValues(hash);
	    //2
	    ArrayList<Student> list = new ArrayList <Student>(); 
		list.add(new Student("Алексей", "Курышев", 1, new ArrayList <Integer> (Arrays.asList(new Integer[] {8, 7, 9,8})), "Т-992"));
	    list.add(new Student("Максим", "Орлов", 2, new ArrayList <Integer> (Arrays.asList(new Integer[] {5, 9, 6,8})), "П-881"));
	    list.add(new Student("Дмитрий", "Прохоренко", 2, new ArrayList <Integer> (Arrays.asList(new Integer[] {3, 2, 2, 2})), "Л-018"));
	    list.add(new Student("Максим2", "Орлов", 2, new ArrayList <Integer> (Arrays.asList(new Integer[] {5, 9, 6,8})), "П-881"));
	    otchislenie(list);
	    printStudents(list,3);
	    //3
	    Map<String, Pet> hash2 = new HashMap<>();
	    hash2.put("Кошка", new Cat("Пенелопа"));
	    hash2.put("Собака", new Dog("Тифани"));
	    hash2.put("Попугай", new Parrot("Кеша"));
	    printKeysPet(hash2);
		}
		catch(Exception ex)
		{
			System.err.println("Внимание вызвано исключение!:" + ex.getMessage());
			ex.printStackTrace();
			System.exit(1);
		}
		}
	    
	}
	 

