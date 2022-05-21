package question6;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BarChartTest {
    public static void Q6(){
        JFrame frame = new JFrame();
        BarChart bar = new BarChart();
        for (int i = 1; i <= 5; i++){
            bar.numberS[i - 1] = JOptionPane.showInputDialog("Enter the length of bar " + i);
            bar.number[i - 1] = Integer.parseInt(bar.numberS[i - 1]);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(bar);
        frame.setSize(550, 550);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Q6();
    }
}
