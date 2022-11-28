package zad1;
import zad3.*;
import zad2.*;
import java.util.*;

import Exception.Except;

public class Main {
	public static void printAll(Map<Integer, Product> products)
	{
		for(Map.Entry<Integer, Product> item : products.entrySet()){ 
			System.out.printf("����: "+item.getKey()+"  ��������: "+item.getValue().GetName()+" \n");
		}
	}
	public static void printKeys(Map<Integer, Product> products)
	{
		System.out.println("����� ������: " + products.keySet());
	}
	public static void printValues(Map<Integer, Product> products)
	{
		System.out.print("����� ��������: [");
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
		           System.out.println("- "+st.getSurname()+" ��������");
		       }
		   		else 
		   		{
		   			System.out.println("+ "+st.getSurname()+" ������� �� ��������� ����");
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
				System.out.printf("\n���: "+students.get(i).getName()+"\n�������: "+students.get(i).getSurname()+" \n����: "+students.get(i).getCourse()+"\n������: "+students.get(i).getGroup()+"\n"+"\n");
			}
		}
	}
	
	public static void printKeysPet(Map<String, Pet> pets)
	{
		System.out.println("����� ������: " + pets.keySet());
		for(Map.Entry<String, Pet> item : pets.entrySet()){ 
			System.out.printf(item.getValue().GetName()+",");
		}
	}
	
	public static void main(String[] args) throws Except
	{
		//1
		try {
		Map<Integer, Product> hash = new HashMap<>();
		hash.put(493, new Product("�������� �������"));
	    hash.put(683, new Product("��������"));
	    hash.put(289, new Product("����� ���������-������"));
	    hash.put(821, new Product("������ ��������"));
	    printAll(hash);
	    printKeys(hash);
	    printValues(hash);
	    //2
	    ArrayList<Student> list = new ArrayList <Student>(); 
		list.add(new Student("�������", "�������", 1, new ArrayList <Integer> (Arrays.asList(new Integer[] {8, 7, 9,8})), "�-992"));
	    list.add(new Student("������", "�����", 2, new ArrayList <Integer> (Arrays.asList(new Integer[] {5, 9, 6,8})), "�-881"));
	    list.add(new Student("�������", "����������", 2, new ArrayList <Integer> (Arrays.asList(new Integer[] {3, 2, 2, 2})), "�-018"));
	    list.add(new Student("������2", "�����", 2, new ArrayList <Integer> (Arrays.asList(new Integer[] {5, 9, 6,8})), "�-881"));
	    otchislenie(list);
	    printStudents(list,3);
	    //3
	    Map<String, Pet> hash2 = new HashMap<>();
	    hash2.put("�����", new Cat("��������"));
	    hash2.put("������", new Dog("������"));
	    hash2.put("�������", new Parrot("����"));
	    printKeysPet(hash2);
		}
		catch(Exception ex)
		{
			System.err.println("�������� ������� ����������!:" + ex.getMessage());
			ex.printStackTrace();
			System.exit(1);
		}
		}
	    
	}
	 

