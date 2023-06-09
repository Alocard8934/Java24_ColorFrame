package JAVA24;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFrame extends JFrame {
    JButton red, green, blue;
    
    public ColorFrame(){
        super("ColorFrame");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);
        
        // Beginning of an anonymous inner class
        ActionListener act = new ActionListener(){
            public void actionPerformed(ActionEvent event){
                if(event.getSource() == red){
                    getContentPane().setBackground(Color.red);
                }
                if(event.getSource() == green){
                    getContentPane().setBackground(Color.green);
                }
                if(event.getSource() == blue){
                    getContentPane().setBackground(Color.blue);
                }
            }
        };
        
        // End of anonymous inner class
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ColorFrame();
    }
}


