package zad3;

public abstract class Pet 
{
	String name;
	public Pet(String name)
	{
		this.name = name;
	}
	public abstract void Eat();
	public String GetPlay() 
	{
		return null;
	}
	public String GetName()
	{
		return name;
	}
	public void SetPlay(float Run) 
	{
	}
}