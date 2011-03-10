package lab5;
import javax.swing.*;
public class ShopLogic
{
	
	private List<Person> customer;
	private Queue<Person> kassa1;
	private Queue<Person> kassa2;
	public ShopLogic()
	{
		customer = new List<Person>();
		kassa1 = new Queue<Person>();
		kassa2 = new Queue<Person>();
	}
	//Kontroller för Listan
	public void addCustomerToList(String name, String age)
	{
		customer.addCustomer(new Person(name, age));
	}
	public boolean isListEmpty()
	{
		return customer.isEmpty();
	}
	public void removeCustomerFromList(int index)
	{
		if(isListEmpty() == true)
		{
			JOptionPane.showMessageDialog(null, "Listan är tom!");
		}
		else
		{
			customer.removeCustomer(index);
		}
	}
	public DefaultListModel getCustomerList()
	{
		return customer.getContents();
	}
	public String nameOfCustomer(int index)
	{
		Person p;
		p = (Person) customer.getElementAt(index);
		return p.getTheName();
	}
	public String ageOfCustomer(int index)
	{
		Person p;
		p = (Person) customer.getElementAt(index);
		return p.getTheAge();
	}
	//Kontroller för köerna
	//Kö1
	public void addCustomerToQueue1(String name, String age)
	{
		kassa1.addCustomer(new Person(name, age));
	}
	public boolean isQueue1Empty()
	{
		return kassa1.isEmpty();
	}
	public void removeCustomerFromQueue1()
	{
		if(isQueue1Empty() == true)
		{
		
		}
		else
		{
			kassa1.removeCustomer();
		}
	}
	public DefaultListModel getQueue1()
	{
		return kassa1.getContents();
	}
	//Kö2
	public void addCustomerToQueue2(String name, String age)
	{
		kassa2.addCustomer(new Person(name, age));
	}
	public boolean isQueue2Empty()
	{
		return kassa2.isEmpty();
	}
	public void removeCustomerFromQueue2()
	{
		if(isQueue2Empty() == true)
		{
		
		}
		else
		{
			kassa2.removeCustomer();
		}
	}
	public DefaultListModel getQueue2()
	{
		return kassa2.getContents();
	}
	//Gemmensamma kontroller
	public void moveCustomerFromListToQueue1(int index)
	{
		addCustomerToQueue1(nameOfCustomer(index), ageOfCustomer(index));
		removeCustomerFromList(index);
	}
	public void moveCustomerFromListToQueue2(int index)
	{
		addCustomerToQueue2(nameOfCustomer(index), ageOfCustomer(index));
		removeCustomerFromList(index);
	}
	//Här kommer dem tre kontroll mekanismer
	//för att försäkra att namn och ålder består
	//av bokstäver resp. siffor.
	public void checkInput(String name, String age)
	{
		boolean nameOK = false;
		boolean ageOK = false;
		
		nameOK = checkName(name);
		ageOK = checkAge(age);
		if(nameOK == true && ageOK == true)
		{
			addCustomerToList(name, age);	
		}
		else if(nameOK == false || ageOK == false)
		{
			JOptionPane.showMessageDialog(null, "Felaktigtecken! Skriv namn med enbart bokstäver och ålder\n med enbart siffor.");
		}
	}
	public boolean checkName(String name)
	{
		char test;
		int numericalValue;
		boolean pass = false;
		for(int i = 0; i < name.length(); i++ )
		{
			test = name.charAt(i);
			numericalValue = test;
			
			if(numericalValue > 64 && numericalValue < 91 || numericalValue > 96 && numericalValue < 123 || numericalValue == 229 || numericalValue == 228 || numericalValue == 246 || numericalValue == 197 || numericalValue == 196 || numericalValue == 214)
			{
				pass = true;	
			}
			else
			{
				pass = false;
				break;
			}
		}
		return pass;
	}
	public boolean checkAge(String age)
	{
		char test;
		int numericalValue;
		boolean pass = false;
		for(int i = 0; i < age.length(); i++)
		{
			test = age.charAt(i);
			numericalValue = test;
			if(numericalValue > 47 && numericalValue < 58)
			{
				pass = true;
			}
			else
			{
				pass = false;
				break;
			}
		}
		return pass;
	}
	
}
