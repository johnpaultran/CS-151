package FinalQuestions.question17;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

public class View {
    BlockingQueue<Message> queue;
    JButton switchButton;
    JLabel language1;
    JLabel language2;

    public View(BlockingQueue<Message> queue)
    {
        this.switchButton = new JButton("SWITCH");
        this.language1 = new JLabel("English");
        this.language2 = new JLabel("SPanish");

        switchButton.addActionListener(e -> {
            try {
                queue.put(new SwitchMessage());
            } catch (InterruptedException exception) {
                // do nothing
            }
        });

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.add(language1);
        frame.add(switchButton);
        frame.add(language2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
