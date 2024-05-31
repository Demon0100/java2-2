import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
    public RadioButtonEx() {
        setTitle("라디오 버튼 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        ButtonGroup g = new ButtonGroup();
        ButtonGroup foo = new ButtonGroup();
        ImageIcon normalIcon = new ImageIcon("images/gosling.jpg");
    
        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("체리");
        JRadioButton banana = new JRadioButton("바나나", normalIcon);
    
        g.add(apple);
        g.add(pear);

        foo.add(cherry);
        foo.add(banana);

        c.add(apple); c.add(pear); c.add(cherry); c.add(banana);
        setSize(250,150);
        setVisible(true);
      }
    
      public static void main(String[] args) {
        new RadioButtonEx();
      }
}
