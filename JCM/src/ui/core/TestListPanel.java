package ui.core;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import static ui.core.ListPanel.getRandomJPanel;

/**
 *
 * @author brian
 */
public class TestListPanel extends JPanel {
    public ListPanel list;
    public JScrollPane scrollPane;
    
    public TestListPanel() {
        list = new ListPanel();
        for (int i = 1; i <= 10; i++)
            list.addPanel(ListPanel.getRandomJPanel(), new Random().nextInt(50) + 50);
        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setViewportView(list);
    }
}
