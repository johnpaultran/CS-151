package Lecture9and10.icon2;

import javax.swing.*;

public class IconTester
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(
            null, 
            "Hello, Mars!",
            "Message Title",
            JOptionPane.INFORMATION_MESSAGE,
            new MarsIcon(50));
      System.exit(0);
   }
}

