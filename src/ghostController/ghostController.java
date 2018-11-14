package ghostController;
import javax.swing.JOptionPane;

import ghostModel.Ghost;;

public class ghostController
{
	private Ghost ghosts;
	public ghostController()
	{
		ghosts = new Ghost();
				
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, ghosts);
	}
}
