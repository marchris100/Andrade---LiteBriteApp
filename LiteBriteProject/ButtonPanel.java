/**
 * Panel for the radio buttons and the clear button
 * 
 * @author Christopher Andrade
 * @version 3.2
 */
import java.awt.*;
import javax.swing.*;

public class ButtonPanel extends JPanel {
    private ColorRadioButton _redButton;   //instance variables for the buttons
    private ColorRadioButton _orangeButton;
    private ColorRadioButton _yellowButton;
    private ColorRadioButton _greenButton;
    private ColorRadioButton _blueButton;
    private ColorRadioButton _indigoButton;
    private ColorRadioButton _violetButton;
    private ClearButton _clearButton;
    private Color _red;     //personally created color variables
    private Color _orange;
    private Color _yellow;
    private Color _green;
    private Color _blue;
    private Color _indigo;
    private Color _violet;
    
    public ButtonPanel(LiteBritePanel lb) {
        super ();           //instanciates the panel
        this.setLayout(new GridLayout(0, 1)); //gives the panel a grid layout wtih a vertical column
        
        _red = new Color(246, 33, 4);   //personal colors for more selection
        _orange = new Color(232, 141, 10);
        _yellow = new Color(245, 231, 11);
        _green = new Color(7, 115, 18);
        _blue = new Color(4, 125, 238);
        _indigo = new Color(8, 6, 120);
        _violet = new Color(90, 10, 172);
        
        _redButton = new ColorRadioButton ("Red", true, _red, lb);      //instanciating the radio and clear buttons
        _orangeButton = new ColorRadioButton ("Orange", false, _orange, lb);
        _yellowButton = new ColorRadioButton ("Yellow", false, _yellow, lb);
        _greenButton = new ColorRadioButton ("Green", false, _green, lb);
        _blueButton = new ColorRadioButton ("Blue", false, _blue, lb);
        _indigoButton = new ColorRadioButton ("Indigo", false, _indigo, lb);
        _violetButton = new ColorRadioButton ("Violet", false, _violet, lb);
        _clearButton = new ClearButton ("Clear Screen", lb);
        
        ButtonGroup _myGroup = new ButtonGroup();   //adds the radio buttons to a group
        _myGroup.add(_redButton);
        _myGroup.add(_orangeButton);
        _myGroup.add(_yellowButton);
        _myGroup.add(_greenButton);
        _myGroup.add(_blueButton);
        _myGroup.add(_indigoButton);
        _myGroup.add(_violetButton);
        
        this.add(_redButton);       //adds buttons to the panel
        this.add(_orangeButton);
        this.add(_yellowButton);
        this.add(_greenButton);
        this.add(_blueButton);
        this.add(_indigoButton);
        this.add(_violetButton);
        this.add(_clearButton);
    }
}