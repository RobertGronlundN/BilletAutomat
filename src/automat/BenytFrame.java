package automat;

//import automat.AutomatGUI;
import javax.swing.JFrame;

public class BenytFrame
{
	public static void main(String[] arg)
	{
		JFrame vindue = new StartFrame();
                                            
                //vindue.add( new StartPanel() );
                
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.setSize(650, 540);// sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}
}