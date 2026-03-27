import java.awt.BorderLayout; import java.awt.GridLayout; import javax.swing.*;

public class T2 {

    JFrame frame = new JFrame("BorderLayout Demo");

    public T2() {
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("application title"), BorderLayout.NORTH);
        frame.add(panel_west(), BorderLayout.WEST);
        frame.add(new JButton("submit"), BorderLayout.SOUTH);
        frame.add(center_text(), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    JPanel panel_west() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(new JButton("option 1"));
        panel.add(new JButton("option 2"));
        panel.add(new JButton("option 3"));

        return panel;
    }

    JScrollPane center_text() {
        JTextArea text = new JTextArea(20, 40);
        text.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(text);
        return scrollPane;
    }
}
