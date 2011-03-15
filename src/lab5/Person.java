package lab5;
/**
 * Person version 1.0
 * Bas datatyp f�r programmet med n�gra
 * st�d funktioner.
 * @author danlek
 *
 */
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
