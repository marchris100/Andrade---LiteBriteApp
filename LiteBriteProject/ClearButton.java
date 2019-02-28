/**
 * J Button that clears the screen with attached ActionListener
 * 
 * @author Christopher Andrade
 * @version 1.2
 */
import java.awt.*;
import javax.swing.*;

public class ClearButton extends JButton {
    public ClearButton (String s, LiteBritePanel lb) {
        super(s);   //creates JButton that has a listener attached
        this.addActionListener(new ClearListener (lb));
    }
}