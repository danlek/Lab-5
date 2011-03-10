package lab5;

public class Person 
{
	private String name, age;
	public Person(String name, String age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return name + " " + age;
	}
	public String getTheName()
	{
		return name;
	}
	public String getTheAge()
	{
		return age;
	}

}
