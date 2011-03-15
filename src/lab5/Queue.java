package lab5;
import javax.swing.*;
/**
 * Queue version 1.0
 * En Kö ADT. Har bas funktioner för att hämta, ta bort och 
 * kontrollera om kön är tom.
 * @author danlek
 *
 * @param <E>
 */
public class Queue<E> extends AbstractListModel implements ListModel
{
	private static final long serialVersionUID = 1222173619319652056L;
	private DefaultListModel queue;
	public Queue()
	{
		super();
		queue = new DefaultListModel();
	}
	public void addCustomer(E person)
	{
		queue.addElement(person);
	}
	public void removeCustomer()
	{
		queue.removeElementAt(0);
	}
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}
	public DefaultListModel getContents()
	{
		return queue;
	}
	//Crap jag var tyvungen att lägga till men som
	//inte gör nåt.
	@Override
	public Object getElementAt(int arg0) 
	{
		return null;
	}
	@Override
	public int getSize() 
	{
		return 0;
	}

}
