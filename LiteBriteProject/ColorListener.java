/**
 * ActionListener for the radio buttons
 * 
 * @author Christopher Andrade 
 * @version 1.2
 */
import java.awt.*;
import java.awt.event.*;

public class ColorListener implements ActionListener {   //listener for changing color on radio buttons
    private LiteBritePanel _lbPanel;
    private Color _myColor;
    
    public ColorListener (Color c, LiteBritePanel lb) {
        _myColor = c;
        _lbPanel = lb;
    }
    
    public void actionPerformed (ActionEvent e) {
        _lbPanel.setLightColor (_myColor);  //when change button, tell panel to change to its color
    }
}