/**
 * J Radio Button parameterized with an ActionListener
 * 
 * @author Christopher Andrade
 * @version 1.3
 */
import java.awt.*;
import javax.swing.*;

public class ColorRadioButton extends JRadioButton {
    public ColorRadioButton (String s, boolean truefalse, Color c, LiteBritePanel lb) {
        super(s, truefalse);        //creates a JRadioButton with attached listener
        this.setBackground(c);      //sets color of the button
        this.addActionListener(new ColorListener (c, lb));
    }
}