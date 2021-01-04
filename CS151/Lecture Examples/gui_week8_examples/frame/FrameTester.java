package gui_week8_examples.frame;

import java.awt.*;
import javax.swing.*;

   public class FrameTester
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame();

         JButton helloButton = new JButton("Say Hello");
         JButton goodbyeButton = new JButton("Say Goodbye");



         final int FIELD_WIDTH = 20;
         JTextField textField = new JTextField(FIELD_WIDTH);
         textField.setText("Click a button!");

         // model //attach view and notify it

         goodbyeButton.addActionListener((event) -> textField.setText("la"));

         frame.setLayout(new FlowLayout());

         frame.add(helloButton);
         frame.add(goodbyeButton);
         frame.add(textField);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.pack();
         frame.setVisible(true);

      }
   }

