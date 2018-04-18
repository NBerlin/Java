package Gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GuiTest extends Frame implements ActionListener{
    Scanner in;
    Button b;
    Button a;
    TextField tf;
    Image test;
    Graphics g;
    public static void main(String[] args){
        new GuiTest();

    }
    public GuiTest(){
        try {
            test= ImageIO.read(new File("Src/Gui/Shine.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        tf = new TextField();
        tf.setBounds(230,100,100,20);
        add(tf);
        tf.addActionListener(this);
        b=new Button("click me");
        b.setBounds(30,100,80,30);// setting button position
        add(b);//adding button into frame
        a=new Button("click me");
        a.setBounds(130,100,80,30);// setting button position
        add(a);//adding button into frame
        setSize(300,300);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible
        a.addActionListener(this);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==a) {
            a.setVisible(false);
            b.setVisible(true);
        }
        if(e.getSource()==b) {
            b.setVisible(false);
            a.setVisible(true);
        }
        if(e.getSource()==tf){
            String s=tf.getText();
            tf.setText(Integer.toString(s.length()));
            }
    }
}
