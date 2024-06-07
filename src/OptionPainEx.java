import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPainEx extends JFrame {
    public OptionPainEx() {
        setTitle("옵션 팬 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(500, 200);
        c.add(new MyPanel(), BorderLayout.NORTH);
        setVisible(true);
    }

    class MyPanel extends Panel {
        private JButton inputBtn = new JButton("Input Name");
        private JTextField
    }
}
