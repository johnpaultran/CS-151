package gui_week8_examples.timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;
import javax.swing.Timer;

/**
   This program shows a clock that is updated once per second.
*/
public class TimerTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FIELD_WIDTH = 20;
      JTextField textField = new JTextField(FIELD_WIDTH);

      frame.setLayout(new FlowLayout());
      frame.add(textField);


      ActionListener listener
         = event -> textField.setText(Instant.now().toString());
      final int DELAY = 1000;
         // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, listener);
      t.start();

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}
