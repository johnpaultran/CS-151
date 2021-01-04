package gui_week8_examples.frame;

import gui_week8_examples.layout.FormLayout;

import javax.swing.*;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        frame.add(button1);
        frame.add(button2);

        frame.setLayout(new FormLayout());

        frame.pack();

        //\\frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
