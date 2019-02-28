/**
 * ActionListener for the clear button
 * 
 * @author Christopher Andrade
 * @version 1.3
 */
import java.awt.*;
import java.awt.event.*;

public class ClearListener implements ActionListener {   //listener for the clear button
    private LiteBritePanel _lbPanel;
    
    public ClearListener (LiteBritePanel lb) {  //sets the listener
        _lbPanel = lb;
    }
    
    public void actionPerformed (ActionEvent e) {  //when listener hears event, clears the array
        _lbPanel.clearArray();
    }
}