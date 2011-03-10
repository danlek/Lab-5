package lab5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
 
public class MoveToQueue extends JButton 
{
	private ShopLogic SL;
	private GUI G;
	private int number;
	public MoveToQueue(ShopLogic SL, GUI G, int n)
	{
		super("Flytta till Kö" + n);
		this.SL = SL;
		this.G = G;
		this.number = n;
		AdvanceButtonListener ABL = new AdvanceButtonListener();
		this.addActionListener(ABL);
	}
	private class AdvanceButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int selectedCustomerIndex = G.getFocusedCustomer();
			if(selectedCustomerIndex == -1)
			{
				
			}
			else
			{
				if(number == 1)
				{
					SL.moveCustomerFromListToQueue1(selectedCustomerIndex);
				}
				else
				{
					SL.moveCustomerFromListToQueue2(selectedCustomerIndex);
				}
			}
			
		}
		
	}
}
