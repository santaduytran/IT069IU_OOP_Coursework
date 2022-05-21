package question6;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class BarChart extends JPanel{
    public int[] number = new int[5];
    public String[] numberS = new String[5];
    public Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE};
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int y = 20;
        for (int i = 0; i < number.length; i++){
            g.setColor(colors[i]);
            g.fillRect(15, y, number[i], 20);
            y += 30;
        }
    }
}
