/**
 * Lite Brite App
 * 
 * @author Christopher Andrade
 * @version 2.1
 */
import javax.swing.*;
import java.awt.*;

public class LiteBriteApp extends JFrame {
    private LiteBritePanel _LBPanel;   //instance variables
    private ButtonPanel _BPanel;
    private JLabel _topLabel;
    
    public LiteBriteApp (String title) {
        super (title);
        this.setSize(786, 513); //default window size
//      this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);  *EXTRA FOR MAXIMIZING*
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);   //makes close button work
        
        _LBPanel = new LiteBritePanel ();   //instanciate the peg panel
        
        _BPanel = new ButtonPanel(_LBPanel);        //instanciates the buttons
        _BPanel.setPreferredSize(new Dimension(100, 1));  //width of the buttons
        
        _topLabel = new JLabel("   --- LiteBrite App version 4.3 ---");   //top JLabel
        _topLabel.setPreferredSize(new Dimension(1, 30));
       
        this.add(_LBPanel, "Center");   //add them to the frame
        this.add(_BPanel, "East");
        this.add(_topLabel, "North");
        
        this.setVisible (true);
    }
    
    public static void main (String [] args) {   //runs the app
        LiteBriteApp app = new LiteBriteApp ("LiteBrite");
    }
}