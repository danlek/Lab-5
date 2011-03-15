package lab5;
import javax.swing.*;
/**
 * List version 1.0
 * En Lista ADT. Har bas funktioner för att hämta, ta bort och 
 * kontrollera om listan är tom.
 * @author danlek
 *
 * @param <E>
 */
public class List<E> extends AbstractListModel implements ListModel 
{
	private static final long serialVersionUID = -42730918380914558L;
	private DefaultListModel list;
	public List()
	{
		super();
		list = new DefaultListModel();
	}
	public void addCustomer(E person)
	{
		list.addElement(person);
	}
	public void removeCustomer(int index)
	{
		list.removeElementAt(index);
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public Object getElementAt(int index) 
	{
		return list.getElementAt(index);
	}
	//Denna används inte nån gång
	//men jag skrev klart den iaf.
	public int getSize() 
	{
		return list.getSize();
	}
	public DefaultListModel getContents()
	{
		return list;
	}

}
