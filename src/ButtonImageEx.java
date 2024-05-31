import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
  public ButtonImageEx() {
    setTitle("레이블 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());

    JLabel textLabel = new JLabel("제임스 고슬링 입니더!");

    ImageIcon img = new ImageIcon("./images/gosling.jpg");
    JLabel imagLabel = new JLabel(img);

    ImageIcon icon = new ImageIcon("images/go.jpg");
    JLabel label = new JLabel("CENTER", icon, SwingConstants.CENTER);
    JLabel foo = new JLabel("RIGHT", icon, SwingConstants.RIGHT);
    JLabel bar = new JLabel("LEFT", icon, SwingConstants.LEFT);

    c.add(textLabel);   c.add(imageLabel);      c.add(label);
  }
}
