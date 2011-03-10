package lab5;
import javax.swing.*;

public class List<E> extends AbstractListModel implements ListModel 
{
	/**
	 * 
	 */
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
	public int getSize() 
	{
		return list.getSize();
	}
	public DefaultListModel getContents()
	{
		return list;
	}

}
