import javax.swing.*;
import java.awt.*;
public class paintJPanelEx extends JFrame {
public paintJPanelEx() {
setTitle("문자열, Color, Font 사용 예제");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setContentPane(new MyPanel());
setSize(500, 500);
setVisible(true);
}
class MyPanel extends JPanel {
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.setColor(Color.BLUE); // 파란색 지정
g.drawRect(10,10,50,50);
g.drawString("자바가 정말 재밋다.~~", 30,80);
g.setFont(new Font("나눔 고딕", Font.BOLD, 30));
g.setColor(new Color(0x00ff00ff)); // 빨간색 지정
g.drawString("16진수 색상 지정?", 30, 120);
g.setColor(new Color(255,0,0));
g.setFont(new Font("Arial", Font.ITALIC, 30));
g.drawString("How much?", 30, 150);
g.drawLine(20, 180, 180, 210);
g.drawOval(20, 230, 80, 120);
g.drawRoundRect(20, 400, 120, 80, 40, 60);
g.fillArc(20,500,80,80,90,270);

int []x={80,40,80,120, 180};
int []y={540,620,700,520, 510};
g.drawPolygon(x, y, 5);
}
}
public static void main(String [] args) {
new paintJPanelEx();
}
}   