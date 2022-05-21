package question5.b;

import javax.swing.JFrame;

public class DrawSpiralTest2 {
    public static void main(String[] args) {
        DrawSpiral2 panel = new DrawSpiral2();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
