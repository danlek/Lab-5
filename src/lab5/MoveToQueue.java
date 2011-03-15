package lab5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 * MoveToQueue verion 1.0
 * SubKlass till JButton med action listener
 * inbyggt.
 * @author danlek
 *
 */
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
			//Kontrollerar att en kund är markerad i listan.
			if(selectedCustomerIndex == -1)
			{
				//Ingen kund markerad, inget händer.
			}
			else
			{
				//En kund har markerats. Eftersom detta knapp kan
				//användas till kö1 och kö2, har jag en kontroll som
				//tittar på vilken knapp det är som lockat action-
				//listeners uppmärksamhet.
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
