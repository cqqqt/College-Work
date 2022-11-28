package zad2;
import java.util.*;

import Exception.Except;

public class Student 
{
	private String name;
	private String surname;
	private int course;
	private List<Integer> marks;
	private String group;
	public Student(String name, String surname, int course, List<Integer> marks, String group)
	{
		this.name = name;
		this.surname = surname;
		this.course = course;
		this.marks = marks;
		this.group = group;
	}
	public void AddMark(Integer mark)
	{
		marks.add(mark);
	}
	public Integer averageMark()
	{
		int sum = 0;
		for(int i : marks) sum = sum+i;
		return sum / marks.size();
	}
	public String getName()
	{
		return name;
	}	
	public void setName(String name) throws Except
	{
		if (name == null)
		{
			throw new Except("Вы не ввели имя"); 
		}
		else 
		{
			this.name = name;
		}
	}
	public String getSurname()
	{
		return surname;
	}
	public void setCourse(int course) throws Except
	{
		if (course > 0)
		{
			this.course = course;
		}
		else 
		{
			throw new Except("Курс должен быть положительным"); 
		}
		if (course > 4)
		{
			throw new Except("Такого курса не существует"); 
		}
	}
	public int getCourse()
	{
		 return course;
	}
	public String getGroup()
	{
		return group;
	}
	public void setGroup(String group) throws Except
	{
		if (group == null)
		{
			throw new Except("Вы не ввели группу"); 
		}
		else 
		{
			this.group= group; 
		}
	}

}