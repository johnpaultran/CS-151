package edu.sjsu.tran.Exercise2;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

// class for the first frame with three labels, three text fields, and update button
public class NumberView
{
    public NumberView(Model sandy)
    {
        // initialize given model
        this.sandy = sandy;

        // create labels for each value
        JLabel spongebobLabel = new JLabel("Spongebob:");
        JLabel patrickLabel = new JLabel("Patrick:");
        JLabel squidwardLabel = new JLabel("Squidward:");

        // create panels for each value
        JPanel spongebobPanel = new JPanel();
        spongebobPanel.setLayout(new FlowLayout());
        spongebobPanel.add(spongebobLabel);
        spongebobPanel.add(spongebobTextField);

        JPanel patrickPanel = new JPanel();
        patrickPanel.setLayout(new FlowLayout());
        patrickPanel.add(patrickLabel);
        patrickPanel.add(patrickTextField);

        JPanel squidwardPanel = new JPanel();
        squidwardPanel.setLayout(new FlowLayout());
        squidwardPanel.add(squidwardLabel);
        squidwardPanel.add(squidwardTextField);

        // create button to update values
        update = new JButton("UPDATE");
        update.addActionListener(event -> update());

        // create frame
        JFrame frame = new JFrame();

        // put panels and button into vertical box layout
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(spongebobPanel);
        frame.add(patrickPanel);
        frame.add(squidwardPanel);
        frame.add(update);

        // set up and display window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    // method to utilize action listener
    public void attachListener(ActionListener plankton)
    {
        update.addActionListener(plankton);
    }

    // method to update the values in model
    private void update()
    {
        // if text field is not blank
        if(!spongebobTextField.getText().isBlank())
        {
            // set spongebob to value in text field
            sandy.setSpongebob(Integer.parseInt(spongebobTextField.getText()));
        }
        // if text field is not blank
        if(!patrickTextField.getText().isBlank())
        {
            // set patrick to value in text field
            sandy.setPatrick(Integer.parseInt(patrickTextField.getText()));
        }
        // if text field is not blank
        if(!squidwardTextField.getText().isBlank())
        {
            // set squidward to value in text field
            sandy.setSquidward(Integer.parseInt(squidwardTextField.getText()));
        }
    }

    private Model sandy;                    // instance variable
    private final int WIDTH = 25;           // constant for panel width
    private JButton update = new JButton(); // button to update values

    // text fields to input each value
    private JTextField spongebobTextField = new JTextField(WIDTH);
    private JTextField patrickTextField = new JTextField(WIDTH);
    private JTextField squidwardTextField = new JTextField(WIDTH);
}
