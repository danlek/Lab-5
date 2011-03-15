package lab5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
 /**
  * AddCustomerButton verion 1.0
  * SubKlass till JButton med action listener
  * inbyggt.
  * @author danlek
  *
  */
public class AddCustomerButton extends JButton 
{
	private ShopLogic SL;
	private GUI G;
	public AddCustomerButton(ShopLogic SL, GUI G)
	{
		super("Lägg till");
		this.SL = SL;
		this.G = G;
		AdvanceButtonListener ABL = new AdvanceButtonListener();
		this.addActionListener(ABL);
	}
	private class AdvanceButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			SL.checkInput(G.getTheName(), G.getTheAge());	
		}
		
	}
}
