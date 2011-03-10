package lab5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
 
public class RemoveFromQueue extends JButton 
{
	private ShopLogic SL;
	private GUI G;
	private int number;
	public RemoveFromQueue(ShopLogic SL, GUI G, int n)
	{
		super("Ta bort från Kö" + n);
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
			if(number == 1)
			{
				if(SL.isQueue1Empty() == true)
				{
					
					
				}
				else
				{
					SL.removeCustomerFromQueue1();
				}
				
			}
			else
			{
				if(SL.isQueue2Empty() == true)
				{
					
					
				}
				else
				{
					SL.removeCustomerFromQueue2();
				}
			}
		}
		
	}
}
