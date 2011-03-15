package lab5;
import javax.swing.*;
import java.awt.*;
/**
 * GUI version 1.0
 * Tillhandahåller en GUI (duh) för enkel
 * styrning och manipulation av data.
 * @author danlek
 *
 */
public class GUI extends JPanel 
{
	private JFrame frame;
	private ShopLogic SL;
	private JPanel north, center, moveButtonPanel, queuePanel, removeButtonPanel;
	private JLabel nameLbl, ageLbl;
	private JTextField nameTxt, ageTxt;
	private JList customerList, kassa1, kassa2;
	private AddCustomerButton addCustomer;
	private MoveToQueue queue1, queue2;
	private RemoveFromQueue remove1, remove2;
	public GUI()
	{
		super(new BorderLayout());
		SL = new ShopLogic();
		frame = new JFrame("SimShop");
		frame.setBackground(java.awt.Color.BLACK);
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		this.setBackground(java.awt.Color.GRAY);
		
		north = new JPanel();
		center = new JPanel(new GridLayout(0, 4));
		queuePanel = new JPanel(new GridLayout(2, 0));
		moveButtonPanel = new JPanel(new GridLayout(2, 0));
		removeButtonPanel = new JPanel(new GridLayout(2, 0));
		north.setBackground(java.awt.Color.GRAY);
		center.setBackground(java.awt.Color.GRAY);
		moveButtonPanel.setBackground(java.awt.Color.GRAY);
		queuePanel.setBackground(java.awt.Color.GRAY);
		removeButtonPanel.setBackground(java.awt.Color.GRAY);
		this.add(north, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
		
		nameLbl = new JLabel("Namn: ");
		ageLbl = new JLabel("Ålder: ");
		nameTxt = new JTextField(20);
		ageTxt = new JTextField(4);
		addCustomer = new AddCustomerButton(SL, this);
		
		north.add(nameLbl);
		north.add(nameTxt);
		north.add(ageLbl);
		north.add(ageTxt);
		north.add(addCustomer);
		
		customerList = new JList(SL.getCustomerList());
		customerList.setBackground(java.awt.Color.GRAY);
		kassa1 = new JList(SL.getQueue1());
		kassa1.setBackground(java.awt.Color.GRAY);
		kassa2 = new JList(SL.getQueue2());
		kassa2.setBackground(java.awt.Color.GRAY);
		
		remove1 = new RemoveFromQueue(SL, this, 1);
		remove2 = new RemoveFromQueue(SL, this, 2);
		
		center.add(customerList);
		center.add(moveButtonPanel);
		center.add(queuePanel);
		center.add(removeButtonPanel);
		queuePanel.add(kassa1);
		queuePanel.add(kassa2);
		
		queue1 = new MoveToQueue(SL, this, 1);
		queue2 = new MoveToQueue(SL, this, 2);
		
		moveButtonPanel.add(queue1);
		moveButtonPanel.add(queue2);
		
		removeButtonPanel.add(remove1);
		removeButtonPanel.add(remove2);
		
	}
	public static void main(String[] arg)
	{
		GUI Gui = new GUI();
	}
	public String getTheName()
	{
		return nameTxt.getText();
		
	}
	public String getTheAge()
	{
		return ageTxt.getText();
		
	}
	//Retunerar ett integer värde vilket anger
	//vilken kund man har markerat i listan.
	//Om ingen kund är markerad returneras värdet
	//-1.
	public int getFocusedCustomer()
	{
		int returnValue = -1;
		if(customerList.getSelectedIndex() < 0)
		{
			returnValue = -1;
		}
		else if(customerList.getSelectedIndex() >= 0)
		{
			returnValue = customerList.getSelectedIndex();
		}
		return returnValue;
	}
}
