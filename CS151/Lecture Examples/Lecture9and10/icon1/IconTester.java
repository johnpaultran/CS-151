package Lecture9and10.icon1;

import javax.swing.*;

public class IconTester
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(
            null, 
            "Hello, World!",
            "Message Title",
            JOptionPane.INFORMATION_MESSAGE,
            new ImageIcon("src/Lecture9and10/icon1/globe.gif"));


      System.exit(0);
   }
}
