package ghostController;
import javax.swing.JOptionPane;
import java.util.ArrayList;
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
	
	public void makeGhost()
	{
		ArrayList<Ghost> vault =new ArrayList<Ghost>();
	}
}
