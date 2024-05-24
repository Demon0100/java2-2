import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setBounds(130, 50, 200, 20);
        contentPane.add(la);

        for(int i=0; i<10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            contentPane.add(button);
        }

        
        contentPane.add(new JButton("*"));
        contentPane.add(new JButton("0"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
    
}