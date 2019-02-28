/**
 * Panel that deals with the adding of ellipses
 * 
 * @author Christopher Andrade
 * @version 4.3
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LiteBritePanel extends JPanel implements MouseListener{
    private ColorEllipse[] _lightArray;  //instance variables
    private int _index, _size;
    private Color _buttonColor;

    public LiteBritePanel() {
        super ();
        this.setBackground (Color.BLACK);  //sets panel to black
        this.addMouseListener(this);
        _index = 0;    //index of array starts at 0
        _size = 300;   //original size 300
        _lightArray = new ColorEllipse[_size];  //instanciates array
        _buttonColor = new Color(246, 33, 4);
    }
    
    public void clearArray() {  //method to clear the array
        _lightArray = new ColorEllipse[_size];  //array becomes new
        _index = 0;         //index reset
        this.repaint();     //repaint to erase circles
    }
    public void setLightColor (Color newColor) {
        _buttonColor = newColor;  //sets brush color
    }
    public void addLight(MouseEvent e) {
        if (_lightArray.length == _size) {  //if max length is reached
             _size = _size+300;             //size incresaes of teh array
             ColorEllipse[] _newArray = new ColorEllipse[_size];
             for (int i = 0; i < _index; i++)  //loop adds old array to new
                 _newArray[i] = _lightArray[i];
             _lightArray = _newArray;  //new array takes old name
         }
        int x = e.getX();   //sets the location of the created ellipse
        int y = e.getY();
        x = x/45;
        y = y/45;
        x = x*45;
        y = y*45;
        _lightArray[_index] = new ColorEllipse(_buttonColor, x, y, 40, 40);
        _index++;  //index increases when an ellipse is added
    }
    public void removeLight(int i) {
        _lightArray[i] = _lightArray[_index-1];  //index at a point becomes last spot
        _index--;       //index goes one down, erasing it
    }
    public void mousePressed (MouseEvent e) {   //things that happen when mouse pressed
        for (int i = 0; i < _index; i++) {
             if (_lightArray[i].contains(e.getPoint())) {      //check array to find point
                 this.removeLight(i);   //will remove the light if clicked over one
                 this.repaint();
                 return; //ends the method
             }
         }
        this.addLight(e);    //adds light when clicked
        this.repaint();
    }
    public void mouseClicked (MouseEvent e) {}
    public void mouseExited (MouseEvent e)  {}
    public void mouseEntered (MouseEvent e) {}
    public void mouseReleased (MouseEvent e){}
    public void paintComponent (Graphics brush) {  //paintbrush
        super.paintComponent (brush);
        Graphics2D betterBrush = (Graphics2D) brush;
        for (int i = 0; i < _index; i++) {   //paints every ellpse in the array
            _lightArray[i].fill(betterBrush);
            _lightArray[i].draw(betterBrush);
        }
    }
}