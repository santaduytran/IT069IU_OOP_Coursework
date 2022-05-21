package question5.a;

import javax.swing.JFrame;

public class DrawSpiralTest1 {
    public static void main(String[] args){
        DrawSpiral1 panel = new DrawSpiral1();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
