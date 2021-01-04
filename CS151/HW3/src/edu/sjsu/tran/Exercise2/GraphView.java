package edu.sjsu.tran.Exercise2;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

// class that shows bar graph of three values from model
public class GraphView
{
    public GraphView(Model mrKrabs)
    {
        // initialize given model
        this.mrKrabs = mrKrabs;

        // create graph
        Graph graph = new Graph(500, 500);
        graphLabel = new JLabel(graph);

        // create frame
        JFrame frame = new JFrame();

        // put graph into flow layout
        frame.setLayout(new FlowLayout());
        frame.add(graphLabel);

        // set up and display window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    // action listener to update graph when NumberView is changed
    public ActionListener updateGraph()
    {
        return event -> graphLabel.repaint();
    }

    // class to create graph using icon
    class Graph implements Icon
    {
        public Graph(int width, int height)
        {
            // initialize width and height
            this.width = width;
            this.height = height;
        }

        // method to return width
        public int getIconWidth()
        {
            return width;
        }

        // method to return height
        public int getIconHeight()
        {
            return height;
        }

        // method to paint each bar
        public void paintIcon(Component c, Graphics g, int x, int y)
        {
            // initialize Graphics2D object to call its methods when drawing shapes, change color or font
            Graphics2D g2 = (Graphics2D) g;

            // draw first yellow rectangle for SpongeBob
            Rectangle2D yellow = new Rectangle2D.Double(x + width / 7,
                    y + height  * (1 - mrKrabs.getSpongebob() / MAX_HEIGHT),
                    width / 7, height * mrKrabs.getSpongebob() / MAX_HEIGHT);

            // draw second rectangle for Patrick
            Rectangle2D pink = new Rectangle2D.Double(x + 3 * width/ 7,
                    y + height  * (1 - mrKrabs.getPatrick() / MAX_HEIGHT),
                    width / 7, height * mrKrabs.getPatrick() / MAX_HEIGHT);

            // draw third rectangle for Squidward
            Rectangle2D teal = new Rectangle2D.Double(x + 5 * width/ 7,
                    y + height  * (1 - mrKrabs.getSquidward() / MAX_HEIGHT),
                    width / 7, height * mrKrabs.getSquidward() / MAX_HEIGHT);

            // color in bars with corresponding color
            g2.setColor(Color.YELLOW);
            g2.fill(yellow);
            g2.setColor(Color.PINK);
            g2.fill(pink);
            g2.setColor(Color.CYAN);
            g2.fill(teal);
        }

        // instance variables
        private int width;
        private int height;
        // constant for max height of a bar
        private final double MAX_HEIGHT = 100.0;
    }

    private Model mrKrabs;      // instance variable
    private JLabel graphLabel;  // label for graph
}
