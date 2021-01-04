package gui_week8_examples.mailgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   Presents a phone GUI for the voice mail system.
*/
public class Telephone
{
   /**
      Constructs a telephone with a speaker, keypad,
      and microphone.
   */
   public Telephone()
   {
      // speaker
      JPanel speakerPanel = new JPanel();
      speakerPanel.setLayout(new BorderLayout());
      speakerPanel.add(new JLabel("Speaker:"),
            BorderLayout.NORTH);
      speakerField = new JTextArea(10, 25);
      speakerPanel.add(speakerField,
            BorderLayout.CENTER);

      // key panel
      String keyLabels = "123456789*0#";
      //String[] labels = new String[12]{"1", "2",...};

      JPanel keyPanel = new JPanel();
      keyPanel.setLayout(new GridLayout(4, 3));
      for (int i = 0; i < keyLabels.length(); i++)
      {
         String label = keyLabels.substring(i, i + 1);
         JButton keyButton = new JButton(label);
         keyPanel.add(keyButton);
         keyButton.addActionListener(event ->
            connect.dial(label));
      }

      JTextArea microphoneField = new JTextArea(10,25);

      JButton speechButton = new JButton("Send speech");
      speechButton.addActionListener(event ->
         {
            connect.record(microphoneField.getText());
            microphoneField.setText("");
         });

      JButton hangupButton = new JButton("Hangup");
      hangupButton.addActionListener(event ->
         connect.hangup());

      JPanel buttonPanel = new JPanel(new FlowLayout());
      buttonPanel.add(speechButton);
      buttonPanel.add(hangupButton);

      JPanel microphonePanel = new JPanel();
      microphonePanel.setLayout(new BorderLayout());
      microphonePanel.add(new JLabel("Microphone:"),
            BorderLayout.NORTH);
      microphonePanel.add(microphoneField, BorderLayout.CENTER);
      microphonePanel.add(buttonPanel, BorderLayout.SOUTH);

      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(speakerPanel, BorderLayout.NORTH);
      frame.add(keyPanel, BorderLayout.CENTER);
      frame.add(microphonePanel, BorderLayout.SOUTH);

      frame.pack();
      frame.setVisible(true);
   }

   /**
      Give instructions to the mail system user.
   */
   public void speak(String output)
   {
      speakerField.setText(output);
   }

   public void run(Connection c)
   {
      connect = c;
   }

   private JTextArea speakerField;
   private Connection connect;
}
